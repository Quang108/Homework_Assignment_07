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
public class Ex_12_Character_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("+ Enter a string: ");
        String s = sc.nextLine();
        
        int[] count = new int[26];
        
        for (int i =0; i < s.length();i++){
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z'){
                count[c - 'a']++;
            }
    }
        System.out.println("- Character frequencies: ");
        for (int i =0; i  < 26 ;i++) {
            if (count[i] > 0){
                System.out.println((char)(i + 'a') + ": " + count[i]);
        }
    }
    }
}
