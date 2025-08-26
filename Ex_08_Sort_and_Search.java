/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_07_Arrays;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author ACER
 */
public class Ex_08_Sort_and_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("+ ENter the number of elements in array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i =0; i<n;i++){
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
            
        }
        Arrays.sort(A);
        System.out.print("-> After sorting: ");
        for (int i = 0; i < n;i++) {
            System.out.println(A[i] + " ");
        }
        System.out.print("+ Input a number to find index: ");
        int x = sc.nextInt();
        
        int index = -1;
        for (int i = 0; i <n;i++){
            if (A[i] == x) {
                index = i;
                break;
            }
        }
        if (index != -1){
            System.out.println("-> The number " + x + " was found at index: " + index);
        } else {
            System.out.println("-> The number " + X + " was not found in the arrays!");
        }
    }
}
