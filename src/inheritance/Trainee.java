package inheritance;

public class Trainee extends Employee {
	double trainee_salary = .10 * basicSalary;

	public double getTrainee_salary() {
		return trainee_salary;
	}

	public Trainee() {
		
	}

	public Trainee(long id, String Name, String address, long phone, double Salary) {
		//invoke parent class constructor(employee class)
		super(id, Name, address, phone, Salary);
		
	}

	public double traineeSalary(double basicSalary){
		double empS = super.employeeSalary(basicSalary);
		
		return getTrainee_salary() + empS; 
	}

	public void display_trainee_salary(double basicSalary){
		
		double tmp = traineeSalary(basicSalary);
		System.out.println("Total trainee salary:" + tmp);	
	}

		
	

}
