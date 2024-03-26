package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import entity.Fruit;

public class FruitDaoImpl implements FruitDao{
	
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
		}catch(Exception e) {
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
	
	
	
	
}
