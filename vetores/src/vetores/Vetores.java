
package vetores;


public class Vetores {


    public static void main(String[] args) {
        /*int vet [] = {1,2,3,4,5,6,7};
        System.out.println(vet.length);
        for (int i = 0; i <=7; i++){
        System.out.println("Na posição vet " + i + " O valor é " + vet[i]);
        } */
        
        String mes [] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho",
            "julho","agosto", "stembro", "outubro", "novembro", "dezembro"};
        
        int dias [] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        for(int i = 0; i < mes.length; i++){
        
            System.out.println("O mes " + mes[i] +" tem " + dias[i]+ " dias");
     
        
        }
        
        
        
    }
    
}
