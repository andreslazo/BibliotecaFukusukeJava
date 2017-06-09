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
public class Despacho {
    int idDespacho;
    int idEmpleado;
    int idDVenta;

    public Despacho() {
    }

    public Despacho(int idDespacho, int idEmpleado, int idDVenta) {
        this.idDespacho = idDespacho;
        this.idEmpleado = idEmpleado;
        this.idDVenta = idDVenta;
    }

    public int getIdDespacho() {
        return idDespacho;
    }

    public void setIdDespacho(int idDespacho) {
        this.idDespacho = idDespacho;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdDVenta() {
        return idDVenta;
    }

    public void setIdDVenta(int idDVenta) {
        this.idDVenta = idDVenta;
    }
    
    
}
