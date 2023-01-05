package practice.model2.dao;

import practice.model2.domain.User;

public class DaoImpl implements Dao{
	
	
	public String selectUser() {
		return new User().getUserName();
	}
}
