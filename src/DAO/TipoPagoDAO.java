/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.TipoPago;
import generales.BD;
import org.json.JSONArray;

/**
 *
 * @author amlazo
 */
public class TipoPagoDAO {
    public static boolean Insertar(TipoPago tipoPago)
        {
            boolean sql = BD.sqlQuery("INSERT INTO `test`.`tipopago` (`idtpago`, `descripcion`) VALUES ('"+tipoPago.getIdPago()+"', '"+tipoPago.getDescripcion()+"');");
            //podria haber problemas con el null
            return sql;
        }

        public static boolean Actualizar(int idTipoPago, TipoPago tipoPago)
        {
            boolean sql = BD.sqlQuery("UPDATE `test`.`tipopago` SET `descripcion`='"+tipoPago.getDescripcion()+"' WHERE `idtpago`='"+idTipoPago+"';");
            return sql;
        }

        public static boolean Elimimar(int idTipoPago)
        {
            boolean sql = BD.sqlQuery("DELETE FROM `test`.`tipopago` WHERE `idtpago`='"+idTipoPago+"';");
            return sql;
        }


        public static JSONArray Leer(int idTipoPago)
        {
            JSONArray lista;
            lista=BD.sqlSelect(idTipoPago,"tipoPago");
            //For para la lista
            return lista;
        }

        public static JSONArray LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            JSONArray lista;
            lista=BD.sqlSelectAll("tipoPago");
            return lista;
            
        }
}
