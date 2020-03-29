package com.tyss.capgemini.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.beans.RequestBean;
import com.tyss.capgemini.beans.UsersBean;
import com.tyss.capgemini.factory.Factory;
import com.tyss.capgemini.repository.AssetRepository;
import com.tyss.capgemini.repository.RequestRepository;
import com.tyss.capgemini.repository.UserRepository;

public class UserDAOImpl implements UserDAO {

	String userRole = null;
	AssetRepository assetRepository = Factory.getAssetRepository();
	UserRepository userRepository = Factory.getUserRepository();
	RequestRepository requestRepository = Factory.getRequestRepository();
	Logger log = LogManager.getLogger(UserDAOImpl.class);
	List<HashMap<String, Object>> viewNewList = assetRepository.assetTable();
	List<HashMap<String, Object>> viewNewRequestList = requestRepository.requestTable();
	List<HashMap<String, Object>> viewNewUserList = userRepository.userTable();
	List<HashMap<String, Object>> viewAllocatedRequestList = requestRepository.allocatedRequestStatusTable();
	List<HashMap<String, Object>> viewUnallocatedRequestList = requestRepository.unallocatedRequestStatusTable();
	int count1 = 0;
	Integer quant = 0;

	int count = 0;

	public String login(String username, String password) {

		/*
		 * for (int i = 0; i < userRepository.userTable().size(); i++) {
		 * System.out.println(userRepository.userTable().get(i).get("Uname").toString())
		 * ; System.out.println(userRepository.userTable().get(i).get("Password")); if
		 * ((username.equals(userRepository.userTable().get(i).get("Uname").toString()))
		 * && (password.equals(userRepository.userTable().get(i).get("Password")))) {
		 * 
		 * count++;
		 * 
		 * if (count > 0) {
		 * 
		 * userRole = (String) userRepository.userTable().get(i).get("Role"); if
		 * ("Admin".equals(userRole)) { log.info("Successfully logged in as Admin!");
		 * 
		 * } else if ("Manager".equals(userRole)) {
		 * log.info("Successfully logged in as Manager"); } } } }
		 */

		for (int i = 0; i < viewNewUserList.size(); i++) {
			// System.out.println(viewNewUserList.get(i).get("Uname").toString());
			// System.out.println(viewNewUserList.get(i).get("Password"));
			if ((username.equals(viewNewUserList.get(i).get("Uname").toString()))
					&& (password.equals(viewNewUserList.get(i).get("Password")))) {

				count++;

				if (count > 0) {

					userRole = (String) viewNewUserList.get(i).get("Role");
					if ("Admin".equals(userRole)) {
						log.info("Successfully logged in as Admin!");

					} else if ("Manager".equals(userRole)) {
						log.info("Successfully logged in as Manager");
					}
				}
			}
		}
		return userRole;

	}

	@Override
	public List<HashMap<String, Object>> viewAllAssets() {

		for (Object r : viewNewList) {
			System.out.println(r);
		}

		return null;
	}

	public List<HashMap<String, Object>> viewAllRequests() {

		for (Object s : viewNewRequestList) {
			System.out.println(s);
		}
		return viewNewRequestList;

	}

	public List<HashMap<String, Object>> viewAllUsers() {

		for (Object t : viewNewUserList) {
			System.out.println(t);
		}
		return viewNewUserList;

	}

	@Override
	public boolean insertAssets(Integer assetId, String title, String category, Integer quantity, Double price) {

		HashMap<String, Object> assetHashMap = new HashMap<String, Object>();

		assetHashMap.put("AssetId", assetId);
		assetHashMap.put("Title", title);
		assetHashMap.put("Category", category);
		assetHashMap.put("Quantity", quantity);
		assetHashMap.put("Price", price);
		viewNewList.add(assetHashMap);
		// viewNewList = assetRepository.assetTable();

		System.out.println("Assets added successfully !");

		return true;
	}

	public boolean insertUsers(Integer userId, String name, String uname, String pwd, String email, String role) {

		HashMap<String, Object> userhashMap = new HashMap<String, Object>();
		UsersBean user = new UsersBean(userId, name, uname, pwd, email, role);
		userhashMap.put("UserId", user.getId());
		userhashMap.put("Name", user.getName());
		userhashMap.put("Uname", user.getUsername());
		userhashMap.put("Password", user.getPassword());
		userhashMap.put("Email", user.getEmail());
		userhashMap.put("Role", user.getRole());
		userRepository.userTable().add(userhashMap);
		viewNewUserList.add(userhashMap);

		log.info("Users added successfully !");

		return true;
	}

