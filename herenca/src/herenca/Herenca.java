
package herenca;


public class Herenca {

    
    public static void main(String[] args) {
        
        Animal qualquer = new Animal();
        Cao cao = new Cao();
        
        qualquer.correr();
        cao.correr();
        
        /*cao.setCor("Branco");
        System.out.print(cao.getCor()); */
        
        cao.latir();
        
    }
    
}
