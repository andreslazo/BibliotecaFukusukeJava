/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.DetalleProd;
import generales.BD;
import java.util.ArrayList;

/**
 *
 * @author amlazo
 */
public class DetalleProdDAO {
    public static boolean Insertar(DetalleProd detalleProd)
        {
            boolean sql = BD.sqlQuery("INSERT INTO `test`.`detalleprod` (`iddprod`, `producto_idproducto`, `ingredientes_idingrediente`) VALUES ('"+detalleProd.getIdDProd()+"', '"+detalleProd.getIdProducto()+"', '"+detalleProd.getIdIngrediente()+"');");
            //podria haber problemas con el null
            return sql;
        }

        public static boolean Actualizar(int idDetalleProd, DetalleProd detalleProd)
        {
            boolean sql = BD.sqlQuery("UPDATE `test`.`detalleprod` SET `producto_idproducto`='"+detalleProd.getIdProducto()+"', `ingredientes_idingrediente`='"+detalleProd.getIdIngrediente()+"' WHERE `iddprod`='"+idDetalleProd+"';");
            return sql;
        }

        public static boolean Elimimar(int idDetalleProd)
        {
            boolean sql = BD.sqlQuery("DELETE FROM `test`.`detalleprod` WHERE `iddprod`='"+idDetalleProd+"';");
            return sql;
        }


        public static ArrayList Leer(int idDetalleProd)
        {
            ArrayList<String> lista;
            lista=BD.sqlSelect(idDetalleProd,"detalleProd");
            //For para la lista
            return lista;
        }

        public static ArrayList LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            ArrayList<String> lista;
            lista=BD.sqlSelectAll("detalleProd");
            return lista;
            
        }
}
