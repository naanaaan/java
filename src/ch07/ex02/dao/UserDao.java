package ch07.ex02.dao;

import ch07.ex02.domain.User;

public interface UserDao {
	public User selectUser(); //select는 약속이다 read의 의미
	
}
