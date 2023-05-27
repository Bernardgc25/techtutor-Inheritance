package inheritance;
//import java.util.Scanner;

public class EmployeeFunctions {
   // private Employee employeearr[];
   // private Scanner sc; 

	/* 
    public EmployeeFunctions()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter no of employees u want");
		int noofemployee=sc.nextInt();
		employeearr = new Employee[noofemployee];
		
	}

	public void insertEmployee()
	{
		for(int index=0;index<employeearr.length;index++)
		{
			Employee e = new Employee();
			System.out.println("Enter Employee id ");
			e.setEmployeeid(sc.nextLong());
			
			System.out.println("Enter Employee Name");
			e.setEmployeeName(sc.next());
			
			System.out.println("Enter phone number");
			e.setEmployeePhone(sc.nextLong());

			System.out.println("Enter salary");
			e.setBasicSalary(sc.nextDouble());


			employeearr[index] = e; 			
		}
	}

	public void deleteEmployee()
	{
		System.out.println("Enter employee id which want to delete");
		int deleteemployee=sc.nextInt();

		for(int index=0;index<employeearr.length;index++)
		{
			if(employeearr[index].getEmployeeid() == deleteemployee)
			{
				employeearr[index]=null;
			}
		}
	}

	public void displayEmployee()
	{
		for(Employee e1:employeearr)
		{
			if(!(e1==null))
			{
			System.out.println("Employee id is "+e1.getEmployeeid());
			System.out.println("Employee name is "+e1.getEmployeeName());
            System.out.print("Employee salary is");
            e1.display_emp_salary();
			}
		}
	}
	*/	
}
