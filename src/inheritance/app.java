package inheritance;

public class app {

	public static void main(String[] args) {
		
		/* 
		Employee emp = new Employee(64606, "Bernard", "LasVegas", 7025385);
	    emp.display_emp_salary();;
	
		Manager mgr = new Manager(72322, "Brian", "California", 5555555);
		mgr.display_mgr_salary();
		 
		Trainee tr = new Trainee(23553, "Nathan", "Texas", 1113333);
		tr.display_trainee_salary();
		*/


		EmployeeFunctions e = new EmployeeFunctions();
		e.insertEmployee();
		e.displayEmployee();
		


		ManagerFunctions m = new ManagerFunctions();
		m.insertManager();
		m.displayManager();
		
		//m.deleteEmployee();
		//m.displayEmployee();

		//e.deleteEmployee();
		//m.deleteManager();

		//e.displayEmployee();
		//m.displayManager();

	}

}
