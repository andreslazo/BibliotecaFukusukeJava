/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.DetallePromo;
import generales.BD;
import java.util.ArrayList;

/**
 *
 * @author amlazo
 */
public class DetallePromoDAO {
    public static boolean Insertar(DetallePromo detallePromo)
        {
            boolean sql = BD.sqlQuery("INSERT INTO `test`.`detallepromo` (`iddetpromo`, `promociones_idpromo`, `producto_idproducto`) VALUES ('"+detallePromo.getIdDetPromo()+"', '"+detallePromo.getIdPromo()+"', '"+detallePromo.getIdProducto()+"');");
            //podria haber problemas con el null
            return sql;
        }

        public static boolean Actualizar(int idDetallePromo, DetallePromo detallePromo)
        {
            boolean sql = BD.sqlQuery("UPDATE `test`.`detallepromo` SET `promociones_idpromo`='"+detallePromo.getIdPromo()+"', `producto_idproducto`='"+detallePromo.getIdProducto()+"' WHERE `iddetpromo`='"+idDetallePromo+"';");
            return sql;
        }

        public static boolean Elimimar(int idDetallePromo)
        {
            boolean sql = BD.sqlQuery("DELETE FROM `test`.`detallepromo` WHERE `iddetpromo`='"+idDetallePromo+"';");
            return sql;
        }


        public static ArrayList Leer(int idDetallePromo)
        {
            ArrayList<String> lista;
            lista=BD.sqlSelect(idDetallePromo,"detallePromo");
            //For para la lista
            return lista;
        }

        public static ArrayList LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            ArrayList<String> lista;
            lista=BD.sqlSelectAll("detallePromo");
            return lista;
            
        }
}
