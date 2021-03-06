package org.dxctraining.item.dao;

import org.springframework.stereotype.Repository;

import com.dxctraining.item.entites.Item;
import com.dxctraining.item.exceptions.ItemNotFoundException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ItemDaoImpl implements IItemDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Item add(Item item) {
		entityManager.persist(item);
		return item;
	}

	@Override
	public Item findItemById(int id) {
		Item item = entityManager.find(Item.class, id);
		if (item == null) {
			throw new ItemNotFoundException("item not found for the given id" + id);
		}
		return item;
	}

	@Override
	public void remove(int id) {
		Item item = findItemById(id);
		entityManager.remove(item);
	}

}


