/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_07_Arrays;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ACER
 */
public class Ex_04_ToDoManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        
        while(true) {
            System.out.println("\n ==== TO DO LIST ==== \n");
            System.out.println("1.Add a new task!");
            System.out.println("2.View all task!");
            System.out.println("3.Remove a task by index!");
            System.out.println("4.Exit");
            System.out.print("+ Enter you choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1: System.out.print("+ Enter a task: ");
                String task = sc.nextLine();
                tasks.add(task);
                    System.out.println("-> Task added!");
                    break;
                    
                case 2:
                    System.out.println("- Current to do list: ");
                    if (tasks.isEmpty()){
                        System.out.println("-> NO TASK FOUND!");
                    } else {
                        for (int i = 0; i < tasks.size();i++){
                            System.out.println(i + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.println("+ Enter Index to remove: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < tasks.size()){
                        tasks.remove(index);
                        System.out.println("-> Task Removed!");
                    } else {
                        System.out.println("-> Invalid index!");
                    }
                    break;
                case 4:
                    System.out.println("-> Exiting list....");
                    return;
                default:
                    System.out.println("----- INVALID CHOICE, TRY AGAIN!!!-----");
            }
        }
            
    }
    
}