
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TenM
 */
public class Ej369arena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int uwu;  
        do
        { 
            System.out.println("putos numeros");
            uwu = sc.nextInt();
            if (uwu != 0 & uwu <= 1000)
            {
                for (int i = 0; i < uwu; i++) {
                    System.out.print("1");
                }
                System.out.println();
            }
            
        } while (uwu != 0 & uwu <= 1000);
    }
    
}
