package br.com.uolps.rating360.service.implementations;

import br.com.uolps.rating360.dao.interfaces.ClasseDao;
import br.com.uolps.rating360.domain.Classe;
import br.com.uolps.rating360.service.interfaces.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClasseServiceImpl implements ClasseService {

    @Autowired
    private ClasseDao dao;

    @Override
    public void save(Classe classe) {
        dao.save(classe);
    }

    @Override
    public void update(Long id, Classe classe) {
        classe.setId_classe(id);
        dao.findById(id);
        dao.update(classe);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override @Transactional(readOnly = true)
    public Classe findById(Long id) {
        return dao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<Classe> findAll() {
        return dao.findAll();
    }
}
