/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Sucursal;
import generales.BD;
import org.json.JSONArray;

/**
 *
 * @author amlazo
 */
public class SucursalDAO {
    public static boolean Insertar(Sucursal sucursal)
        {
            boolean sql = BD.sqlQuery("INSERT INTO `test`.`sucursal` (`idsucursal`, `calle`, `numero`, `descripcion`, `comuna_idcomuna`, `empleados_idempleado`) VALUES ('"+sucursal.getIdSucursal()+"', '"+sucursal.getCalle()+"', '"+sucursal.getNumero()+"', '"+sucursal.getDescripcion()+"', '"+sucursal.getIdComuna()+"', '"+sucursal.getIdEmpleado()+"');");
            //podria haber problemas con el null
            return sql;
        }

        public static boolean Actualizar(int idSucursal, Sucursal sucursal)
        {
            boolean sql = BD.sqlQuery("UPDATE `test`.`sucursal` SET `calle`='"+sucursal.getCalle()+"', `numero`='"+sucursal.getNumero()+"', `descripcion`='"+sucursal.getDescripcion()+"', `comuna_idcomuna`='"+sucursal.getIdComuna()+"', `empleados_idempleado`='"+sucursal.getIdEmpleado()+"' WHERE `idsucursal`='"+idSucursal+"';");
            return sql;
        }

        public static boolean Elimimar(int idSucursal)
        {
            boolean sql = BD.sqlQuery("DELETE FROM `test`.`sucursal` WHERE `idsucursal`='"+idSucursal+"';");
            return sql;
        }


        public static JSONArray Leer(int idSucursal)
        {
            JSONArray lista;
            lista=BD.sqlSelect(idSucursal,"sucursal","idsucursal");
            //For para la lista
            return lista;
        }

        public static JSONArray LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            JSONArray lista;
            lista=BD.sqlSelectAll("sucursal");
            return lista;
            
        }
}
