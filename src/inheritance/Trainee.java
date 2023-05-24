package inheritance;

public class Trainee extends Employee {
	double trainee_salary = .10 * basicSalary;

	public Trainee() {
		
	}

	public Trainee(int id, String Name, String address, long phone) {
		
	}

	public double getTrainee_salary() {
		return trainee_salary;
	}

	public void setTrainee_salary(double trainee_salary) {
		this.trainee_salary = trainee_salary;
	}

	public double traineesalary(){
		double sA = specialAllowance / 100;
		double tSA = trainee_salary   * sA;
		double bSAplusbsA = tSA + sA; 

		double hrA_hundred = Hra / 100; 
		double bSA_hrA = trainee_salary   * hrA_hundred;

		double trainee_salary = bSAplusbsA + bSA_hrA;

		return trainee_salary;

	}

	public void display_trainee_salary(){
		System.out.println(traineesalary());
	}

}
