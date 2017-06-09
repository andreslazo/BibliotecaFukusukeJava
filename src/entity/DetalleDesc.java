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
public class DetalleDesc {
    int idDDesc;
    int idDescuento;
    int idVenta;

    public DetalleDesc() {
    }

    public DetalleDesc(int idDDesc, int idDescuento, int idVenta) {
        this.idDDesc = idDDesc;
        this.idDescuento = idDescuento;
        this.idVenta = idVenta;
    }

    public int getIdDDesc() {
        return idDDesc;
    }

    public void setIdDDesc(int idDDesc) {
        this.idDDesc = idDDesc;
    }

    public int getIdDescuento() {
        return idDescuento;
    }

    public void setIdDescuento(int idDescuento) {
        this.idDescuento = idDescuento;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }
    
    
}
