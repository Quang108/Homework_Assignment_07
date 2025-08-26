/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_07_Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex_06_Unlimited_data_Entry {
    public static void main(String[] args) {
     
   
      Scanner sc = new Scanner(System.in);
       ArrayList<Integer> A = new ArrayList<>();
       int sum =0;
        System.out.print("+ Enter elements in array(Enter -1 to stop): ");
       int n;
       while (true){
           n = sc.nextInt();
           if (n == -1){
               break;
           }
           A.add(n);
           sum += n;
       }
        System.out.println("- Elements in array: " + A);
        System.out.println("- Sum is: " + sum);
//System.out.println("");
    }
   
}
