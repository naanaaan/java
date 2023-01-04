package ch07.ex03.service;

import ch07.ex03.domain.User;

public interface UserService {
//	service에서의 약속
	public User getUser();
	public void addUser(User user); //add는 추가
	public void fixUser(String userName);
	public void delUser();
}
