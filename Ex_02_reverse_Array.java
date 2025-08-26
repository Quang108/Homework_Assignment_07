/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_07_Arrays;
import java.util.Scanner;
/**
 *
11 * @author ACER
 */
public class Ex_02_reverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("+ Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        
        for (int i =0; i <n;i++){
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n/2;i++){
            int temp = A[i];
            A[i] =  A[n - i -1];
             A[n - i -1] = temp;
        
        }
        System.out.println("-> Array after reversal: " );
        for (int i = 0; i < n;i++){
            System.out.println("A[" + i + "]: " + A[i]);
        }
            
    }
}
