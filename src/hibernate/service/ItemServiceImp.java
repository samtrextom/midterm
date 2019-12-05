package hibernate.service;

import hibernate.dao.ItemDAO;
import hibernate.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ItemServiceImp implements ItemService {
    @Autowired
    private ItemDAO itemDAO;

    @Override
    @Transactional
    public List<Item> getItems() {
        return itemDAO.getItems();
    }

    @Override
    @Transactional
    public List<Item> getArmoryItems() { return itemDAO.getArmoryItems(); }

    @Override
    @Transactional
    public List<Item> getPotionItems() {
        return itemDAO.getPotionItems();
    }

    @Override
    @Transactional
    public List<Item> getCraftingItems() {
        return itemDAO.getCraftingItems();
    }

    @Override
    @Transactional
    public List<Item> getMiscItems() {
        return itemDAO.getMiscItems();
    }

    @Override
    @Transactional
    public void saveItem(Item aItem) {

        itemDAO.saveItem(aItem);
    }

    @Override
    @Transactional
    public Item getItem(int theId) {
        return itemDAO.getItem(theId);
    }

    @Override
    @Transactional
    public void deleteItem(int theId) {
        itemDAO.deleteItem(theId);
    }

    @Override
    @Transactional
    public List<Item> getItemsByName(String theSearchTerm) {
        return itemDAO.getItemsByName(theSearchTerm);
    }
}