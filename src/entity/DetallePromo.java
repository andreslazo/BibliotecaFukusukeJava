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
public class DetallePromo {

    int idDetPromo;
    int idPromo;
    int idProducto;
    
    public DetallePromo() {
    }

    public DetallePromo(int idDetPromo, int idPromo, int idProducto) {
        this.idDetPromo = idDetPromo;
        this.idPromo = idPromo;
        this.idProducto = idProducto;
    }

    public int getIdDetPromo() {
        return idDetPromo;
    }

    public void setIdDetPromo(int idDetPromo) {
        this.idDetPromo = idDetPromo;
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
    
    
}
