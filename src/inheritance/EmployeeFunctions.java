package inheritance;
import java.util.Scanner;

public class EmployeeFunctions extends Employee {
     	 
        private Employee employeearray[];//this is Student type array
        private Scanner sc;
        
        public EmployeeFunctions()
        {
            sc=new Scanner(System.in);
            System.out.print("Enter no of Employees to add:");
            int noofemployees=sc.nextInt();
            System.out.print("\n");
            employeearray=new Employee[noofemployees];
            
        }
        public void insertemployee()
        {
            for(int index=0;index<employeearray.length;index++)
            {
                //System.out.print("\033[H\033[2J");  
                System.out.flush();  
                
                Employee e=new Employee();
                  
                System.out.print("Enter Employee Type(manager/trainee):");
                e.setEmployee_type(sc.next());
                //System.out.print("\n");
                  
                if(e.employee_type.equals("manager")){
                    //get info
                    System.out.print("Enter Employee id:");
                    e.setEmployeeid(sc.nextLong());
                    //System.out.print("\n");
                    
                    System.out.print("Enter Employee Name:");
                    e.setEmployeeName(sc.next());
                    //System.out.print("\n");
                    
                    System.out.print("Enter employee address:");
                    e.setEmployeeAddress(sc.next());
                    sc.nextLine();
                    //System.out.print("\n");
                    
                    System.out.print("Enter employee phone:");
                    e.setEmployeePhone(sc.nextLong());
                    //System.out.print("\n");
                   
                    System.out.print("Enter employee salary:");
                    e.setBasicSalary(sc.nextDouble());
                   // System.out.print("\n");

                    Manager m = new Manager(e.getEmployeeid(), e.getEmployeeName(), e.getEmployeeAddress(), e.getEmployeePhone(), e.getBasicSalary());	
                    //add manager object to Employee array 
                    employeearray[index] = m;
                    m.display_mgr_salary(m.getBasicSalary());
                    System.out.print("\n");

                }
                else if(e.employee_type.equals("trainee")){
                    //get info 
                    System.out.print("Enter Employee id:");
                    e.setEmployeeid(sc.nextLong());
                    System.out.print("Enter Employee Name:");
                    e.setEmployeeName(sc.next());
                    System.out.print("Enter employee address:");
                    e.setEmployeeAddress(sc.next());
                    sc.nextLine();
                    System.out.print("Enter employee phone:");
                    e.setEmployeePhone(sc.nextLong());
                    System.out.print("Enter employee salary:");
                    e.setBasicSalary(sc.nextDouble());
    
                    Trainee t = new Trainee(e.getEmployeeid(), e.getEmployeeName(), e.getEmployeeAddress(), e.getEmployeePhone(), e.getBasicSalary());
                    //add trainee object to employee array 
                    employeearray[index] = t; 
                    t.display_trainee_salary(t.getBasicSalary());
                    System.out.print("\n");
                }
                
            }    
        }
    
        public void deleteEmployee(){
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
        
         
        public void displayHeader(){
            System.out.printf("%-10s   %-10s  %n", "Employee id",  "Employee Name"); 
        }
        public void displayEmployeeInfo()
        {
            for(Employee e1:employeearray)
            {
                if(!(e1==null))
                {
                System.out.printf("%-10s    %-10s  %n", e1.getEmployeeid(),  e1.getEmployeeName()); 
                }
            }
        }
    }