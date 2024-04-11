package dao;

import java.util.List;

import entity.User;

public interface UserDao {
	public boolean userRegis(User us);
	public User login(String email, String password);
	public boolean updateUser(User us);
	public List<User> getAllUser();
	public boolean deleteUser(int id);
}
