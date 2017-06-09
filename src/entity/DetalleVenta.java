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
public class DetalleVenta {
    int idDVenta;
    int idPromo;
    int idProducto;
    int idVenta;

    public DetalleVenta() {
    }

    public DetalleVenta(int idDVenta, int idPromo, int idProducto, int idVenta) {
        this.idDVenta = idDVenta;
        this.idPromo = idPromo;
        this.idProducto = idProducto;
        this.idVenta = idVenta;
    }

    public int getIdDVenta() {
        return idDVenta;
    }

    public void setIdDVenta(int idDVenta) {
        this.idDVenta = idDVenta;
    }

    public int getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(int idPromo) {
        this.idPromo = idPromo;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }
    
    
}
