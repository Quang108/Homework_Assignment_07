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
public class Ex_11_FindTheSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("+ ENter number of the elements in array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i  =0; i <n;i++){
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }
        int max = A[0];
        int secondMax = A[1];
        for (int i =0;i < n;i++){
            if (A[i] > max){
                max = A[i];
            } else if (A[i] > secondMax && A[i] < max){
                secondMax = A[i];
            }
        }
        System.out.print("-> The second largest elements is: " + secondMax);
        
    }
}
