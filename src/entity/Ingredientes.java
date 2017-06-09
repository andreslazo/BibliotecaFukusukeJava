/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author amlazo
 */
public class Ingredientes {
    int idIngrediente;
    String nombre;
    int idCatIngred;

    public Ingredientes() {
    }

    public Ingredientes(int idIngrediente, String nombre, int idCatIngred) {
        this.idIngrediente = idIngrediente;
        this.nombre = nombre;
        this.idCatIngred = idCatIngred;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCatIngred() {
        return idCatIngred;
    }

    public void setIdCatIngred(int idCatIngred) {
        this.idCatIngred = idCatIngred;
    }
    
    
}
