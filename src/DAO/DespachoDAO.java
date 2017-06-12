/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Despacho;
import generales.BD;
import org.json.JSONArray;

/**
 *
 * @author amlazo
 */
public class DespachoDAO {
    public static boolean Insertar(Despacho despacho)
        {
            //podria haber problemas con el null
            boolean sql = BD.sqlQuery("INSERT INTO `test`.`despacho` (`iddespacho`, `empleados_idempleado`, `detalleventa_iddventa`) VALUES ('"+despacho.getIdDespacho()+"', '"+despacho.getIdEmpleado()+"', '"+despacho.getIdDVenta()+"');");
            return sql;
        }
    
        public static boolean Actualizar(int idDespacho, Despacho despacho)
        {
            boolean sql = BD.sqlQuery("UPDATE `test`.`despacho` SET `empleados_idempleado`='"+despacho.getIdEmpleado()+"', `detalleventa_iddventa`='"+despacho.getIdDVenta()+"' WHERE `iddespacho`='"+idDespacho+"';");
            return sql;
        }

        public static boolean Elimimar(int idDespacho)
        {
            boolean sql = BD.sqlQuery("DELETE FROM `test`.`despacho` WHERE `iddespacho`='"+idDespacho+"';");
            return sql;
        }


        public static JSONArray Leer(int idDespacho)
        {
            JSONArray lista;
            lista=BD.sqlSelect(idDespacho,"despacho","iddespacho");
            //For para la lista
            return lista;
        }

        public static JSONArray LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            JSONArray lista;
            lista=BD.sqlSelectAll("despacho");
            return lista;
            
        }
}
