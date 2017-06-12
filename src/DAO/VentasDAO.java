/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Ventas;
import generales.BD;
import org.json.JSONArray;

/**
 *
 * @author amlazo
 */
public class VentasDAO {
    public static boolean Insertar(Ventas ventas)
        {
            boolean sql = BD.sqlQuery("INSERT INTO `test`.`ventas` (`idventa`, `numeroboleta`, `precio`, `descuentototal`, `preciodesc`, `fecha`, `hora`, `tipopago_idtpago`, `sucursal_idsucursal`, `clientes_idcliente`) VALUES ('"+ventas.getIdVenta()+"', '"+ventas.getNumeroBoleta()+"', '"+ventas.getPrecio()+"', '"+ventas.getDescuentoTotal()+"', '"+ventas.getPrecioDesc()+"', '"+ventas.getFecha()+"', '"+ventas.getHora()+"', '"+ventas.getIdTPago()+"', '"+ventas.getIdSucursal()+"', '"+ventas.getIdCliente()+"');");
            //podria haber problemas con el null
            return sql;
        }

        public static boolean Actualizar(int idVentas, Ventas ventas)
        {
            boolean sql = BD.sqlQuery("UPDATE `test`.`ventas` SET `numeroboleta`='"+ventas.getNumeroBoleta()+"', `precio`='"+ventas.getPrecio()+"', `descuentototal`='"+ventas.getDescuentoTotal()+"', `preciodesc`='"+ventas.getPrecioDesc()+"', `fecha`='"+ventas.getFecha()+"', `hora`='"+ventas.getHora()+"', `tipopago_idtpago`='"+ventas.getIdTPago()+"', `sucursal_idsucursal`='"+ventas.getIdSucursal()+"', `clientes_idcliente`='"+ventas.getIdCliente()+"' WHERE `idventa`='"+idVentas+"';");
            return sql;
        }

        public static boolean Elimimar(int idVentas)
        {
            boolean sql = BD.sqlQuery("DELETE FROM `test`.`ventas` WHERE `idventa`='"+idVentas+"';");
            return sql;
        }


        public static JSONArray Leer(int idVentas)
        {
            JSONArray lista;
            lista=BD.sqlSelect(idVentas,"ventas");
            //For para la lista
            return lista;
        }

        public static JSONArray LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            JSONArray lista;
            lista=BD.sqlSelectAll("ventas");
            return lista;
            
        }
}
