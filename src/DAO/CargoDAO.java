/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Cargo;
import generales.BD;
import java.util.ArrayList;

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


        public static ArrayList Leer(int idCargo)
        {
            ArrayList<String> lista;
            lista=BD.sqlSelect(idCargo,"cargo");
            //For para la lista
            return lista;
        }

        public static ArrayList LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            ArrayList<String> lista;
            lista=BD.sqlSelectAll("cargo");
            return lista;
            
        }
}