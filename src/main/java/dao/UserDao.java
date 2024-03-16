package dao;

import entity.User;

public interface UserDao {
	public boolean userRegis(User us);
	public User login(String email, String password);
}
