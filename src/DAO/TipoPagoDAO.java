/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.TipoPago;
import generales.BD;
import java.util.ArrayList;

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


        public static ArrayList Leer(int idTipoPago)
        {
            ArrayList<String> lista;
            lista=BD.sqlSelect(idTipoPago,"tipoPago");
            //For para la lista
            return lista;
        }

        public static ArrayList LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            ArrayList<String> lista;
            lista=BD.sqlSelectAll("tipoPago");
            return lista;
            
        }
}
