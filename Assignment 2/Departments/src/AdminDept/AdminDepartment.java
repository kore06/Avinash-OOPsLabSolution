package AdminDept;

import SuperDept.SuperDepartment;

public class AdminDepartment extends SuperDepartment{
	public String departmentName() {
		return "Admin Department";
	}
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}
	@Override
	public String toString() {
		return "Welcome to " + departmentName() + "\n" +  getTodaysWork() + "\n" + getWorkDeadline() + "\n" + isTodayAHoliday();
	}
}
