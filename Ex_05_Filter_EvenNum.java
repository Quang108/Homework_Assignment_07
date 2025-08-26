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


public class Ex_05_Filter_EvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("+ Enter the number of elements in array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i =0;i < n;i++ ){
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }
        
        ArrayList<Integer> EvenList = new ArrayList<>();
        for (int i =0; i <n;i++){
            if (A[i] % 2 == 0){
                EvenList.add(A[i]);
            }
        }
        System.out.println("-> Array list containing: " + EvenList);
    }
}

