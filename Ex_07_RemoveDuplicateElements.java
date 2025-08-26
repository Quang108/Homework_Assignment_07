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
public class Ex_07_RemoveDuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("+ Enter the number of elements in array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n;i++){
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }
        ArrayList<Integer> Original = new ArrayList<>();
        for (int i =0; i < n;i++){
            Original.add(A[i]);
        }
        System.out.println("-> Original list: " + Original);
        
        ArrayList<Integer> NewList = new ArrayList<>();
        for (int i = 0; i < Original.size();i++){
            int temp= Original.get(i);
            boolean isDuplicate = false;
            
            for (int j = 0; j < NewList.size();j++){
                if (NewList.get(j) == temp) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                NewList.add(temp);
            }
        }
        System.out.println("-> The Array list without duplicate: " + NewList);
        
        /*Scanner sc = new Scanner(System.in);
        System.out.print("+ Enter numbers of the elements in array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        
        for (int i =0; i < n;i++){
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }
        ArrayList<Integer> AList = new ArrayList<>();
        for (int i = 0; i < n;i++){
             AList.add(A[i]);
        }
        System.out.println("-> Original list: " + AList);
        
        ArrayList<Integer> NewList = new ArrayList<>();
        for (int i =0;i < AList.size();i++){
            int current = AList.get(i);
            boolean isDuplicate = false;
            for (int j = 0; j <NewList.size();j++){
                if (NewList.get(j) == current){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                NewList.add(current);
            }
        }
            System.out.println("-> List without duplicates: " + NewList);
        */
        sc.close();
    }
}
