/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Empleados;
import generales.BD;
import org.json.JSONArray;

/**
 *
 * @author amlazo
 */
public class EmpleadosDAO {
    public static boolean Insertar(Empleados empleados)
        {
            boolean sql = BD.sqlQuery("INSERT INTO `test`.`empleados` (`idempleado`, `rut`, `dv`, `nombre`, `appat`, `apmat`, `celular`, `mail`, `activo`, `comuna_idcomuna`, `cargo_idcargo`) VALUES ('"+empleados.getIdEmpleado()+"', '"+empleados.getRut()+"', '"+empleados.getDv()+"', '"+empleados.getNombre()+"', '"+empleados.getApPat()+"', '"+empleados.getApMat()+"', '"+empleados.getCelular()+"', '"+empleados.getMail()+"', '"+empleados.getActivo()+"', '"+empleados.getComuna()+"', '"+empleados.getIdCargo()+"');");
            //podria haber problemas con el null
            return sql;
        }

        public static boolean Actualizar(int idEmpleados, Empleados empleados)
        {
            boolean sql = BD.sqlQuery("UPDATE `test`.`empleados` SET `idempleado`='"+empleados.getIdEmpleado()+"', `rut`='"+empleados.getRut()+"', `dv`='"+empleados.getDv()+"', `nombre`='"+empleados.getNombre()+"', `appat`='"+empleados.getApPat()+"', `apmat`='"+empleados.getApMat()+"', `celular`='"+empleados.getCelular()+"', `mail`='"+empleados.getMail()+"', `activo`='"+empleados.getActivo()+"', `comuna_idcomuna`='"+empleados.getComuna()+"', `cargo_idcargo`='"+empleados.getIdCargo()+"' WHERE `idempleado`='"+idEmpleados+"';");
            return sql;
        }

        public static boolean Elimimar(int idEmpleados)
        {
            boolean sql = BD.sqlQuery("DELETE FROM `test`.`empleados` WHERE `idempleado`='"+idEmpleados+"';");
            return sql;
        }


        public static JSONArray Leer(int idEmpleados)
        {
            JSONArray lista;
            lista=BD.sqlSelect(idEmpleados,"empleados");
            //For para la lista
            return lista;
        }

        public static JSONArray LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            JSONArray lista;
            lista=BD.sqlSelectAll("empleados");
            return lista;
            
        }
}
