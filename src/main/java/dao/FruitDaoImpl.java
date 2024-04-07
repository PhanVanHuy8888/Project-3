package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import entity.Fruit;

public class FruitDaoImpl implements FruitDao {

	private Connection conn;

	public FruitDaoImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public boolean addFruit(Fruit fruit) {
		try {
			String sql = "insert into fruit(fruitName, origin, price, photo, categoryFruitId, description) values(?,?,?,?,?,?)";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, fruit.getFruitName());
			pstm.setString(2, fruit.getOrigin());
			pstm.setFloat(3, fruit.getPrice());
			pstm.setString(4, fruit.getPhoto());
			pstm.setInt(5, fruit.getCategoryFruitId());
			pstm.setString(6, fruit.getDescription());
			int i = pstm.executeUpdate();
			if (i == 1) {
				return true;
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

		return false;
	}

	@Override
	public List<Fruit> getAllFruit() {
		List<Fruit> lst = new ArrayList<Fruit>();
		Fruit fruit = null;

		try {
			String sql = "Select * from fruit";
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				fruit = new Fruit();
				fruit.setFruitId(rs.getInt(1));
				fruit.setFruitName(rs.getString(2));
				fruit.setOrigin(rs.getString(3));
				fruit.setPrice(rs.getFloat(4));
				fruit.setPhoto(rs.getString(5));
				fruit.setCategoryFruitId(rs.getInt(6));
				fruit.setDescription(rs.getString(7));
				lst.add(fruit);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lst;
	}

	@Override
	public List<Fruit> getFruitsByCategoryId(int categoryId) {
		List<Fruit> lst = new ArrayList<Fruit>();

		try {
			String sql = "SELECT * FROM fruit WHERE categoryFruitId = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, categoryId);
			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				Fruit fruit = new Fruit();
				fruit.setFruitId(rs.getInt("fruitId"));
				fruit.setFruitName(rs.getString("fruitName"));
				fruit.setOrigin(rs.getString("origin"));
				fruit.setPrice(rs.getFloat("price"));
				fruit.setPhoto(rs.getString("photo"));
				fruit.setCategoryFruitId(rs.getInt("categoryFruitId"));
				fruit.setDescription(rs.getString("description"));
				lst.add(fruit);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lst;
	}

	@Override
	public Fruit getFruitById(int id) {
		Fruit fruit = null;
		try {
			String sql = "Select * from fruit where fruitId=?";
			PreparedStatement p = conn.prepareStatement(sql);
			p.setInt(1, id);
			ResultSet rs = p.executeQuery();
			while (rs.next()) {
				fruit = new Fruit();
				fruit.setFruitId(rs.getInt(1));
				fruit.setFruitName(rs.getString(2));
				fruit.setOrigin(rs.getString(3));
				fruit.setPrice(rs.getFloat(4));
				fruit.setPhoto(rs.getString(5));
				fruit.setCategoryFruitId(rs.getInt(6));
				fruit.setDescription(rs.getString(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return fruit;
	}

	@Override
	public boolean updateFruit(Fruit fruit) {
		try {
			String sql = "update fruit set fruitName=?, origin=?, price=?, photo=?, categoryFruitId=?, description=? where fruitId=?";
			PreparedStatement p = conn.prepareStatement(sql);
			p.setString(1, fruit.getFruitName());
			p.setString(2, fruit.getOrigin());
			p.setFloat(3, fruit.getPrice());
			p.setString(4, fruit.getPhoto());
			p.setInt(5, fruit.getCategoryFruitId());
			p.setString(6, fruit.getDescription());
			p.setInt(7, fruit.getFruitId());
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
	public boolean deleteFruit(int id) {
		try {
			String sql = "delete from fruit where fruitId=?";
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

	@Override
	public List<Fruit> searchFruit(String nameFruit) {
		List<Fruit> lst = new ArrayList<Fruit>();
		try {
			String sql = "Select * from fruit where fruitName like ?";
			PreparedStatement p = conn.prepareStatement(sql);
			p.setString(1, "%" + nameFruit + "%");
			ResultSet rs = p.executeQuery();

			while (rs.next()) {
				Fruit fruit = new Fruit();
				fruit.setFruitId(rs.getInt("fruitId"));
				fruit.setFruitName(rs.getString("fruitName"));
				fruit.setOrigin(rs.getString("origin"));
				fruit.setPrice(rs.getFloat("price"));
				fruit.setPhoto(rs.getString("photo"));
				fruit.setCategoryFruitId(rs.getInt("categoryFruitId"));
				fruit.setDescription(rs.getString("description"));
				lst.add(fruit);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lst;
		
	}

}
