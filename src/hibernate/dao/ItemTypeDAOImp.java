package hibernate.dao;

import hibernate.entity.Item_type;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemTypeDAOImp implements ItemTypeDAO {
    @Autowired
    private SessionFactory factory;

    @Override
    public List<Item_type> getItemTypes() {
        Session session = factory.getCurrentSession();

        List<Item_type> list = session.createQuery("from Item_type", Item_type.class).getResultList();

        return list;
    }

    @Override
    public void saveItemType(Item_type aItemType) {
        Session session = factory.getCurrentSession();

        session.saveOrUpdate(aItemType);
    }

    @Override
    public Item_type getItemType(int theId) {
        Session session = factory.getCurrentSession();

        return session.get(Item_type.class, theId);
    }

    @Override
    public void deleteItemType(int theId) {
        Session session = factory.getCurrentSession();

        Query query = session.createQuery("delete from Item_type where id = :deleteItemCatId");

        query.setParameter("deleteItemCatId", theId);

        query.executeUpdate();
    }

    @Override
    public List<Item_type> getItemTypesByName(String theSearchTerm) {
        Session session = factory.getCurrentSession();

        Query<Item_type> query = session.createQuery("from Item_type where lower(name) like :searchTerm");

        theSearchTerm = "%" + theSearchTerm.toLowerCase() + "%";

        query.setParameter("searchTerm", theSearchTerm);

        return query.getResultList();
    }
}