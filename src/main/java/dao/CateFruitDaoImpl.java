package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Category;
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
			String sql = "insert into categoryfruit(categoryFruitName) value(?)";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, cateFruit.getCategoryFruitName());
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
		CategoryFruit cateFruit = null;

		try {
			String sql = "Select * from categoryfruit";
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				cateFruit = new CategoryFruit();
				cateFruit.setCategoryFruitId(rs.getInt(1));
				cateFruit.setCategoryFruitName(rs.getString(2));
				lst.add(cateFruit);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lst;
	}

	@Override
	public CategoryFruit getCateFruitById(int id) {
		CategoryFruit cateFruit = null;
		try {
			String sql = "Select * from categoryfruit where categoryFruitId=?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				cateFruit = new CategoryFruit();
				cateFruit.setCategoryFruitId(rs.getInt(1));
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
			pstm.setInt(2, cateFruit.getCategoryFruitId());
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
	public boolean deleteCateFruit(int id) {
		try {
			String sql = "delete from categoryfruit where categoryFruitId=?";
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

	public int findCategoryFruitIdByCategoryFruitName(String categoryFruitName) throws SQLException {
		int categoryFruitId = -1; // Default value if category is not found
		String query = "SELECT categoryFruitId FROM categoryfruit WHERE categoryFruitName = ?";
		try (PreparedStatement statement = conn.prepareStatement(query)) {
			statement.setString(1, categoryFruitName);
			try (ResultSet resultSet = statement.executeQuery()) {
				if (resultSet.next()) {
					categoryFruitId = resultSet.getInt("categoryFruitId");
				}
			}
		}
		return categoryFruitId;
	}

	@Override
	public String getCateFruitNameById(int id) {
		String categoryFruitName = null;
		try {

			String sql = "SELECT categoryFruitName FROM categoryfruit WHERE categoryFruitId = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				categoryFruitName = rs.getString("categoryFruitName");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return categoryFruitName;
	}

}
