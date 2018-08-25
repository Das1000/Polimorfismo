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
public class Edificio {
    private String direccion;
    private int pisos;

    public Edificio(String direccion, int pisos) {
        this.direccion = direccion;
        this.pisos = pisos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }
    
    public String getDatos(){
        return "Dirección:" + direccion +
                "Pisos:" + pisos;
    }
    
}
