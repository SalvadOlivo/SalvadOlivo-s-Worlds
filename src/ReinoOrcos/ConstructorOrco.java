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
public class ConstructorOrco {
        private String tipoConstructor;
    private int duracionHechizeros;

    public ConstructorOrco(String tipoConstructor, int duracionHechizeros) {
        this.tipoConstructor = tipoConstructor;
        this.duracionHechizeros = duracionHechizeros;
    }

    public String getTipoConstructor() {
        return tipoConstructor;
    }

    public void setTipoConstructor(String tipoConstructor) {
        this.tipoConstructor = tipoConstructor;
    }

    public int getDuracionHechizeros() {
        return duracionHechizeros;
    }

    public void setDuracionHechizeros(int duracionHechizeros) {
        this.duracionHechizeros = duracionHechizeros;
    }
}
