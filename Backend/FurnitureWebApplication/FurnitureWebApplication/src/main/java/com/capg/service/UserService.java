package com.capg.service;

import java.util.List;

import com.capg.model.User;
public interface UserService {
	User addUser(User user);
	User updateUser(User user);
	String removeUserById(int user_id);
	List<User> showAllUsers();
    User showUserById(int user_id);
    boolean validateUser(String userName, String password);
}
