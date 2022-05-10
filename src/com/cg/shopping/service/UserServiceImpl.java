package com.cg.shopping.service;
import com.cg.shopping.entities.User;
import com.cg.shopping.repository.IUserRepository;
import com.cg.shopping.repository.UserRepositoryImpl;

public class UserServiceImpl implements IUserService

{
	// Step 1: Establishing connection between Service and Repo
	private IUserRepository dao;
	public UserServiceImpl() 
	{
		dao = new UserRepositoryImpl();
	}
	// Step 2: Service calls to perform CRUD Operation
	@Override
	public User addUser(User user) {
        dao.beginTransaction();
		dao.addUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
        dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User login(User user) {
        dao.beginTransaction();
		//dao.login(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public boolean logOut() {
        dao.beginTransaction();
	    //dao.logout(null);
		dao.commitTransaction();
		return false;
	}
	
	
	
	
	
}
