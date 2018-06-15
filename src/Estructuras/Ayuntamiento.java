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
public class Ayuntamiento {
        
    private int madera;
    private int oro;
    private int porcentaje;
    private int numConstructores;
    private int numBarracas;
    private int numRecOro;
    private int numRecMadera;
    private int numVehiculos;
    private int numGuerreros;
    

    public Ayuntamiento() {
        madera = 1000;
        oro = 1000;
        porcentaje = 1500;
        numConstructores = 1;
        numVehiculos = 0;
        numGuerreros = 0;
        numBarracas = 0;
        numRecMadera = 0;
        numRecOro = 0;
    }

    public int getMadera() {
        return madera;
    }

    public void setMadera(int madera) {
        this.madera = madera;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getNumConstructores() {
        return numConstructores;
    }

    public void setNumConstructores(int numConstructores) {
        this.numConstructores = numConstructores;
    }

    public int getNumVehiculos() {
        return numVehiculos;
    }

    public void setNumVehiculos(int numVehiculos) {
        this.numVehiculos = numVehiculos;
    }

    public int getNumGuerreros() {
        return numGuerreros;
    }

    public void setNumGuerreros(int numGuerreros) {
        this.numGuerreros = numGuerreros;
    }

    public int getNumBarracas() {
        return numBarracas;
    }

    public void masUnaBarraca() {
        numBarracas = numBarracas+1 ;
    }

    public int getNumRecOro() {
        return numRecOro;
    }

    public void setNumRecOro(int numRecOro) {
        this.numRecOro = numRecOro;
    }

    public int getNumRecMadera() {
        return numRecMadera;
    }

    public void setNumRecMadera(int numRecMadera) {
        this.numRecMadera = numRecMadera;
    }
    
    public void sumarOro(int recolectorOro){
        oro = oro + 100*(recolectorOro+1);
    }
    
    public void sumarMadera(int recolectorMadera){
        madera = madera + 100*(recolectorMadera+1);
    }
    
}
