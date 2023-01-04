package ch07.ex02.service;

import ch07.ex02.domain.User;

public interface UserService { //service앞에 User는 업무명
	public User getUser(); //서비스의 read는 get
}
