package br.com.uolps.rating360.dao.implementations;

import br.com.uolps.rating360.dao.interfaces.TipoAvaliacaoDao;
import br.com.uolps.rating360.domain.TipoAvaliacao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class TipoAvaliacaoDaoImpl implements TipoAvaliacaoDao {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public void save(TipoAvaliacao tipoAvaliacao) {
        entityManager.persist(tipoAvaliacao);
    }

    @Override
    public void update(TipoAvaliacao tipoAvaliacao) {
        entityManager.merge(tipoAvaliacao);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(entityManager.getReference(TipoAvaliacao.class, id));
    }

    @Override
    public TipoAvaliacao findById(Long id) {
        return entityManager.find(TipoAvaliacao.class, id);
    }

    @Override
    public List<TipoAvaliacao> findAll() {
        return entityManager
                .createQuery("select t from TipoAvaliacao t", TipoAvaliacao.class)
                .getResultList();
    }
}
