package hibernate.controller;

import hibernate.entity.Item;
import hibernate.service.ItemCatService;
import hibernate.service.ItemService;
import hibernate.service.ItemTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @Autowired
    private ItemCatService itemCatService;

    @Autowired
    private ItemTypeService itemTypeService;

    @GetMapping("/search")
    public String search(@RequestParam("searchTerm") String theSearchTerm,
                         Model theModel) {
        List<Item> list = itemService.getItemsByName(theSearchTerm);

        theModel.addAttribute("items", list);

        return "list-items";
    }

    @GetMapping("/delete")
    public String deleteItem(@RequestParam("itemId") int theId) {
        itemService.deleteItem(theId);

        return "redirect:/item/list";
    }

    @RequestMapping("/showUpdateItemForm")
    public String showUpdateItemForm(@RequestParam("itemId") int theId,
                                      Model theModel) {
        Item theItem = itemService.getItem(theId);

        theModel.addAttribute("aItem", theItem);
        theModel.addAttribute("categories", itemCatService.getItemCats());
        theModel.addAttribute("types", itemTypeService.getItemTypes());

        return "update-item-form";
    }

    @RequestMapping("/list")
    public String listItems(Model theModel) {
        List<Item> itemList = itemService.getItems();

        theModel.addAttribute("items", itemList);

        return "list-items";
    }

    @RequestMapping("/list/armory")
    public String listArmoryItems(Model theModel) {
        List<Item> itemList = itemService.getArmoryItems();

        theModel.addAttribute("items", itemList);

        return "armory";
    }

    @RequestMapping("/list/pots")
    public String listPotionItems(Model theModel) {
        List<Item> itemList = itemService.getPotionItems();

        theModel.addAttribute("items", itemList);

        return "pots";
    }

    @RequestMapping("/list/craft")
    public String listCraftingItems(Model theModel) {
        List<Item> itemList = itemService.getCraftingItems();

        theModel.addAttribute("items", itemList);

        return "craft";
    }

    @RequestMapping("/list/misc")
    public String listMiscItems(Model theModel) {
        List<Item> itemList = itemService.getMiscItems();

        theModel.addAttribute("items", itemList);

        return "misc";
    }

    @GetMapping("/showAddItemForm")
    public String showAddItemForm(Model theModel) {
        Item newItem = new Item();

        theModel.addAttribute("aItem", newItem);
        theModel.addAttribute("categories", itemCatService.getItemCats());
        theModel.addAttribute("types", itemTypeService.getItemTypes());

        return "add-item-form";
    }

    @PostMapping("/save")
    public String saveItem(@Valid @ModelAttribute(name = "aItem") Item theItem,
                            BindingResult bindingResult,
                            Model theModel) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult);
            theModel.addAttribute("types", itemTypeService.getItemTypes());
            theModel.addAttribute("categories", itemCatService.getItemCats());
            return "add-item-form";
        }

        if(theItem.getName()==null)
        {
            theItem.setName("No Name Given");
        }

        itemService.saveItem(theItem);
        return "redirect:/item/list";
    }

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor ste = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, ste);
    }

}