/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Cargo;
import generales.BD;
import org.json.JSONArray;

/**
 *
 * @author amlazo
 */
public class CargoDAO {
    public static boolean Insertar(Cargo cargo)
        {
            //podria haber problemas con el null
            boolean sql = BD.sqlQuery("INSERT INTO `cargo`(`idcargo`,`nombre`) VALUES ('"+cargo.getIdCargo()+"','"+cargo.getNombre()+"';");
            return sql;
        }

        public static boolean Actualizar(int idCargo, Cargo cargo)
        {
            boolean sql = BD.sqlQuery("UPDATE `cargo` SET `idcargo`='"+cargo.getIdCargo()+"', `nombre`='"+cargo.getNombre()+"' WHERE `idcargo`='"+idCargo+"';");
            return sql;
        }

        public static boolean Elimimar(int idCargo)
        {
            boolean sql = BD.sqlQuery("DELETE FROM 'cargo' WHERE 'idcargo'='"+idCargo+"';");
            return sql;
        }


        public static JSONArray Leer(int idCargo)
        {
            JSONArray lista;
            lista=BD.sqlSelect(idCargo,"cargo","idcargo");
            //For para la lista
            return lista;
        }

        public static JSONArray LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            JSONArray lista;
            lista=BD.sqlSelectAll("cargo");
            return lista;
            
        }
}
