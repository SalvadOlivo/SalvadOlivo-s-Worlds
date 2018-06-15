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
public class GuerreroMago {
     private int puntosAtkHechizeros;
    private int puntosvida;
    private int numtropas;

    public GuerreroMago(int puntosAtkHechizeros, int puntosvida, int numtropas) {
        this.puntosAtkHechizeros = puntosAtkHechizeros;
        this.puntosvida = puntosvida;
        this.numtropas = numtropas;
    }

    public int getPuntosAtkHechizeros() {
        return puntosAtkHechizeros;
    }

    public void setPuntosAtkHechizeros(int puntosAtkHechizeros) {
        this.puntosAtkHechizeros = puntosAtkHechizeros;
    }

    public int getPuntosvida() {
        return puntosvida;
    }

    public void setPuntosvida(int puntosvida) {
        this.puntosvida = puntosvida;
    }

    public int getNumtropas() {
        return numtropas;
    }

    public void setNumtropas(int numtropas) {
        this.numtropas = numtropas;
    }
}
