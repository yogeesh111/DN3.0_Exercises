package Exercise_4_Employee_Management_System;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        List<Employee> lst=new ArrayList<>();

        while(true) {
            int option;
            System.out.println("Press 1: to add Employee\nPress 2: for search\nPress 3: for traversing\nPress 4 : to delete\nPress 5 to Exit");
            option = in.nextInt();
            switch (option){
                case 1:
                {
                    EmployeeOperation.add(lst);
                    break;
                }
                case 2:
                {
                    if(EmployeeOperation.search(lst))
                    {
                        System.out.println("Employee Found");
                    }
                    else
                    {
                        System.out.println("Employee Not Found");
                    }
                    break;
                }
                case 3:
                {
                    for(Employee e:lst)
                    {
                        System.out.println("Id: "+e.getEmployeeId()+" Name: "+e.getName()+" Position: "+e.getPosition()+" Salary:"+e.getSalary());
                    }
                    break;
                }
                case 4:
                {
                    EmployeeOperation.delete(lst);

                }
                case 5:
                {
                    System.exit(1);
                }
            }
        }


    }
}
