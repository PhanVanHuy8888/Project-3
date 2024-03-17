package dao;

import java.util.List;

import entity.Category;

public interface CategoryDao {
	public boolean addCate(Category cate);
	public List<Category> getAllCate();
}
