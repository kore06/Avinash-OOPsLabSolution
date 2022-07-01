package techDept;

import SuperDept.SuperDepartment;

public class TechDepartment extends SuperDepartment{
	public String departmentName() {
		return "Tech Department";
	}
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}
	public String getTechStackInformation() {
		return "core Java";
	}
	@Override
	public String toString() {
		return "Welcome to " + departmentName() + "\n" +  getTodaysWork() + "\n" + getWorkDeadline() + "\n" + isTodayAHoliday();
	}
}
