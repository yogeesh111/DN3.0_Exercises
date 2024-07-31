package Exercise_5_Task_Management_System;

import java.util.List;
import java.util.Scanner;

public class Main {
    static  Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        Task head=null;

        while(true) {
            int option;
            System.out.println("Press 1: to add Task\nPress 2: for search\nPress 3: for traversing\nPress 4 : to delete\nPress 5 to Exit");
            option = in.nextInt();
            switch (option) {
                case 1:
                {
                 head= TaskOperations.addTask(head);
                 break;

                }
                case 2:
                {
                    int id=0;
                    System.out.println("Enter task ID: ");
                    id=in.nextInt();
                    if(head!=null)
                    {
                        int flag=0;
                        Task temp=head;
                        while(temp.getNext()!=null)
                        {
                            if(temp.getTaskId()==id)
                            {
                                System.out.println("Task found!");
                                flag=1;
                                break;
                            }
                        }
                        if(flag==0)
                            System.out.println("Not Present");

                    }
                    break;
                }

                case 3:
                {
                    if(head!=null)
                    {

                        Task temp=head;
                        while(temp!=null)
                        {
                            System.out.println("Id: "+temp.getTaskId()+" Name : "+temp.getTaskName()+" Status : "+ temp.getStatus());
                            temp=temp.getNext();
                        }
                        }
                     break;
                }

                case 4:
                {
                    if(head!=null)
                    {
                        head=head.getNext();
                    }
                    break;
                }
                case 5:
                {
                    System.exit(1);
                }
            }
        }

        }

    }

