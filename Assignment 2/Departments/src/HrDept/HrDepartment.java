package HrDept;

import SuperDept.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	public String departmentName() {
		return "HR Department";
	}
	public String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}
	public String doActivity() {
		return "team Lunch ";
	}
	@Override
	public String toString() {
		return "Welcome to " + departmentName() + "\n" + doActivity() + "\n" +  getTodaysWork() + "\n" + getWorkDeadline() + "\n" + isTodayAHoliday();
	}
}
