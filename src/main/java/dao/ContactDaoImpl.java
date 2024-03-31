package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import entity.Contact;

public class ContactDaoImpl implements ContactDao{
	
	private Connection conn;
	
	

	public ContactDaoImpl(Connection conn) {
		super();
		this.conn = conn;
	}



	@Override
	public boolean addContact(Contact contact) {
		try {
			String sql = "insert into contact(name, email, message) values(?,?,?)";
			PreparedStatement p = conn.prepareStatement(sql);
			p.setString(1, contact.getName());
			p.setString(2, contact.getEmail());
			p.setString(3, contact.getMessage());
			int i = p.executeUpdate();
			if (i == 1) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	

}
