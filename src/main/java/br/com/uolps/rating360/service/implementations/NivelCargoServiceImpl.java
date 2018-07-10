package br.com.uolps.rating360.service.implementations;

import br.com.uolps.rating360.dao.interfaces.NivelCargoDao;
import br.com.uolps.rating360.domain.NivelCargo;
import br.com.uolps.rating360.service.interfaces.NivelCargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NivelCargoServiceImpl implements NivelCargoService {

    @Autowired
    private NivelCargoDao dao;

    @Override
    public void save(NivelCargo nivelCargo) {
        dao.save(nivelCargo);
    }

    @Override
    public void update(Long id, NivelCargo nivelCargo) {
        nivelCargo.setId_niv_cargo(id);
        dao.findById(id);
        dao.update(nivelCargo);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override @Transactional(readOnly = true)
    public NivelCargo findById(Long id) {
        return dao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<NivelCargo> findAll() {
        return dao.findAll();
    }
}
