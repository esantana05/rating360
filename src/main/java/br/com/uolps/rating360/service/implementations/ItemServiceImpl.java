package br.com.uolps.rating360.service.implementations;

import br.com.uolps.rating360.dao.interfaces.ItemDao;
import br.com.uolps.rating360.domain.Item;
import br.com.uolps.rating360.service.interfaces.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao dao;

    @Override
    public void save(Item item) {
        dao.save(item);
    }

    @Override
    public void update(Long id, Item item) {
        item.setId_item(id);
        dao.findById(id);
        dao.update(item);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override @Transactional(readOnly = true)
    public Item findById(Long id) {
        return dao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<Item> findAll() {
        return dao.findAll();
    }
}
