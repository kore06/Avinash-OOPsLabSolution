package driver;

import java.util.Scanner;
import CredentialService.credentialService;
import Employee.Employee;


public class driver {

	public static void main(String[] args) {
		System.out.println("Enter your frist name-"+ "\n");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		System.out.println("Enter your last name-"+ "\n");
		String lastName = sc.next();
		System.out.println("Select your department: \n 1.Technical \n 2.Administrator \n 3.Human Resource \n 4.Legal");
		int dept=sc.nextInt();
		String department=null;
		switch(dept) {
		case 1:
			department="tech";
			break;
		case 2:
			department="admin";
			break;
		case 3:
			department="hr";
			break;
		case 4:
			department="legal";
			break;
		default:
			System.out.println("Wrong input");
			break;
		}
		Employee emp = new Employee(firstName,lastName,department);
		credentialService cred = new credentialService();
		cred.generateEmail(emp);
		cred.generatePassword(emp);
		cred.showCredentials(emp);
	}
}
