/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author DAS
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Edificio edificio = new Edificio("Celaya", 10);
        System.out.println(edificio.getDatos());
        
        Edificio edificio_poli = new Departamento("Celaya", 10, 12, 4);
        System.out.println(edificio_poli.getDatos());
    }
    
}