	@Override
	public boolean updateAssets(String title, Integer quantity) {

		for (int i = 0; i < viewNewList.size(); i++) {
			if (title.equals(viewNewList.get(i).get("Title"))) {
				count++;
				if (count > 0) {
					viewNewList.get(i).replace("Quantity", quantity);
					log.info("Asset quantity successfully updated !");
				} else {
					log.info("Asset not found !");
				}
			}
		}

		return false;
	}

	@Override
	public boolean removeAssets(String title) {

		for (int i = 0; i < viewNewList.size(); i++) {
			if (title.equals(viewNewList.get(i).get("Title"))) {
				count++;
				if (count > 0) {
					viewNewList.remove(i);
					System.out.println("Asset removed successfully !");
				} else {
					System.out.println("Asset not found !");
				}
			}

		}
		return true;
	}

	public boolean raiseRequest(Integer requestId, Integer userID, Integer assetId, String title, Integer quantity) {

		HashMap<String, Object> requestsHashMap = new HashMap<String, Object>();
		RequestBean requestBean = new RequestBean(requestId, userID, assetId, title, quantity, "Not Approved", "No");
		requestsHashMap.put("RequestId", requestBean.getRequestId());
		requestsHashMap.put("UserId", requestBean.getUserID());
		requestsHashMap.put("AssetId", requestBean.getAssetId());
		requestsHashMap.put("Title", requestBean.getTitle());
		requestsHashMap.put("Quantity", requestBean.getQuantity());
		requestsHashMap.put("Status", requestBean.getStatus());
		requestsHashMap.put("Processed", requestBean.getProcessed());

		// viewNewRequestList = requestRepository.requestTable();
		viewNewRequestList.add(requestsHashMap);

		log.info("Request added successfully !");

		return true;
	}

	public List<HashMap<String, Object>> viewStatus() {

		for (int i = 0; i < viewNewRequestList.size(); i++) {
			Integer assetId = (Integer) viewNewRequestList.get(i).get("AssetId");
			String title = (String) viewNewRequestList.get(i).get("Title");
			Integer quantity = (Integer) viewNewRequestList.get(i).get("Quantity");

			if (((String) viewNewRequestList.get(i).get("Processed")).equals("No")) {
				for (int j = 0; j < viewNewList.size(); j++) {
					if (assetId.equals(assetRepository.assetTable().get(j).get("AssetId"))
							&& (title.equals(assetRepository.assetTable().get(j).get("Title")))) {

						quant = (Integer) viewNewList.get(j).get("Quantity");

						if (quantity < quant) {
							viewNewRequestList.get(i).replace("Status", "Approved");
							viewNewRequestList.get(i).replace("Processed", "Yes");

							viewNewList.get(j).replace("Quantity", quant - quantity);
							viewAllocatedRequestList.add(viewNewRequestList.get(i));
							// viewNewRequestList.remove(viewNewRequestList.get(i));
							log.info("Request approved successfully of assetId:-" + assetId + "and title :-" + title);

						} else {

							viewNewRequestList.get(i).replace("Status", "Not Approved");
							viewNewRequestList.get(i).replace("Processed", "Yes");

							viewUnallocatedRequestList.add(viewNewRequestList.get(i));
							// viewNewRequestList.remove(viewNewRequestList.get(i));
							log.info("Request not approved of assetId:-" + assetId + "and title :-" + title);

						}

					}

				}
			}

		}
		return viewNewRequestList;
	}

	public List<HashMap<String, Object>> viewAllocatedRequestList() {

		for (Object r : viewAllocatedRequestList) {
			System.out.println(r);
		}

		return viewAllocatedRequestList;

	}

	public List<HashMap<String, Object>> viewUnallocatedRequestList() {
		for (Object r : viewUnallocatedRequestList) {
			System.out.println(r);
		}
		return viewUnallocatedRequestList;
	}

	@Override
	public boolean usernameValidation(String username) {

		return false;
	}

	@Override
	public boolean passwordValidation(String password) {
		// TODO Auto-generated method stub
		return false;
	}
}
