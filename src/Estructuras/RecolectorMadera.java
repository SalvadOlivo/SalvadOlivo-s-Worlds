/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author pc
 */
public class RecolectorMadera {
     private int numMadera;
    private int numEdificaciones;
    private int porcentaje;
    private int precioOro;

    public RecolectorMadera(int numMadera, int numEdificaciones, int porcentaje) {
        this.numMadera = numMadera;
        this.numEdificaciones = numEdificaciones;
        porcentaje= 500;
        precioOro = 200;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    public int getNumMadera() {
        return numMadera;
    }

    public void setNumMadera(int numMadera) {
        this.numMadera = numMadera;
    }

    public int getNumEdificaciones() {
        return numEdificaciones;
    }

    public void setNumEdificaciones(int numEdificaciones) {
        this.numEdificaciones = numEdificaciones;
    }

    public int getPrecioOro() {
        return precioOro;
    }

    public void setPrecioOro(int precioOro) {
        this.precioOro = precioOro;
    }
    
}
