/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author amlazo
 */
public class Ventas {
    int numeroBoleta;
    int precio;
    int descuentoTotal;
    int precioDesc;
    Date fecha;
    Date hora;
    int estado;
    int idTPago;
    int idSucursal;
    int idCliente;

    public Ventas() {
    }

    public Ventas(int numeroBoleta, int precio, int descuentoTotal, int precioDesc, Date fecha, Date hora, int estado, int idTPago, int idSucursal, int idCliente) {
        
        this.numeroBoleta = numeroBoleta;
        this.precio = precio;
        this.descuentoTotal = descuentoTotal;
        this.precioDesc = precioDesc;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.idTPago = idTPago;
        this.idSucursal = idSucursal;
        this.idCliente = idCliente;
    }
    
    public int getNumeroBoleta() {
        return numeroBoleta;
    }

    public void setNumeroBoleta(int numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getDescuentoTotal() {
        return descuentoTotal;
    }

    public void setDescuentoTotal(int descuentoTotal) {
        this.descuentoTotal = descuentoTotal;
    }

    public int getPrecioDesc() {
        return precioDesc;
    }

    public void setPrecioDesc(int precioDesc) {
        this.precioDesc = precioDesc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    

    public int getIdTPago() {
        return idTPago;
    }

    public void setIdTPago(int idTPago) {
        this.idTPago = idTPago;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
   }
