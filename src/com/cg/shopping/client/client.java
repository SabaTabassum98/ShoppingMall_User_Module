package com.cg.shopping.client;
import com.cg.shopping.entities.User;
import com.cg.shopping.service.IUserService;
import com.cg.shopping.service.UserServiceImpl;

public class client {

	public static void main(String[] args) {
		//CRUD operations
		
		//create
		User user = new User();
		IUserService service = new UserServiceImpl();
		user.setId(4);
		user.setName("bhayashri");
		user.setType("normal");
		user.setPassword("kbc");
		
		service.addUser(user);
		System.out.println("new user Added");
		
		
	}
	

}
