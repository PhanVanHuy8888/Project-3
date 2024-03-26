package dao;

import java.util.List;

import entity.Fruit;

public interface FruitDao {
	public boolean addFruit(Fruit fruit);
	public List<Fruit> getAllFruit();
}
