package hibernate.dao;
import hibernate.entity.Item_type;

import java.util.List;

public interface ItemTypeDAO {

    List<Item_type> getItemTypes();

    void saveItemType(Item_type aItemType);

    Item_type getItemType(int theId);

    void deleteItemType(int theId);

    List<Item_type> getItemTypesByName(String theSearchTerm);
}