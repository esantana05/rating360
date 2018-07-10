package br.com.uolps.rating360.dao.implementations;


import br.com.uolps.rating360.dao.interfaces.NivelCargoDao;
import br.com.uolps.rating360.domain.NivelCargo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class NivelCargoDaoImpl implements NivelCargoDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(NivelCargo nivelCargo) {
        entityManager.persist(nivelCargo);
    }

    @Override
    public void update(NivelCargo nivelCargo) {
        entityManager.merge(nivelCargo);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(entityManager.getReference(NivelCargo.class, id));
    }

    @Override
    public NivelCargo findById(Long id) {
        return entityManager.find(NivelCargo.class, id);
    }

    @Override
    public List<NivelCargo> findAll() {
        return entityManager
                .createQuery("select n from NivelCargo n", NivelCargo.class)
                .getResultList();
    }
}
