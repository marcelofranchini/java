/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenca;

/**
 *
 * @author Marcelo
 */
public class Animal {
    
    private String tamanho;
    private String cor;
    private double peso;
    
    public void correr(){
    System.out.println("Correr como um animal");
    }
    
    public void getCor(String cor){
        this.cor = cor;    
    }
    
    public String setCor(){
        return this.cor;
    }
    
}
