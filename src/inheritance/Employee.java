package inheritance;

public class Employee {
	long employeeid;
    String employeeName; 
    String employeeAddress;
    long employeePhone; 
    double basicSalary; 
	double specialAllowance = 250.80; 
    double Hra = 1000.50;
    
  

	public Employee(){

    }
    Employee(long id, String Name, String address, long phone, double Salary){
        this.employeeid = id; 
        this.employeeName = Name;
        this.employeeAddress = address;
        this.employeePhone = phone; 
		this.basicSalary = Salary; 
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

	/* 
	public void display_emp_info(){
		System.out.println(employeeid);
		System.out.println(employeeName);
		System.out.println(employeeAddress);
		System.out.println(employeePhone);
	}
	*/
	
	 
	public void display_emp_salary(double basicSalary){

		double tmp = employeeSalary(basicSalary);
		System.out.println("Total employee salary:" + tmp);
	
	}
	

}
