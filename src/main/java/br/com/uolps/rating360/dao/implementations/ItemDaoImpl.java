package br.com.uolps.rating360.dao.implementations;


import br.com.uolps.rating360.dao.interfaces.ItemDao;
import br.com.uolps.rating360.domain.Item;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ItemDaoImpl implements ItemDao {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public void save(Item item) {
        entityManager.persist(item);
    }

    @Override
    public void update(Item item) {
        entityManager.merge(item);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(entityManager.getReference(Item.class, id));
    }

    @Override
    public Item findById(Long id) {
        return entityManager.find(Item.class, id);
    }

    @Override
    public List<Item> findAll() {
        return entityManager
                .createQuery("select i from Item i", Item.class)
                .getResultList();
    }
}
