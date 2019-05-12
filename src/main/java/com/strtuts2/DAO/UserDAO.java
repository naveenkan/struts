package com.strtuts2.DAO;

import com.struts.model.User;

public interface UserDAO {

	public User getUserByCredentials(String userId, String password);
}
