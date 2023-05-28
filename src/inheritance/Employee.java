package inheritance;

public class Employee {
	String employee_type;
	long employeeid;
    String employeeName; 
    String employeeAddress;
    long employeePhone; 
    double basicSalary; 
	double specialAllowance = 250.80; 
    double Hra = 1000.50;

	//Manager manager = new Manager(); 
	//Trainee trainee = new Trainee(); 
    
  

	public Employee(){

    }
    public Employee(long id, String Name, String address, long phone, double Salary){
        this.employeeid = id; 
        this.employeeName = Name;
        this.employeeAddress = address;
        this.employeePhone = phone; 
		this.basicSalary = Salary; 
    }

		
	public String getEmployee_type() {
		return employee_type;
	}
	public void setEmployee_type(String employee_type) {
		this.employee_type = employee_type;
	}
	public long getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(long employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public long getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getSpecialAllowance() {
		return specialAllowance;
	}
	public double getHra() {
		return Hra;
	}
	
	public double employeeSalary(double basicSalary){
	  
		double bSA = getBasicSalary() * getSpecialAllowance();
		bSA = bSA/10000; 
		 
		double bSAhrA = getBasicSalary() * getHra();
		bSAhrA = bSAhrA/10000;

		return getBasicSalary() + bSA + bSAhrA;
	}
	 
	public void display_emp_salary(double basicSalary){

		double tmp = employeeSalary(basicSalary);
		System.out.println("Total employee salary:" + tmp);
	
	}
	
}

