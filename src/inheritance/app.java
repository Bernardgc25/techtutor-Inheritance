package inheritance;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
	long empid;
	String empName; 
	String empAddress;
	long empPhone; 
	double empbSalary; 

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter employee id:");
	empid = sc.nextLong();

	System.out.println("Enter employee name:");
	empName = sc.next();

	System.out.println("Enter employee address:");
	empAddress = sc.next();
	sc.nextLine();

	System.out.println("Enter employee phone:");
	empPhone = sc.nextLong();
		
	System.out.println("Enter employee salary:");
	empbSalary = sc.nextDouble();


	/*
	Employee e1 = new Employee(empid, empName, empAddress, empPhone, empbSalary);
	e1.display_emp_salary(empbSalary);
 *
	 */
	
	 
	Manager m1 = new Manager(empid, empName, empAddress, empPhone, empbSalary);
	m1.display_mgr_salary(empbSalary);

	Trainee t1 = new Trainee(empid, empName, empAddress, empPhone, empbSalary);
	t1.display_trainee_salary(empbSalary);


	}
}
