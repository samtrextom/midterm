package hibernate.service;

import hibernate.entity.Item;

import java.util.List;

public interface ItemService {
    List<Item> getItems();

    List<Item> getArmoryItems();

    List<Item> getPotionItems();

    List<Item> getCraftingItems();

    List<Item> getMiscItems();

    void saveItem(Item aItem);

    Item getItem(int theId);

    void deleteItem(int theId);

    List<Item> getItemsByName(String theSearchTerm);
}