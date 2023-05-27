package inheritance;

public class Manager extends Employee {
	double manager_salary  = .15 * basicSalary;

	public double getManager_salary() {
		return manager_salary;
	}


	public Manager(long id, String Name, String address, long phone, double Salary) {
		//invoke parent class constructor(employee class)
		super(id, Name, address, phone, Salary);
	}

		
	public double managerSalary(double basicSalary){
		double empS = super.employeeSalary(basicSalary);
		
		return getManager_salary() + empS; 
	}

	public void display_mgr_salary(double basicSalary){
		
		double tmp = managerSalary(basicSalary);
		System.out.println("Total manager salary:" + tmp);	
	}

		


}
