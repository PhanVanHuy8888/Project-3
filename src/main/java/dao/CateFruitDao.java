package dao;

import java.util.List;

import entity.CategoryFruit;

public interface CateFruitDao {
	public boolean addCateFruit(CategoryFruit cateFruit);
	public List<CategoryFruit> getAllCateFruit();
	public CategoryFruit getCateFruitById(String id);
	public boolean updateCateFruit(CategoryFruit cateFruit);
	public boolean deleteCateFruit(String id);
}
