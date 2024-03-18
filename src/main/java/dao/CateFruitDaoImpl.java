package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entity.CategoryFruit;

public class CateFruitDaoImpl implements CateFruitDao {

	private Connection conn;

	public CateFruitDaoImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public boolean addCateFruit(CategoryFruit cateFruit) {
		try {
			String sql = "insert into categoryfruit(categoryFruitId, categoryFruitName) value(?, ?)";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, cateFruit.getCategoryFruitId());
			pstm.setString(2, cateFruit.getCategoryFruitName());
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
	public List<CategoryFruit> getAllCateFruit() {
		List<CategoryFruit> lst = new ArrayList<CategoryFruit>();

		try {
			String sql = "SELECT * FROM categoryfruit";
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				CategoryFruit cateFruit = new CategoryFruit();
				cateFruit.setCategoryFruitId(rs.getString("categoryFruitId"));
				cateFruit.setCategoryFruitName(rs.getString("categoryFruitName"));
				lst.add(cateFruit);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// Xử lý ngoại lệ nếu cần
		}

		return lst;
	}

	@Override
	public CategoryFruit getCateFruitById(String id) {
		CategoryFruit cateFruit = null;
		try {
			String sql = "Select * from categoryfruit where categoryFruitId=?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, id);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				cateFruit = new CategoryFruit();
				cateFruit.setCategoryFruitId(rs.getString(1));
				cateFruit.setCategoryFruitName(rs.getString(2));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return cateFruit;
	}

	@Override
	public boolean updateCateFruit(CategoryFruit cateFruit) {
		try {
			String sql = "update categoryfruit set categoryFruitName=? where categoryFruitId=?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, cateFruit.getCategoryFruitName());
			pstm.setString(2, cateFruit.getCategoryFruitId());
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
	public boolean deleteCateFruit(String id) {
		try {
			String sql = "delete from categoryfruit where categoryFruitId=?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, id);
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
