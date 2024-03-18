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
	    List<Category> lst = new ArrayList<Category>();
	    Category cate = null;

	    try {
	    	String sql = "Select * from category";
	    	PreparedStatement pstm = conn.prepareStatement(sql);
	        ResultSet rs = pstm.executeQuery();
	        while (rs.next()) {
	        	cate = new Category();
	            cate.setCategoryId(rs.getInt(1));
	            cate.setCategoryName(rs.getString(2));    
	            lst.add(cate);
	        }
	    } catch (SQLException e) {      
	        e.printStackTrace();
	    }

	    return lst;
	}


	@Override
	public Category getCateById(int id) {
		Category cate = null;
		try {
			String sql = "Select * from category where categoryId=?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
	        while (rs.next()) {
	        	cate = new Category();
	            cate.setCategoryId(rs.getInt(1));
	            cate.setCategoryName(rs.getString(2)); 

	        }
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cate;
	}


	@Override
	public boolean updateCate(Category cate) {
	    try {
	        String sql = "update category set categoryName=? where categoryId=?";
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        pstm.setString(1, cate.getCategoryName());
	        pstm.setInt(2, cate.getCategoryId());
	        int i = pstm.executeUpdate();
	        if (i == 1) {
	            return true;
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return false;
	}


	@Override
	public boolean deleteCate(int id) {
		try {
	        String sql = "delete from category where categoryId=?";
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        pstm.setInt(1, id);
	        int i = pstm.executeUpdate();
	        if (i == 1) {
	            return true;
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		return false;
	}


	
	
	
}
