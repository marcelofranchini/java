/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Marcelo
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        soma(2,2);
        System.out.println(soma2(5,5));
        
    }
    
    
    static void soma (int a, int b){
    int soma = a + b;
    System.out.println(soma);
    }
    
    static int soma2 (int c, int d){
    int s = c + d;
    return s;
    }
    
}

