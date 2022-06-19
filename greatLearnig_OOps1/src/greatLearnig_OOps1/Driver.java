package greatLearnig_OOps1;
import java.util.Scanner;

import models.Employee;
import services.CredentialsServie;

public class Driver {

	public static void main(String[] args) {
final Employee employee = new Employee("souradipta", "ojha");
		
		System.out.println("Select your department: \n"
				+ "1. Technical\n"
				+ "2. Admin\n"
				+ "3. Human Resource\n"
				+ "4. Legal");
		
		final Scanner sc = new Scanner(System.in);
		
		int option = sc.nextInt();
		
		String departmentName = "";
		
		switch(option) {
		case 1: 
			departmentName = "tech";
			break;
		case 2:
			departmentName = "adm";
			break;
		case 3: 
			departmentName = "hr";
			break;
		case 4: 
			departmentName = "adm";
			break; 
		default: 
			System.err.println("Invalid option selected.");
			System.exit(0);
		}
		
		final CredentialsServie cs = new CredentialsServie();
		
		final String randomPassword = cs.generateRandomPassword();
		
		final String email = cs.generateEmailAddress(employee, departmentName);
		
		cs.showCredentials(employee, email, randomPassword);
		
	}



	}


