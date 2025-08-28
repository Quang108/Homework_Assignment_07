/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_07_Arrays;
import java.util.ArrayList;
/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Ex_14_Removing_Elements {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("+ Enter number of elements: ");
        int n = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i =0; i < n;i++){
            System.out.print("A[" + i + "]: ");
            list.add(sc.nextInt());
        }
        System.out.println("-> Original list: " + list);
        
        for (int i =list.size() -1 ;i >= 0;i--){
            if (list.get(i) > 50){
                list.remove(i);
            }
        }
        System.out.println("-> List after removing elements > 50: " + list);
    }
}
