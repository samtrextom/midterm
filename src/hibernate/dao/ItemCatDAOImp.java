package hibernate.dao;

import hibernate.entity.Item_cat;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemCatDAOImp implements ItemCatDAO {
    @Autowired
    private SessionFactory factory;

    @Override
    public List<Item_cat> getItemCats() {
        Session session = factory.getCurrentSession();

        List<Item_cat> list = session.createQuery("from Item_cat", Item_cat.class).getResultList();

        return list;
    }

    @Override
    public void saveItemCat(Item_cat aItemCat) {
        Session session = factory.getCurrentSession();

        session.saveOrUpdate(aItemCat);
    }

    @Override
    public Item_cat getItemCat(int theId) {
        Session session = factory.getCurrentSession();

        return session.get(Item_cat.class, theId);
    }

    @Override
    public void deleteItemCat(int theId) {
        Session session = factory.getCurrentSession();

        Query query = session.createQuery("delete from Item_cat where id = :deleteItemCatId");

        query.setParameter("deleteItemCatId", theId);

        query.executeUpdate();
    }

    @Override
    public List<Item_cat> getItemCatsByName(String theSearchTerm) {
        Session session = factory.getCurrentSession();

        Query<Item_cat> query = session.createQuery("from Item_cat where lower(name) like :searchTerm");

        theSearchTerm = "%" + theSearchTerm.toLowerCase() + "%";

        query.setParameter("searchTerm", theSearchTerm);

        return query.getResultList();
    }
}