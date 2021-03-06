package com.tyss.capgemini.services;

import java.util.HashMap;
import java.util.List;

public interface UserServices {
	
	public String login(String username, String password) ;

	public List<HashMap<String, Object>> viewAllAssets();
	
	public List<HashMap<String, Object>> viewAllUsers();

	public boolean insertAssets(Integer assetId, String title, String category, Integer quantity, Double price);

	public boolean updateAssets(String title, Integer quantity);

	public boolean removeAssets(String title);
	
	public boolean raiseRequest(Integer requestId,Integer userID,Integer assetId,String title,Integer quantity);
	
	public boolean insertUsers(Integer userId, String name , String uname, String pwd, String email, String role);
	
	public List<HashMap<String, Object>> viewAllocatedRequestList();
	
	//public boolean usernameValidation(String username);
	
//	public boolean passwordValidation(String password) ;
	
	public List<HashMap<String, Object>> viewUnallocatedRequestList();
	
	public List<HashMap<String, Object>> viewStatus();
	
	public List<HashMap<String, Object>> viewAllRequests();

	boolean insertUsersVal(Integer userId, String name, String uname, String pwd, String email, String role);

//	public boolean validate(String username, String password);

}
