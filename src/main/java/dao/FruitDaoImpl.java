package dao;

import java.sql.*;

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
			String sql = "insert into fruit(fruitName, origin, price, photo, categoryFruitId) value(?,?,?,?,?)";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, fruit.getFruitName());
			pstm.setString(1, fruit.getOrigin());
			pstm.setString(1, fruit.getPrice());
			pstm.setString(1, fruit.getFruitCategory());
			pstm.setString(1, fruit.getPhoto());
			

			int i = pstm.executeUpdate();
			if (i == 1) {
				return true;
			}
		}catch(Exception e) {
			e.getStackTrace();	
		}
		
		return false;
	}
	
}
