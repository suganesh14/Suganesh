package org.git;

public class EmployeeClass {
	
	public void empId() {
		System.out.println("My empId : 95213");
	}
	
	public void empName() {
        System.out.println("My empName : suganesh");
	}
	
	public void empDob() {
        System.out.println("My empDob : 14/03/1994");
	}
	
	public void empPhone() {
		System.out.println("My empPhone : 7806952949");
	}
	
	public void empEmail() {
        System.out.println("My empEmail : suganesh14@gmail.com");
	}
	
	private void empAddress() {
		System.out.println("chennai");
	}
	
	
	public static void main(String[] args) {
		
		EmployeeClass E= new EmployeeClass();
		
		E.empId();
		E.empName();
		E.empDob();
		E.empPhone();
		E.empEmail();
		
	}

 }


