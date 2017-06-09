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
public class DetalleProd {
    int idDProd;
    int idProducto;
    int idIngrediente;

    public DetalleProd() {
    }

    public DetalleProd(int idDProd, int idProducto, int idIngrediente) {
        this.idDProd = idDProd;
        this.idProducto = idProducto;
        this.idIngrediente = idIngrediente;
    }

    public int getIdDProd() {
        return idDProd;
    }

    public void setIdDProd(int idDProd) {
        this.idDProd = idDProd;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }
    
    
}
