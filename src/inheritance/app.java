package inheritance;
//import java.util.Scanner;

public class app {

	public static void main(String[] args) {
	

	//test 
	EmployeeFunctions emp = new EmployeeFunctions();
	System.out.print("\033[H\033[2J");  
	
	System.out.flush();  
	
	emp.insertemployee();
	emp.displayHeader(); 
	emp.displayEmployeeInfo();




	}
}
