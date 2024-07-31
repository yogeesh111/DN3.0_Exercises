package Exercise_5_Task_Management_System;

import java.util.Scanner;

public class TaskOperations {
    static Scanner in=new Scanner(System.in);
    public static Task addTask(Task head)
    {
        System.out.println("Enter task ID:");
        int id=in.nextInt();
        in.nextLine();
        System.out.println("Task Name: ");
        String taskName=in.nextLine();
        System.out.println("status: ");
        String status=in.nextLine();
        Task temp=head;
        while(temp!=null && temp.getNext()!=null)
        {
            temp=temp.getNext();
        }
        if(head==null)
        {
            head=new Task(id,taskName,status);
        }
        else {
            temp.setNext(new Task(id,taskName,status));
        }
        return head;
    }
}
