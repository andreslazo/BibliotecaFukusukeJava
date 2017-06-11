/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.DetalleVenta;
import generales.BD;
import java.util.ArrayList;

/**
 *
 * @author amlazo
 */
public class DetalleVentaDAO {
    public static boolean Insertar(DetalleVenta detalleVenta)
        {
            boolean sql = BD.sqlQuery("INSERT INTO `test`.`detalleventa` (`iddventa`, `promociones_idpromo`, `producto_idproducto`, `ventas_idventa`) VALUES ('"+detalleVenta.getIdDVenta()+"', '"+detalleVenta.getIdPromo()+"', '"+detalleVenta.getIdProducto()+"', '"+detalleVenta.getIdVenta()+"');");
            //podria haber problemas con el null
            return sql;
        }

        public static boolean Actualizar(int idDetalleVenta, DetalleVenta detalleVenta)
        {
            boolean sql = BD.sqlQuery("UPDATE `test`.`detalleventa` SET `promociones_idpromo`='"+detalleVenta.getIdPromo()+"', `producto_idproducto`='"+detalleVenta.getIdProducto()+"', `ventas_idventa`='"+detalleVenta.getIdVenta()+"' WHERE `iddventa`='"+idDetalleVenta+"';");
            return sql;
        }

        public static boolean Elimimar(int idDetalleVenta)
        {
            boolean sql = BD.sqlQuery("DELETE FROM `test`.`detalleventa` WHERE `iddventa`='"+idDetalleVenta+"';");
            return sql;
        }


        public static ArrayList Leer(int idDetalleVenta)
        {
            ArrayList<String> lista;
            lista=BD.sqlSelect(idDetalleVenta,"detalleVenta");
            //For para la lista
            return lista;
        }

        public static ArrayList LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            ArrayList<String> lista;
            lista=BD.sqlSelectAll("detalleVenta");
            return lista;
            
        }
}
