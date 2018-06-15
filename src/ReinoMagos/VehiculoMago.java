/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReinoMagos;

/**
 *
 * @author pc
 */
public class VehiculoMago {
    private String tipovehiculo;
    private int numTropasHechizeros;
    private int puntosAtkHechizeros;
    //constructores

    public VehiculoMago(String tipovehiculo, int numTropasHechizeros, int puntosAtkHechizeros) {
        this.tipovehiculo = tipovehiculo;
        this.numTropasHechizeros = numTropasHechizeros;
        this.puntosAtkHechizeros = puntosAtkHechizeros;
    }

    public String getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(String tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }

    public int getNumTropasHechizeros() {
        return numTropasHechizeros;
    }

    public void setNumTropasHechizeros(int numTropasHechizeros) {
        this.numTropasHechizeros = numTropasHechizeros;
    }

    public int getPuntosAtkHechizeros() {
        return puntosAtkHechizeros;
    }

    public void setPuntosAtkHechizeros(int puntosAtkHechizeros) {
        this.puntosAtkHechizeros = puntosAtkHechizeros;
    }
}
