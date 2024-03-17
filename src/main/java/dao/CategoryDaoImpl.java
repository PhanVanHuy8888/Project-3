package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import entity.Category;

public class CategoryDaoImpl implements CategoryDao{

	private Connection conn;

	public CategoryDaoImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	
	public boolean addCate(Category cate) {
		try {
			String sql = "insert into category(categoryName) value(?)";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, cate.getCategoryName());
			int i = pstm.executeUpdate();
			if (i == 1) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public List<Category> getAllCate() {
	    List<Category> lst = new ArrayList<>();

	    try (
	    	PreparedStatement pstm = conn.prepareStatement("SELECT categoryName FROM category");
	         ResultSet rs = pstm.executeQuery()) {

	        while (rs.next()) {
	            String categoryName = rs.getString("categoryName");
	            Category cate = new Category();
	            cate.setCategoryName(categoryName);
	            lst.add(cate);
	        }
	    } catch (SQLException e) {      
	        e.printStackTrace();
	    }

	    return lst;
	}

	
	
	
}
