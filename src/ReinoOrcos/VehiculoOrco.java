/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReinoOrcos;

/**
 *
 * @author pc
 */
public class VehiculoOrco {
    private String tipovehiculo;
    private int numTropasCriatura;
    private int puntosAtkCriatura;
    
    //Constructor
    public VehiculoOrco(String tipoCriatura, int numTropasCriatura) {
        this.tipovehiculo = tipoCriatura;
        this.numTropasCriatura = numTropasCriatura;
        puntosAtkCriatura = 100;
    }
    
    //Setter y Getter
    public String getTipoCriatura() {
        return tipovehiculo;
    }

    public void setTipoCriatura(String tipoCriatura) {
        this.tipovehiculo = tipoCriatura;
    }

    public int getNumTropasCriatura() {
        return numTropasCriatura;
    }

    public void setNumTropasCriatura(int numTropasCriatura) {
        this.numTropasCriatura = numTropasCriatura;
    }
    
}
