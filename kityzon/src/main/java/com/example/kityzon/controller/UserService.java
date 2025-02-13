package com.example.kityzon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.SessionScope;

import com.example.kityzon.dao.UserDao;
import com.example.kityzon.model.User;


/**
 * This class calls the method from the repository to save/find/update/delete
 * data from the database
 */
@Service
//@ApplicationScope
@SessionScope
public class UserService {

	@Autowired
	private UserDao userDao;

	public boolean login(String username, String password) {
		return userDao.validUserAndPassword(username, password);
	}

	public void addUser(User user) {
		userDao.saveUser(user);
	}

	public List<User> findAll() {
		return userDao.findAllUsers();
	}

	public User updateUser(User user) {
		return userDao.updateUser(user);
	}

	public User findUserById(Integer idUser) {
		return userDao.findUserById(idUser);
	}

	public User deleteUser(Integer id) {
		return userDao.deleteUser(id);
	}

	public User findUserByName(String username) {
		return userDao.findUserByName(username);
	}
}

