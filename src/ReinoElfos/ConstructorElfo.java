/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReinoElfos;

/**
 *
 * @author Salvador Olivo
 */
public class ConstructorElfo {
      private String tipoConstructor;
    private int duracionElfos;
    
    //constructores

    public ConstructorElfo(String tipoConstructor, int duracionElfos) {
        this.tipoConstructor = tipoConstructor;
        this.duracionElfos = duracionElfos;
    }
    // SET Y GET

    public void setTipoConstructor(String tipoConstructor) {
        this.tipoConstructor = tipoConstructor;
    }

    public void setDuracionElfos(int duracionElfos) {
        this.duracionElfos = duracionElfos;
    }

    public String getTipoConstructor() {
        return tipoConstructor;
    }

    public int getDuracionElfos() {
        return duracionElfos;
    }
    
}
