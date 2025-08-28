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
public class Ex_13_Merge_2_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("+ Enter First Array: ");
        int n1 = sc.nextInt();
        int[] A1 = new int[n1];
        for (int i = 0; i < n1;i++){
            System.out.print("A[" + i + "]: ");
            A1[i] = sc.nextInt();
        }
        System.out.print("+ Enter Second Array: ");
        int n2 = sc.nextInt();
        int[] A2 = new int[n2];
        for (int i = 0; i < n2;i++){
            System.out.print("A[" + i + "]: ");
            A2[i] = sc.nextInt();
        }
        System.out.println("\n -> The Concatenate Array: ");
       int[] A3 = new int[n1 + n2];
       for (int i = 0; i < n1;i++){
           A3[i] = A1[i];
       }
       for (int i = 0; i < n2;i++){
           A3[n1 + i] = A2[i];
       }
        for (int i =0 ;i < A3.length;i++){
            System.out.print(A3[i] + " ");
        }
        System.out.println("\n The concatenate Array after sorting: ");
        for (int i =0; i < A3.length -1 ;i++){
            for (int j = 0; j < A3.length - i - 1;j++){
                if (A3[j] > A3[j+1] ){
                    int temp = A3[j];
                    A3[j] = A3[j+1];
                    A3[j+1] = temp;
                }
            }
     
        }
        for (int i = 0; i <A3.length;i++){
              System.out.print(A3[i] +" ");
        }
                
    
    }
   
}
