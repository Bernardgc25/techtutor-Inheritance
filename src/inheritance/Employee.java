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
    Employee(int id, String Name, String address, long phone){
        this.employeeid = id; 
        this.employeeName = Name;
        this.employeeAddress = address;
        this.employeePhone = phone; 
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


	
	public double employeeSalary(){
	        double sA = specialAllowance / 100;
	        double bSA = basicSalary * sA;
	        double bSAplusbsA = bSA + sA; 

	        double hrA_hundred = Hra / 100; 
	        double bSA_hrA = basicSalary * hrA_hundred;

	        double emp_salary = bSAplusbsA + bSA_hrA;

	        return emp_salary;

	}

	public void display_emp_salary(){
	        System.out.println(employeeSalary());
	}


}
