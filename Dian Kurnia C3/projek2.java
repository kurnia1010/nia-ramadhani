/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 
import java.util.Scanner;
/**
 *
 * @author A-28
 */
public class projek2 {
    public static void main(String[] args) {
        int nilaiA = 10;
        int nilaiB = 20;
        double varA = 10.1;
        double varB = 10.1;
        boolean isPlus = true;
        System.out.println("nilaiA = " + nilaiA);
        System.out.println("nilaiB = " + nilaiB);
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);
        System.out.println("isPlus = " + isPlus);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai baru untuk nilaiA (int): ");
        nilaiA = input.nextInt();
        System.out.println("nilaiA = " + nilaiA);
        
        System.out.println("Masukan nilai baru untuk nilaiB (int): ");
        nilaiB = input.nextInt();
        System.out.println("nilaiB = " + nilaiB);
        
        System.out.println("Masukan nilai baru untuk varA (double): ");
        varA = input.nextDouble();
        System.out.println("varA = " + varA);
        
        System.out.println("Masukan nilai baru untuk varB (double): ");
        varB = input.nextDouble();
        System.out.println("varB = " + varB);
        
        System.out.println("Masukan nilai baru untuk isPlus (boolean): ");
        isPlus = input.nextBoolean();
        System.out.println("isPlus = " + isPlus);
        
        System.out.println("Masukan nilai baru untuk stringVar: ");
        String stringVar = input.nextLine();
        System.out.println("stringVar = " + stringVar);
                
    
        
     
    }
    
}
