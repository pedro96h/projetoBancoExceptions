/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobancoexceptions;

import java.util.Scanner;
import model.Conta;
import model.DomainException;

/**
 *
 * @author pedro
 */
public class ProjetoBancoExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("digite os dados da conta ");
            System.out.print("numero : ");
            int numero = sc.nextInt();
            System.out.print("digite o nome do titular da conta : ");
            sc.next();
            String titular = sc.nextLine();
            System.out.print("digite o saldo inicial : ");
            double saldo = sc.nextDouble();
            System.out.print("digite o limite de saque :");
            double limiteDeSaque = sc.nextInt();
            
            Conta c = new Conta(numero, titular, saldo, limiteDeSaque);
            
            System.out.print("\ndigite um valor para saque : ");
            double saque = sc.nextDouble();
            c.saque(saque);
            System.out.println("o novo saldo vale : "+c.getSaldo());
        }
        catch(DomainException e){
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }
    
}
