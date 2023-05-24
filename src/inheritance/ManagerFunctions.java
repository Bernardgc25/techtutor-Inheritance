package inheritance;

import java.util.Scanner;

public class ManagerFunctions extends EmployeeFunctions {   
    private Manager managerarr[];
    private Scanner sc; 
    
    public ManagerFunctions()
	{
		sc = new Scanner(System.in);
		System.out.println("Enter no of Manager u want");
		int noofmanager=sc.nextInt();
		managerarr = new Manager[noofmanager];
		
	}

	public void insertManager()
	{
		for(int index=0;index<managerarr.length;index++)
		{
            Manager m = new Manager();
            System.out.println("Enter Manager id ");
			m.setEmployeeid(sc.nextLong());

			System.out.println("Enter Manager Name");
			m.setEmployeeName(sc.next());

			System.out.println("Enter phone number");
            m.setEmployeePhone(sc.nextLong());


			System.out.println("Enter salary");
            m.setManager_salary(sc.nextDouble());
        }
	}

	public void deleteManager()
	{
		System.out.println("Enter Manager id which want to delete");
		int deletemanager=sc.nextInt();

		for(int index=0;index<managerarr.length;index++)
		{
			if(managerarr[index].getEmployeeid() == deletemanager)
			{
				managerarr[index]=null;
			}
		}
	}

	public void displayManager()
	{
		for(Manager m1:managerarr)
		{
			if(!(m1==null))
			{
			System.out.println("Manager id is "+m1.getManagerid());
			System.out.println("Manager name is "+m1.getManagerName());
            System.out.print("Manager salary is");
			m1.display_mgr_salary();
            }
		}
	}
}
