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
		user.setId(7);
		user.setName("neha");
		user.setType("customer");
		user.setPassword("516966");
		
		
		service.addUser(user);
		System.out.println("new user Added");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* //retrieve
		user = service.searchUserById(3);
		System.out.println("ID is:"+ user.getId());*/
		
		
	}
	

}
