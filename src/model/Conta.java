/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author pedro
 */
public class Conta {
    
    private int numero;
    private String titular;
    double saldo;
    double LimiteDeSaque;

    public Conta() {
    }

    public Conta(int numero, String titular, double saldo, double limite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.LimiteDeSaque = limite;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getLimiteDeSaque() {
        return LimiteDeSaque;
    }

    public void setLimiteDeSaque(double LimiteDeSaque) {
        this.LimiteDeSaque = LimiteDeSaque;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void saque (double valor) throws DomainException{
        if(valor > this.LimiteDeSaque){
            throw new DomainException("valor de saque eh maior do que o valor limite de saque");
        } else if (this.saldo == 0){
            throw new DomainException("A conta nao tem saldo");
        } else if ( valor >this.saldo){
            throw new DomainException("conta nao tem saldo suficiente para realizar esse saque");
        }
        this.saldo -= valor;
    }
    
    public void depositar (double valor){
        this.saldo += valor;
    }
}
