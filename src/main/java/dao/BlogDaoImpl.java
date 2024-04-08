package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Blog;
import entity.CategoryFruit;

public class BlogDaoImpl implements BlogDao {

	private Connection conn;

	public BlogDaoImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public boolean addBlog(Blog blog) {
		try {
			String sql = "Insert into blog(title, description, image) values(?,?,?)";
			PreparedStatement p = conn.prepareStatement(sql);
			p.setString(1, blog.getTitle());
			p.setString(2, blog.getDescription());
			p.setString(3, blog.getImage());
			int i = p.executeUpdate();
			if (i == 1) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Blog> getAllBlog() {
		List<Blog> lst = new ArrayList<Blog>();
		Blog blog = null;
		try {
			String sql = "Select * from blog";
			PreparedStatement p = conn.prepareStatement(sql);
			ResultSet rs = p.executeQuery();
			while (rs.next()) {
				blog = new Blog();
				blog.setId(rs.getInt(1));
				blog.setTitle(rs.getString(2));
				blog.setDescription(rs.getString(3));
				blog.setImage(rs.getString(4));
				lst.add(blog);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lst;
	}

	@Override
	public Blog getBlog(int id) {
		Blog blog = null;
		try {
			String sql = "Select * from blog where id=? ";
			PreparedStatement p = conn.prepareStatement(sql);
			p.setInt(1, id);
			ResultSet rs = p.executeQuery();
			while (rs.next()) {
				blog = new Blog();
				blog.setId(rs.getInt(1));
				blog.setTitle(rs.getString(2));
				blog.setDescription(rs.getString(3));
				blog.setImage(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return blog;
	}

	@Override
	public boolean updateBlog(Blog blog) {
		try {
			String sql = "UPDATE blog SET title=?, description=?, image=? WHERE id=?";
			PreparedStatement p = conn.prepareStatement(sql);
			p.setString(1, blog.getTitle());
			p.setString(2, blog.getDescription());
			p.setString(3, blog.getImage());
			p.setInt(4, blog.getId()); 
			int i = p.executeUpdate();
			if (i == 1) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteBlog(int id) {
		try {
			String sql = "delete from blog where id=?";
			PreparedStatement p = conn.prepareStatement(sql);
			p.setInt(1, id);
			int i = p.executeUpdate();
			if (i == 1) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
