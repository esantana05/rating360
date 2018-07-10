package br.com.uolps.rating360.service.implementations;

import br.com.uolps.rating360.dao.interfaces.TipoAvaliacaoDao;
import br.com.uolps.rating360.domain.TipoAvaliacao;
import br.com.uolps.rating360.service.interfaces.TipoAvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TipoAvaliacaoServiceImpl implements TipoAvaliacaoService {

    @Autowired
    private TipoAvaliacaoDao dao;

    @Override
    public void save(TipoAvaliacao tipoAvaliacao) {
        dao.save(tipoAvaliacao);
    }

    @Override
    public void update(Long id, TipoAvaliacao tipoAvaliacao) {
        tipoAvaliacao.setId_tipo(id);
        dao.findById(id);
        dao.update(tipoAvaliacao);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override @Transactional(readOnly = true)
    public TipoAvaliacao findById(Long id) {
        return dao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<TipoAvaliacao> findAll() {
        return dao.findAll();
    }
}
