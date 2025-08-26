/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_07_Arrays;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Ex_03_Count_Occurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("+ Enter the nummber of elements in the array: ");
        int  n = sc.nextInt();
        int[] A = new int[n];
        
        for (int i = 0;i < n ;i++){
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }
        int x;
        System.out.print("--- Enter number to find X: ");
        x = sc.nextInt();
        int count =0;
        for (int  i =0;i < n;i++){
            if (x == A[i]) {
                count++;
            }
        }
        System.out.print("-> The number " + x + " appears: " + count + " times!");
    }
}
