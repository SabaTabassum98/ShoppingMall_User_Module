package com.cg.shopping.service;

import com.cg.shopping.entities.User;

public interface IUserService
{
	public User addUser(User user);
	public User updateUser(User user);
	
	public User login(User user);
	public boolean logOut();
	//public void searchUserById(int id);
	
}