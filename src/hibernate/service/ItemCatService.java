package hibernate.service;
import hibernate.entity.Item_cat;

import java.util.List;

public interface ItemCatService {

    List<Item_cat> getItemCats();

    void saveItemCat(Item_cat aItemCat);

    Item_cat getItemCat(int theId);

    void deleteItemCat(int theId);

    List<Item_cat> getItemCatsByName(String theSearchTerm);
}