package br.com.uolps.rating360.service;

import br.com.uolps.rating360.dao.CargoDao;
import br.com.uolps.rating360.domain.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CargoServiceImpl implements CargoService {

    @Autowired
    private CargoDao dao;

    @Override
    public void save(Cargo cargo) {
        dao.save(cargo);
    }

    @Override
    public void update(Long id, Cargo cargo) {
        cargo.setId_cargo(id);
        dao.findById(id);
        dao.update(cargo);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override @Transactional(readOnly = true)
    public Cargo findById(Long id) {
        return dao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<Cargo> findAll() {
        return dao.findAll();
    }
}
