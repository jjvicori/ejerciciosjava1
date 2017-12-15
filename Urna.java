/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eejercicio51;

/**
 *
 * @author josej
 */
public class Urna {
    String color_bolas[];
    int numero_bolas;

    public Urna() {
        
    }
    
    public Urna(int numero_bolas, String[] color_bolas) {
        this.color_bolas = color_bolas;
        this.numero_bolas = numero_bolas;
    }

    public int getNumero_bolas() {
        return numero_bolas;
    }

    public void setNumero_bolas(int numero_bolas) {
        this.numero_bolas = numero_bolas;
        this.color_bolas = new String[numero_bolas];
    }

    public String getColor_bolas(int posicion) {
        return color_bolas[posicion];
    }

    public void setColor_bolas(int posicion,String color) {
        this.color_bolas[posicion] = color;
    }
}
