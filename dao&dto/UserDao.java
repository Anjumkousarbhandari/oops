package oops;

public interface UserDao {
	public User getUser(String name);
	public void saveUser(String email);
	public void updateUser(String password);
	public void deleteUser(String cnfpasword);
	public User[] getAllUsers();
	public void saveUser(int i);

}
