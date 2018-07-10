package br.com.uolps.rating360.dao.implementations;

import br.com.uolps.rating360.dao.interfaces.CriterioAvaliativoDao;
import br.com.uolps.rating360.domain.CriterioAvaliativo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class CriterioAvaliativoDaoImpl implements CriterioAvaliativoDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(CriterioAvaliativo criterioAvaliativo) {
        entityManager.persist(criterioAvaliativo);
    }

    @Override
    public void update(CriterioAvaliativo criterioAvaliativo) {
        entityManager.merge(criterioAvaliativo);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(entityManager.getReference(CriterioAvaliativo.class, id));
    }

    @Override
    public CriterioAvaliativo findById(Long id) {
        return entityManager.find(CriterioAvaliativo.class, id);
    }

    @Override
    public List<CriterioAvaliativo> findAll() {
        return entityManager
                .createQuery("select c from CriterioAvaliativo c", CriterioAvaliativo.class)
                .getResultList();
    }
}
