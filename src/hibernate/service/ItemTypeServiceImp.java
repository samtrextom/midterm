package hibernate.service;

import hibernate.dao.ItemTypeDAO;
import hibernate.entity.Item_type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ItemTypeServiceImp implements ItemTypeService {
    @Autowired
    private ItemTypeDAO itemTypeDAO;

    @Override
    @Transactional
    public List<Item_type> getItemTypes() {
        return itemTypeDAO.getItemTypes();
    }

    @Override
    @Transactional
    public void saveItemType(Item_type aItemType) {

        itemTypeDAO.saveItemType(aItemType);
    }

    @Override
    @Transactional
    public Item_type getItemType(int theId) {
        return itemTypeDAO.getItemType(theId);
    }

    @Override
    @Transactional
    public void deleteItemType(int theId) {
        itemTypeDAO.deleteItemType(theId);
    }

    @Override
    @Transactional
    public List<Item_type> getItemTypesByName(String theSearchTerm) {
        return itemTypeDAO.getItemTypesByName(theSearchTerm);
    }
}