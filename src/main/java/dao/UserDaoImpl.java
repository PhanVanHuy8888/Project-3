package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import entity.User;

public class UserDaoImpl implements UserDao {
	private Connection conn;

	public UserDaoImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean userRegis(User us) {
		try {
			String sql = "insert into user(name, email, password, address, phone) value(?,?,?,?,?)";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, us.getName());
			pstm.setString(2, us.getEmail());
			pstm.setString(3, us.getPassword());
			pstm.setString(4, us.getAddress());
			pstm.setString(5, us.getPhone());

			int i = pstm.executeUpdate();
			if (i == 1) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public User login(String email, String password) {
		User us = null;

		try {
			String sql = "SELECT * FROM user WHERE email=? AND password=?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, email);
			pstm.setString(2, password);

			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				us = new User();
				us.setId(rs.getInt(1));
				us.setName(rs.getString(2));
				us.setEmail(rs.getString(3));
				us.setPassword(rs.getString(4));
				us.setAddress(rs.getString(5));
				us.setPhone(rs.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return us;
	}

	@Override
	public boolean updateUser(User us) {
		try {
			String sql = "update user set name=?, email=?, address=?, phone=? where id=?";
			PreparedStatement p = conn.prepareStatement(sql);
			p.setString(1, us.getName());
			p.setString(2, us.getEmail());
			p.setString(3, us.getAddress());
			p.setString(4, us.getPhone());
			p.setInt(5, us.getId());
			int i = p.executeUpdate();
			if (i == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<User> getAllUser() {
		List<User> lst = new ArrayList<User>();
		try {
			String sql = "select * from user";
			PreparedStatement p = conn.prepareStatement(sql);
			ResultSet rs = p.executeQuery();
			while(rs.next()) {
				User u = new User();
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setAddress(rs.getString(4));
				u.setPhone(rs.getString(5));
				lst.add(u);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return lst;
	}
	

	@Override
	public boolean deleteUser(int id) {
		try {
			String sql = "delete from user where id=?";
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
