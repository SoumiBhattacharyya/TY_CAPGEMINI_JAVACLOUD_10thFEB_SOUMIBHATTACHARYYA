package com.tyss.capgemini.controller;

import java.util.*;

import org.apache.log4j.*;

import com.tyss.capgemini.factory.Factory;
import com.tyss.capgemini.repository.UserRepository;
import com.tyss.capgemini.services.UserServices;
import com.tyss.capgemini.services.UserServicesImpl;

public class LoginController {

	public static void main(String[] args) {

		UserRepository userRepository = Factory.getUserRepository();

		UserServices userServices = Factory.getUserServices();

		int choice = 0;
		int choiceMain = 0;

		String title = null;
		String category = null;
		Integer quantity = 0;
		Double price = 0.0;
		String username = null;
		String password = null;
		Integer assetId = 0;
		String option = null;
		Integer userId = 0;
		String name = null;
		String uname = null;
		String pwd = null;
		String email = null;
		String role = null;

		Logger log = LogManager.getLogger(LoginController.class);
		Scanner sc = new Scanner(System.in);

		while (true) {

			log.info("Welcome to Asset Management System");
			// log.info("Enter Your Choice of Action : ");
			// log.info("Select 1 for Login Page");
			// log.info("Select 2 for Exit !");
			// choiceMain = sc.nextInt();

//			log.info("Do you want to continue ?");

			// switch (choiceMain) {
			// case 1:

			log.info("Enter Username");
			username = sc.next();
			log.info("Enter Password");
			password = sc.next();
			int count = 0;
			//System.out.println("before login:-" +userServices.login(username, password));
			if ("Admin".equals(userServices.login(username, password))) {
				log.info("You have logged in as Admin...!");
				System.out.println();
				System.out.println();
				log.info("Select 1 for Viewing all Assets");
				log.info("Select 2 for Viewing all Users");
				log.info("Select 3 for Inserting new Users");
				log.info("Select 4 for Inserting Assets");
				log.info("Select 5 for Updating Asset Table");
				log.info("Select 6 for Removing Assets ");
				log.info("Select 7 for All Requests");
				log.info("Select 8 for Status of Requests");
				log.info("Select 9 for Allocated Asset Report");
				log.info("Select 10 for Unallocated Asset Report");
				log.info("Select 11 for log out");
				loop: while (true) {
					log.info("Enter Your Choice of Action : ");
					choice = sc.nextInt();

					switch (choice) {
					case 1:
						userServices.viewAllAssets();
						break;
					case 2:
						userServices.viewAllUsers();
						break;
					case 3:
						log.info("Enter the UserId");
						userId = sc.nextInt();
						log.info("Enter the Name");
						sc.nextLine();
						name = sc.nextLine();
						
						log.info("Enter the Username");
						uname = sc.nextLine();
						log.info("Enter the Password");
						pwd = sc.nextLine();
						log.info("Enter the Email");
						email = sc.nextLine();
						log.info("Enter the Role");
						role = sc.nextLine();
						if(!userServices.insertUsersVal(userId, name, uname, pwd, email, role)) {
						
							log.info("Enter the valid Username,password and email");	
						}
						else {
							
							log.info("Valid Username and password");	
						userServices.insertUsers(userId, name, uname, pwd, email, role);
						}
						break;
					case 4:
						log.info("Enter the AssetId :");
						assetId = sc.nextInt();
						log.info("Enter the title");
						title = sc.next();
						log.info("Enter the category");
						category = sc.next();
						log.info("Enter the quantity");
						quantity = sc.nextInt();
						log.info("Enter the price");
						price = sc.nextDouble();
						userServices.insertAssets(assetId, title, category, quantity, price);
						break;
					case 5:
						log.info("Enter the title you want to update");
						title = sc.next();
						log.info("Enter the number of quantities you want to update");
						quantity = sc.nextInt();

						userServices.updateAssets(title, quantity);
						break;
					case 6:
						log.info("Enter the title you want to remove");
						title = sc.next();
						userServices.removeAssets(title);

						break;
					case 7:
						userServices.viewAllRequests();
						break;
					case 8:
						userServices.viewStatus();
						break;
					case 9:
						userServices.viewAllocatedRequestList();
						break;
					case 10:
						userServices.viewUnallocatedRequestList();
						break;
					case 11:

						break loop;
//				case 6:
//					userServices.viewStatus();
//					break;
					}

				}
			} else if ("Manager".equals(userServices.login(username, password))) {
				log.info("Select 1 for Viewing All Assets");
				log.info("Select 2 for Raising the Request");
				log.info("Select 3 for Generating My Request Report");
				log.info("Select 4 for Log Out");

				loopManager: while (true) {
					log.info("Enter Your Choice of Action : ");
					choice = sc.nextInt();

					switch (choice) {
					case 1:
						userServices.viewAllAssets();
						break;
					case 2:
						log.info("Enter your requestID");
						Integer requestId = sc.nextInt();
						log.info("Enter your userID");
						Integer userID = sc.nextInt();
						log.info("Enter your assetID");
						assetId = sc.nextInt();
						log.info("Enter the title of the asset");
						title = sc.next();

						log.info("Enter the quantity of the assest");
						quantity = sc.nextInt();

						userServices.raiseRequest(requestId, userID, assetId, title, quantity);
						break;
					case 3:
						userServices.viewAllRequests();
						break;
					case 4:
						break loopManager;

					}

				}
			} else {
				log.info("No roles found !");
			}
			// log.info("Done");
//			case 2:
//				break loopMain;
		}

	}
}
//}
