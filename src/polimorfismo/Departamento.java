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
public class Departamento extends Edificio {
    private int numero_interior;
    private int numero_cuartos;

    public Departamento(String direccion, 
                        int pisos, 
                        int numero_interior,
                        int numero_cuartos) {
        
        super(direccion, pisos);
        this.numero_interior = numero_interior;
        this.numero_cuartos = numero_cuartos;
    }

    public int getNumero_interior() {
        return numero_interior;
    }

    public void setNumero_interior(int numero_interior) {
        this.numero_interior = numero_interior;
    }

    public int getNumero_cuartos() {
        return numero_cuartos;
    }

    public void setNumero_cuartos(int numero_cuartos) {
        this.numero_cuartos = numero_cuartos;
    }
    
    @Override
    public String getDatos(){
        return "Direccion:" + getDireccion() +
                "Cantidad de pisos:" + getPisos() +
                "Numero interior:" + numero_interior + 
               "Numero de cueartos" + numero_cuartos;
    }
    
}
