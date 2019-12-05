package hibernate.dao;

import hibernate.entity.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemDAOImp implements ItemDAO {
    @Autowired
    private SessionFactory factory;

    @Override
    public List<Item> getItems() {
        Session session = factory.getCurrentSession();

        List<Item> list = session.createQuery("from Item", Item.class).getResultList();

        if(list == null){list.add(new Item("No Items Found"));}

        return list;
    }

    @Override
    public List<Item> getArmoryItems() {
        Session session = factory.getCurrentSession();

        List<Item> list = session.createQuery("from Item where item_cat.id = 3", Item.class).getResultList();

        if(list == null){list.add(new Item("No Items Found"));}

        return list;
    }

    @Override
    public List<Item> getPotionItems() {
        Session session = factory.getCurrentSession();

        Query query= session.createQuery("from Item where item_cat.id= 2", Item.class);

        if(query == null){
             ArrayList<Item> list = new ArrayList<Item>();
             list.add(new Item("No Items Found"));
             return list;
        }

        return query.getResultList();
    }

    @Override
    public List<Item> getCraftingItems() {
        Session session = factory.getCurrentSession();

        List<Item> list = session.createQuery("from Item where item_cat.id = 1 ", Item.class).getResultList();

        if(list == null){list.add(new Item("No Items Found"));}

        return list;
    }

    @Override
    public List<Item> getMiscItems() {
        Session session = factory.getCurrentSession();

        List<Item> list = session.createQuery("from Item where item_cat.id= 4", Item.class).getResultList();

        if(list == null){list.add(new Item("No Items Found"));}

        return list;
    }

    @Override
    public void saveItem(Item aItem) {
        Session session = factory.getCurrentSession();

        session.saveOrUpdate(aItem);
    }

    @Override
    public Item getItem(int theId) {
        Session session = factory.getCurrentSession();

        return session.get(Item.class, theId);
    }

    @Override
    public void deleteItem(int theId) {
        Session session = factory.getCurrentSession();

        Query query = session.createQuery("delete from Item where id = :deleteItemId");

        query.setParameter("deleteItemId", theId);

        query.executeUpdate();
    }

    @Override
    public List<Item> getItemsByName(String theSearchTerm) {
        Session session = factory.getCurrentSession();

        Query query;

        if(theSearchTerm != null)
        {
            query = session.createQuery("from Item where lower(name) like :searchTerm");

            theSearchTerm = "%" + theSearchTerm.toLowerCase() + "%";

            query.setParameter("searchTerm", theSearchTerm);

        }
        else
        {
            query = session.createQuery("from Item", Item.class);
        }


        return query.getResultList();
    }
}