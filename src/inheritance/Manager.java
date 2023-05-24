package inheritance;

public class Manager extends Employee {
	
	long managerid;
    String managerName; 
    String managerAddress;
    long managerPhone; 
    public long getManagerid() {
		return managerid;
	}

	public void setManagerid(long managerid) {
		this.managerid = managerid;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerAddress() {
		return managerAddress;
	}

	public void setManagerAddress(String managerAddress) {
		this.managerAddress = managerAddress;
	}

	public long getManagerPhone() {
		return managerPhone;
	}

	public void setManagerPhone(long managerPhone) {
		this.managerPhone = managerPhone;
	}

	double basicSalary; 
    double specialAllowance = 250.80; 
    double Hra = 1000.50;
	
	public double getSpecialAllowance() {
		return specialAllowance;
	}

	public double getHra() {
		return Hra;
	}

	double manager_salary  = .15 * basicSalary;


	public Manager() {
		
	}

	Manager(int id, String Name, String address, long phone){

	}

	public double getManager_salary() {
		return manager_salary;
	}

	public void setManager_salary(double manager_salary) {
		this.manager_salary = manager_salary;
	}

	public double managerSalary(){
		double sA = specialAllowance / 100;
		double mSA = manager_salary   * sA;
		double bSAplusbsA = mSA + sA; 

		double hrA_hundred = Hra / 100; 
		double bSA_hrA = manager_salary   * hrA_hundred;

		double mgr_salary = bSAplusbsA + bSA_hrA;

		return mgr_salary;

	}

	public void display_mgr_salary(){
		System.out.println(managerSalary());
	}
	


	


	



}
