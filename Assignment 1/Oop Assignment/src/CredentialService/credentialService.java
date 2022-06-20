package CredentialService;

import java.util.Random;

import Employee.Employee;

public class credentialService {
	public credentialService() {
		// TODO Auto-generated constructor stub
	}

	public void generateEmail(Employee emp) {
		String email = emp.getFristName() + emp.getLastName() + "@" + emp.getDepartment() + ".abc.com";
		emp.setEmail(email);
	}

	public void generatePassword(Employee emp) {
		String pattern= "qwertyuiopasdfghjjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM!@#$%^&*()1234567890";
		int len = 10;
		Random random = new Random();
		char[] password = new char[10];

		for(int i=0;i<len;i++) {
			password[i]=pattern.charAt(random.nextInt(pattern.length()));
		}
		emp.setPassword(String.valueOf(password));
	}

	public void showCredentials(Employee emp)
	{
		System.out.println("Email:" + emp.getEmail());
		System.out.println("Password: " + emp.getPassword());
	}
}
