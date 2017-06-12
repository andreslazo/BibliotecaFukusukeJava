/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Producto;
import generales.BD;
import org.json.JSONArray;

/**
 *
 * @author amlazo
 */
public class ProductoDAO {
    public static boolean Insertar(Producto producto)
        {
            boolean sql = BD.sqlQuery("INSERT INTO `test`.`producto` (`idproducto`, `nombre`, `precio`, `sucursal_idsucursal`) VALUES ('"+producto.getIdProducto()+"', '"+producto.getNombre()+"', '"+producto.getPrecio()+"', '"+producto.getIdSucursal()+"');");
            //podria haber problemas con el null
            return sql;
        }

        public static boolean Actualizar(int idProducto, Producto producto)
        {
            boolean sql = BD.sqlQuery("UPDATE `test`.`producto` SET `nombre`='"+producto.getNombre()+"', `precio`='"+producto.getPrecio()+"', `sucursal_idsucursal`='"+producto.getIdSucursal()+"' WHERE `idproducto`='"+idProducto+"';");
            return sql;
        }

        public static boolean Elimimar(int idProducto)
        {
            boolean sql = BD.sqlQuery("DELETE FROM `test`.`producto` WHERE `idproducto`='"+idProducto+"';");
            return sql;
        }


        public static JSONArray Leer(int idProducto)
        {
            JSONArray lista;
            lista=BD.sqlSelect(idProducto,"producto");
            //For para la lista
            return lista;
        }

        public static JSONArray LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            JSONArray lista;
            lista=BD.sqlSelectAll("producto");
            return lista;
            
        }
}
