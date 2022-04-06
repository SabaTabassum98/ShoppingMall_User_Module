package com.cg.shopping.repository;
import com.cg.shopping.entities.User;

public interface IUserRepository 
{
	public User addUser(User user);
	public User updateUser(User user);
	public User deleteUser(int id);

	public abstract void beginTransaction();
	public abstract void commitTransaction();
}