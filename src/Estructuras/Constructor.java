/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Salvador Olivo
 */
public class Constructor {
     private int numConstructor;
    private int numEdificaciones;
    private int porcentaje;
    private int precioMadera;
    private int precioOro;
    

    public Constructor(int numConstructor, int numEdificaciones,int porcentaje) {
        this.numConstructor = numConstructor;
        this.numEdificaciones = numEdificaciones;
        porcentaje= 500;
        precioMadera = 1500;
        precioOro = 1500;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    

    public int getNumConstructor() {
        return numConstructor;
    }

    public void setNumConstructor(int numConstructor) {
        this.numConstructor = numConstructor;
    }

    public int getNumEdificaciones() {
        return numEdificaciones;
    }

    public void setNumEdificaciones(int numEdificaciones) {
        this.numEdificaciones = numEdificaciones;
    }

    public int getPrecioMadera() {
        return precioMadera;
    }

    public void setPrecioMadera(int precioMadera) {
        this.precioMadera = precioMadera;
    }

    public int getPrecioOro() {
        return precioOro;
    }

    public void setPrecioOro(int precioOro) {
        this.precioOro = precioOro;
    }
    
    
}
