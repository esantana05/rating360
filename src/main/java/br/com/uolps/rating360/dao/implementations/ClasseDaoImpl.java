package br.com.uolps.rating360.dao.implementations;

import br.com.uolps.rating360.dao.interfaces.ClasseDao;
import br.com.uolps.rating360.domain.Classe;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ClasseDaoImpl implements ClasseDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void save(Classe classe) {
        entityManager.persist(classe);
    }

    @Override
    public void update(Classe classe) {
        entityManager.merge(classe);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(entityManager.getReference(Classe.class, id));
    }

    @Override
    public Classe findById(Long id) {
        return entityManager.find(Classe.class, id);
    }

    @Override
    public List<Classe> findAll() {
        return entityManager
                .createQuery("select c from Classe c", Classe.class)
                .getResultList();
    }
}
