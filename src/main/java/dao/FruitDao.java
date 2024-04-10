package dao;

import java.util.List;

import entity.CategoryFruit;
import entity.Fruit;

public interface FruitDao {
	public boolean addFruit(Fruit fruit);
	public List<Fruit> getAllFruit();
	
	public Fruit getFruitById(int id);
	public boolean updateFruit(Fruit fruit);
	public boolean deleteFruit(int id);
	public List<Fruit> getFruitsByCategoryId(int categoryId);
	public List<Fruit> searchFruit(String nameFruit);
}
