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
public class CatIngred {
    int idCatIngred;
    String descripcion;

    public CatIngred() {
    }

    public CatIngred(int idCatIngred, String descripcion) {
        this.idCatIngred = idCatIngred;
        this.descripcion = descripcion;
    }

    public int getIdCatIngred() {
        return idCatIngred;
    }

    public void setIdCatIngred(int idCatIngred) {
        this.idCatIngred = idCatIngred;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
