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
public class Descuentos {
    int descuentos;
    String descripcion;
    int porcentajedesc;

    public Descuentos() {
    }

    public Descuentos(int descuentos, String descripcion, int porcentajedesc) {
        this.descuentos = descuentos;
        this.descripcion = descripcion;
        this.porcentajedesc = porcentajedesc;
    }

    public int getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(int descuentos) {
        this.descuentos = descuentos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPorcentajedesc() {
        return porcentajedesc;
    }

    public void setPorcentajedesc(int porcentajedesc) {
        this.porcentajedesc = porcentajedesc;
    }
    
    
}
