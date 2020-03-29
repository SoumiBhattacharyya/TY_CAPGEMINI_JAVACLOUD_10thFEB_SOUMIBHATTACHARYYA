package com.tyss.capgemini.factory;

import com.tyss.capgemini.dao.UserDAO;
import com.tyss.capgemini.dao.UserDAOImpl;
import com.tyss.capgemini.repository.AssetRepository;
import com.tyss.capgemini.repository.RequestRepository;
import com.tyss.capgemini.repository.UserRepository;
import com.tyss.capgemini.services.UserServices;
import com.tyss.capgemini.services.UserServicesImpl;
import com.tyss.capgemini.validation.Validation;

public class Factory {
	
	public static Validation getValidation() {
		
		return new Validation();
	}
	
	
	
	public static UserDAO getUserDAO() {
		
		return new UserDAOImpl();
	}
	
	

	public static UserServices getUserServices() {
		
		return new UserServicesImpl();
		
	}
	
	public static UserRepository getUserRepository() {
		
		return new UserRepository();
	}
	
	public static  AssetRepository getAssetRepository() {
		
		return new AssetRepository();
	}
	
	public static RequestRepository getRequestRepository() {
		
		
		return new RequestRepository();
	}
}
