package br.com.uolps.rating360.service.implementations;


import br.com.uolps.rating360.dao.interfaces.NivelAvaliacaoDao;
import br.com.uolps.rating360.domain.NivelAvaliacao;
import br.com.uolps.rating360.service.interfaces.NivelAvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NivelAvaliacaoServiceImpl implements NivelAvaliacaoService {

    @Autowired
    private NivelAvaliacaoDao dao;

    @Override
    public void save(NivelAvaliacao nivelAvaliacao) {
        dao.save(nivelAvaliacao);
    }

    @Override
    public void update(Long id, NivelAvaliacao nivelAvaliacao) {
        nivelAvaliacao.setId_nivel(id);
        dao.findById(id);
        dao.update(nivelAvaliacao);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override @Transactional(readOnly = true)
    public NivelAvaliacao findById(Long id) {
        return dao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<NivelAvaliacao> findAll() {
        return dao.findAll();
    }
}
