package dao;

import java.util.List;
import entity.CategoryFruit;

public interface CateFruitDao {
	public boolean addCateFruit(CategoryFruit cateFruit);
	public List<CategoryFruit> getAllCateFruit();
	public CategoryFruit getCateFruitById(int id);
	public boolean updateCateFruit(CategoryFruit cateFruit);
	public boolean deleteCateFruit(int id);
}
