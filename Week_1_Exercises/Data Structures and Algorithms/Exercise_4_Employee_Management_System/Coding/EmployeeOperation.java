package Exercise_4_Employee_Management_System;

import java.util.List;
import java.util.Scanner;

public class EmployeeOperation {
    static Scanner in=new Scanner(System.in);
    public static void add(List<Employee> lst)
    {
        int employeeId;
        String name;
        String position;
        String salary;


        while(true)
        {
            int n=0;
            System.out.println("Enter -1 if you finished your uploding... or want to continue uploading press any number");
            n=in.nextInt();
            in.nextLine();
            if(n==-1)
                break;
            System.out.println("Enter employeeId: ");
            employeeId=in.nextInt();
            in.nextLine();
            System.out.println("Name: ");
            name=in.nextLine();
            System.out.println("Position: ");
            position=in.nextLine();
            System.out.println("Salary: ");
            salary=in.nextLine();
            lst.add(new Employee(employeeId,name,position,salary));

        }
    }
    public static boolean search(List<Employee> lst)
    {
        int id=0;
        System.out.println("Enter employee id to search");
        id=in.nextInt();
        for(Employee e:lst)
        {
            if(e.getEmployeeId()==id)
            {
                return true;
            }
        }
        return false;
    }
    public static void delete(List<Employee> lst)
    {
        int id=0;
        int flag=0;
        System.out.println("Enter employee id to search");
        id=in.nextInt();
        for(int i=0;i<lst.size();i++)
        {
            if(lst.get(i).getEmployeeId()==id)
            {
                flag=1;
                lst.remove(i);
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Deletion Successful");
        }
        else
        {
            System.out.println("Deletion unSuccessful");
        }

    }

}
