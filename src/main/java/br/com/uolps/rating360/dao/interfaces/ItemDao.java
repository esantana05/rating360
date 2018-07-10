package br.com.uolps.rating360.dao.interfaces;

import br.com.uolps.rating360.domain.Item;

import java.util.List;

public interface ItemDao {

    void save(Item item);

    void update(Item item);

    void delete(Long id);

    Item findById(Long id);

    List<Item> findAll();

}
