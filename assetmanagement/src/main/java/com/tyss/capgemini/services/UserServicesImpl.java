package com.tyss.capgemini.services;

import java.util.HashMap;
import java.util.List;

import com.tyss.capgemini.dao.UserDAO;
import com.tyss.capgemini.dao.UserDAOImpl;
import com.tyss.capgemini.factory.Factory;
import com.tyss.capgemini.validation.Validation;

public class UserServicesImpl implements UserServices {

	UserDAO userDAO = Factory.getUserDAO();
	Validation validation = Factory.getValidation();

	@Override
	public List<HashMap<String, Object>> viewAllAssets() {

		return userDAO.viewAllAssets();
	}

	@Override
	public boolean updateAssets(String title, Integer quantity) {

		return userDAO.updateAssets(title, quantity);
	}

	@Override
	public boolean insertAssets(Integer assetId, String title, String category, Integer quantity, Double price) {

		return userDAO.insertAssets(assetId, title, category, quantity, price);
	}

	@Override
	public boolean removeAssets(String title) {

		return userDAO.removeAssets(title);
	}

	@Override
	public String login(String username, String password) {

		return userDAO.login(username, password);
	}



//	@Override
//	public boolean validate(String username, String password) {
//		
//		return userDAO.login(username, password);
//	}

	@Override
	public boolean raiseRequest(Integer requestId, Integer userID, Integer assetId, String title, Integer quantity) {

		return userDAO.raiseRequest(requestId, userID, assetId, title, quantity);
	}

	@Override
	public List<HashMap<String, Object>> viewStatus() {

		return userDAO.viewStatus();
	}

//	@Override
//	public List<HashMap<String, Object>> viewStatus() {
//		
//		return userDAO.viewStatus();
//	}

	@Override
	public List<HashMap<String, Object>> viewAllRequests() {

		return userDAO.viewAllRequests();
	}

	@Override
	public boolean insertUsers(Integer userId, String name, String uname, String pwd, String email, String role) {
	//	System.out.println("Inside insert users");
		

		return userDAO.insertUsers(userId, name, uname, pwd, email, role);
	}
	
	@Override
	public boolean insertUsersVal(Integer userId, String name, String uname, String pwd, String email, String role) {
	//	System.out.println("Inside insert users");
		if((!Validation.isStringOnlyAlphabet(uname))) {
		//	System.out.println("Inside insert uname");
			return false;
			
		}
		if((!Validation.passwordValidation(pwd))) {
			//System.out.println("Inside insert password");
			return false;
			
		}
		
		if((!Validation.emailValidation(email))) {
			//System.out.println("Inside insert password");
			return false;
			
		}
		
		return true;
	}

	@Override
	public List<HashMap<String, Object>> viewAllUsers() {

		return userDAO.viewAllUsers();
	}

	@Override
	public List<HashMap<String, Object>> viewAllocatedRequestList() {

		return userDAO.viewAllocatedRequestList();
	}

	@Override
	public List<HashMap<String, Object>> viewUnallocatedRequestList() {

		return userDAO.viewUnallocatedRequestList();
	}

}
