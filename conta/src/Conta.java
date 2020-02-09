/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marcelo
 */
public class Conta {
    
    private int numeroConta;
    private double saldo = 100;
    
    public void depositar(double valorDepositar){
        this.saldo += valorDepositar;
    
    }
    
    public void sacar(double valorSacar){
        this.saldo -= valorSacar;
        
    }
    
    public double mostrarSaldo(){
        return this.saldo;
    }
}
