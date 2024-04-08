package dao;

import java.util.List;

import entity.Blog;
import entity.CategoryFruit;

public interface BlogDao {
	public boolean addBlog(Blog blog);
	public List<Blog> getAllBlog();
	public Blog getBlog(int id);
	public boolean updateBlog(Blog blog);
	public boolean deleteBlog(int id);
	
}
