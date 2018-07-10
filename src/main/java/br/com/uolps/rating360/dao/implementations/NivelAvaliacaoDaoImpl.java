package br.com.uolps.rating360.dao.implementations;


import br.com.uolps.rating360.dao.interfaces.NivelAvaliacaoDao;
import br.com.uolps.rating360.domain.NivelAvaliacao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class NivelAvaliacaoDaoImpl implements NivelAvaliacaoDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(NivelAvaliacao nivelAvaliacao) {
        entityManager.persist(nivelAvaliacao);
    }

    @Override
    public void update(NivelAvaliacao nivelAvaliacao) {
        entityManager.merge(nivelAvaliacao);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(entityManager.getReference(NivelAvaliacao.class, id));
    }

    @Override
    public NivelAvaliacao findById(Long id) {
        return entityManager.find(NivelAvaliacao.class, id);
    }

    @Override
    public List<NivelAvaliacao> findAll() {
        return entityManager
                .createQuery("select n from NivelAvaliacao n", NivelAvaliacao.class)
                .getResultList();
    }
}
