package ch07.ex02.service;

import ch07.ex02.dao.UserDao;
import ch07.ex02.domain.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao; //인터페이스가져오는이유는 다형성때문에
	
	public UserServiceImpl(UserDao userDao) { //DI(Dependency Injection)
		this.userDao = userDao;
	}
	
	@Override
	public User getUser() {
		return userDao.selectUser();
	}
}
