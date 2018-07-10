package br.com.uolps.rating360.service.implementations;

import br.com.uolps.rating360.dao.interfaces.CriterioAvaliativoDao;
import br.com.uolps.rating360.domain.CriterioAvaliativo;
import br.com.uolps.rating360.service.interfaces.CriterioAvaliativoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CriterioAvaliativoServiceImpl implements CriterioAvaliativoService {

    @Autowired
    private CriterioAvaliativoDao dao;

    @Override
    public void save(CriterioAvaliativo criterioAvaliativo) {
        dao.save(criterioAvaliativo);
    }

    @Override
    public void update(Long id, CriterioAvaliativo criterioAvaliativo) {
        criterioAvaliativo.setPk(id);
        dao.findById(id);
        dao.update(criterioAvaliativo);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override @Transactional(readOnly = true)
    public CriterioAvaliativo findById(Long id) {
        return dao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<CriterioAvaliativo> findAll() {
        return dao.findAll();
    }
}
