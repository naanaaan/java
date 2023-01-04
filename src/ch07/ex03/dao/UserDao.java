package ch07.ex03.dao;

import ch07.ex03.domain.User;

public interface UserDao {
	public User selectUser();
	public void insertUser(User user); //CREATE는 insert로 표현한다.
	public void updateUser(String userName);
	public void deleteUser(); //DELETE
	
	
	
}
