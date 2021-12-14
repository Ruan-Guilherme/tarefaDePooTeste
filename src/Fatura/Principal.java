/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fatura;
import java.util.Scanner;
/**
 *
 * @author IFSC
 */
public class Principal {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
       
        double quilwttvl;
        int quilQts;
        double Slar;
        int quilwttC;
        double vltd;  
        double vldc;
        
        
        
        
        // salario minimio  1.192,40       
        
        System.out.println("Digite o salario minimo: ");
         Slar = scanner.nextDouble();
        System.out.println("digite a quantidade de quilowatt usados: ");
        quilQts = scanner.nextInt();
        
        quilwttvl = Slar/5;
        
        vltd = quilwttvl * quilQts;
        
        vldc = vltd-0.17;
        
        System.out.println("Valor total: "+vltd);
        System.out.println("--------------------");
        System.out.println("Valor com desconto: "+vldc);
        System.out.println("--------------------");
        System.out.println("Valor do quilowatt: "+quilQts);
        
        
        
    }
    
}
