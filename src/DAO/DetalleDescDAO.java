/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.DetalleDesc;
import generales.BD;
import org.json.JSONArray;

/**
 *
 * @author amlazo
 */
public class DetalleDescDAO {
    public static boolean Insertar(DetalleDesc detalleDesc)
        {
            boolean sql = BD.sqlQuery("INSERT INTO `test`.`detalledesc` (`idddesc`, `descuentos_iddescuento`, `ventas_idventa`) VALUES ('"+detalleDesc.getIdDDesc()+"', '"+detalleDesc.getIdDescuento()+"', '"+detalleDesc.getIdVenta()+"');");
            //podria haber problemas con el null
            return sql;
        }

        public static boolean Actualizar(int idDetalleDesc, DetalleDesc detalleDesc)
        {
            boolean sql = BD.sqlQuery("UPDATE `test`.`detalledesc` SET `descuentos_iddescuento`='"+detalleDesc.getIdDescuento()+"', `ventas_idventa`='"+detalleDesc.getIdVenta()+"' WHERE `idddesc`='"+idDetalleDesc+"';");
            return sql;
        }

        public static boolean Elimimar(int idDetalleDesc)
        {
            boolean sql = BD.sqlQuery("DELETE FROM `test`.`detalledesc` WHERE `idddesc`='"+idDetalleDesc+"';");
            return sql;
        }


        public static JSONArray Leer(int idDetalleDesc)
        {
            JSONArray lista;
            lista=BD.sqlSelect(idDetalleDesc,"detalledesc","idddesc");
            //For para la lista
            return lista;
        }

        public static JSONArray LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            JSONArray lista;
            lista=BD.sqlSelectAll("detalleDesc");
            return lista;
            
        }
}
