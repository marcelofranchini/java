/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marcelo
 */
public class ClassePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        
        minhaConta.depositar(200);
        minhaConta.sacar(122.22);
        
       // System.out.println(minhaConta.saldo); agora é private
        
        System.out.println(minhaConta.mostrarSaldo());
        
    }
    
}
