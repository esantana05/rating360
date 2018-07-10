package br.com.uolps.rating360.dao.implementations;

import br.com.uolps.rating360.dao.interfaces.CargoDao;
import br.com.uolps.rating360.domain.Cargo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CargoDaoImpl implements CargoDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Cargo cargo) {
        entityManager.persist(cargo);
    }

    @Override
    public void update(Cargo cargo) {
        entityManager.merge(cargo);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(entityManager.getReference(Cargo.class, id));
    }

    @Override
    public Cargo findById(Long id) {
        return entityManager.find(Cargo.class, id);
    }

    @Override
    public List<Cargo> findAll() {
        return entityManager
                .createQuery("select c from Cargo c", Cargo.class)
                .getResultList();
    }
}
