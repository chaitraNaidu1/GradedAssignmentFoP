package model;

public class AdminDepartment extends SuperDepartment {
	
	public String DepartmentName() {
		return "AdminDepartment ";	
	}
	public String getTodaysWork() {
		return "Complete your documents Submission";	
	}
	public String getWorkDeadline() {
		return "Complete by EOD";	
	}	
}
    