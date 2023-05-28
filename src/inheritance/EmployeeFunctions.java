package inheritance;
import java.util.Scanner;

public class EmployeeFunctions extends Employee {
     	 
        private Employee employeearray[];//this is Student type array
        private Scanner sc;
        
        public EmployeeFunctions()
        {
            sc=new Scanner(System.in);
            System.out.println("Enter no of Employees to add");
            int noofemployees=sc.nextInt();
            employeearray=new Employee[noofemployees];
            
        }
        public void insertemployee()
        {
            for(int index=0;index<employeearray.length;index++)
            {
              
                
                Employee e=new Employee();
                  
                System.out.println("Enter Employee Type(manager/trainee)");
                e.setEmployee_type(sc.next());
                  
                if(e.employee_type.equals("manager")){
                    //get info
                    System.out.println("Enter Employee id ");
                    e.setEmployeeid(sc.nextLong());
                    System.out.println("Enter Employee Name");
                    e.setEmployeeName(sc.next());
                    System.out.println("Enter employee address:");
                    e.setEmployeeAddress(sc.next());
                    sc.nextLine();
                    System.out.println("Enter employee phone:");
                    e.setEmployeePhone(sc.nextLong());
                    System.out.println("Enter employee salary:");
                    e.setBasicSalary(sc.nextDouble());
                    
                    Manager m = new Manager(e.getEmployeeid(), e.getEmployeeName(), e.getEmployeeAddress(), e.getEmployeePhone(), e.getBasicSalary());	
                  
                    //add manager object to Employee array 
                    employeearray[index] = m;
                    m.display_mgr_salary(m.getBasicSalary());
               
                }
                else if(e.employee_type.equals("trainee")){
                    //get info 
                    System.out.println("Enter Employee id ");
                    e.setEmployeeid(sc.nextLong());
                    System.out.println("Enter Employee Name");
                    e.setEmployeeName(sc.next());
                    System.out.println("Enter employee address:");
                    e.setEmployeeAddress(sc.next());
                    sc.nextLine();
                    System.out.println("Enter employee phone:");
                    e.setEmployeePhone(sc.nextLong());
                    System.out.println("Enter employee salary:");
                    e.setBasicSalary(sc.nextDouble());
    
                    Trainee t = new Trainee(e.getEmployeeid(), e.getEmployeeName(), e.getEmployeeAddress(), e.getEmployeePhone(), e.getBasicSalary());
                    //add trainee object to employee array 
                    employeearray[index] = t; 
                    t.display_trainee_salary(t.getBasicSalary());
           
                }
                
                
    
            }
            
        }
        /*     
        public void deleteEmployee()
        {
            System.out.println("Enter Employee id which want to delete ");
            int deletestudent=sc.nextInt();
    
            for(int index=0;index<employeearray.length;index++)
            {
                if(employeearray[index].getEmployeeid()==deletestudent)
                {
                    employeearray[index]=null;
                }
            }
            
        }
        */   
         
        public void displayEmployee()
        {
            for(Employee e1:employeearray)
            {
                if(!(e1==null))
                {
                System.out.println("Employee id is "+e1.getEmployeeid());
                System.out.println("Employee name is "+e1.getEmployeeName());
                //System.out.println("Employee Salary is ");
                
                }
            }
        }
         	
    }