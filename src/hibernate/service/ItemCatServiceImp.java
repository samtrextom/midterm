package hibernate.service;

import hibernate.dao.ItemCatDAO;
import hibernate.entity.Item_cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ItemCatServiceImp implements ItemCatService {
    @Autowired
    private ItemCatDAO itemCatDAO;

    @Override
    @Transactional
    public List<Item_cat> getItemCats() {
        return itemCatDAO.getItemCats();
    }

    @Override
    @Transactional
    public void saveItemCat(Item_cat aItemCat) {

        itemCatDAO.saveItemCat(aItemCat);
    }

    @Override
    @Transactional
    public Item_cat getItemCat(int theId) {
        return itemCatDAO.getItemCat(theId);
    }

    @Override
    @Transactional
    public void deleteItemCat(int theId) {
        itemCatDAO.deleteItemCat(theId);
    }

    @Override
    @Transactional
    public List<Item_cat> getItemCatsByName(String theSearchTerm) {
        return itemCatDAO.getItemCatsByName(theSearchTerm);
    }
}