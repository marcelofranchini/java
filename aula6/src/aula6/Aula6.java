/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class Aula6 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
       
        System.out.print("Digite o Nome do Aluno: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite a nota do Aluno: ");
        float nota = entrada.nextFloat();
        
        System.out.printf("A nota do %s foi %.2f ", nome, nota);
        
    }
    
}
