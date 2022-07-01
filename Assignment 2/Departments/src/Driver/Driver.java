package Driver;

import AdminDept.AdminDepartment;
import HrDept.HrDepartment;
import techDept.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		System.out.println(admin.toString() + "\n");
		System.out.println(hr.toString() + "\n");
		System.out.println(tech.toString() + "\n");
	}
}
