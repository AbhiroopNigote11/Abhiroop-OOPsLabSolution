package com.abhiroop.main;

import java.util.Scanner;
 import com.abhiroop.model.Employee;
 import com.abhiroop.service.CredentialService;
public class DriveClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Employee employee = new Employee("Abhiroop","Nigote");
        CredentialService cs = new CredentialService();
        System.out.println("Please enter the department from following ");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human resource");
        System.out.println("4. legal");
 
        int departmentno = sc.nextInt();
  String department = null; 
  switch(departmentno) {
  case 1:
	  department = "tech";
	  break;
  case 2:
	  department = "Admin";
	  break;
  case 3 :
	   department = "hr";
	   break;
  case 4:
	  department = "legal";
	  break;
  
  
  }
        
   String email =     cs.generateEmailid(employee.getFirstName(), employee.getLastName(), department);
   
 
  
    String password =  cs.generatePassword();
     cs.showcredential(employee.getFirstName(), email, password);
    
   
 
	}

}
