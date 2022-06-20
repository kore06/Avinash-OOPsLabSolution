package Employee;

public class Employee {
	private String fristName;
	private String lastName;
	private String department;
	private String email;
	private String password;
	
	public Employee(String firstName, String lastName, String department){
		this.fristName=firstName;
		this.lastName=lastName;
		this.department=department;
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [fristName=" + fristName + ", lastName=" + lastName + ", department=" + department + ", email="
				+ email + ", password=" + password + "]";
	}
	
	
}