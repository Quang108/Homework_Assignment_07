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
public class Ex_01_FindMaxMin {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("+ Enter the number of Elements in the arrays: ");
        int n =sc.nextInt();
        int[] A = new int[n];
        for (int i =0; i    <n;i++){
            System.out.print("- A[" + i + "]: ");
            A[i] = sc.nextInt();
        }
        int max =A[0];
        int min =A[0];
        for (int i = 0;i < n;i++){
            if (A[i] > max){
                max = A[i];
            }
            if (A[i] < min){
                min = A[i];
            }
        }
        System.out.print("-> The maximun value is: " + max);
        System.out.println();
        System.out.print("-> The minimun value is: " + min);
        
    }
}
