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
public class Ex_10_Concatenate_2_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("- Enter first Array: ");
        int n1 = sc.nextInt();
        int[] A1 = new int[n1];
        for (int i =0; i  <n1;i++){
            System.out.print("A[" + i + "]: ");
            A1[i] = sc.nextInt();
        }
        System.out.println("-> The first Array: ");
        for (int i =0 ; i < n1;i++){
            System.out.println("A[" + i + "]: " + A1[i]);
        }
        
        System.out.print("- Enter Second Array: ");
        int n2 = sc.nextInt();
        int[] A2 = new int[n2];
        for (int i =0; i  <n2;i++){
            System.out.print("A[" + i + "]: ");
            A2[i] = sc.nextInt();
        }
        System.out.println("-> The first Array: ");
        for (int i =0 ; i < n2;i++){
            System.out.println("A[" + i + "]: " + A2[i]);
        }
        System.out.print("\n-> Concatenated Array: ");
        int[] ArraySum = new int[n1 + n2]; 
        for (int i = 0; i < n1;i++){
            ArraySum[i] = A1[i];
        }
        for (int i = 0; i < n2;i++){
            ArraySum[n1 + i] = A2[i] ;
        }
        for (int i = 0; i < ArraySum.length;i++){
            System.out.print(ArraySum[i] + " ");
        }
    }
}
