/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Comuna;
import generales.BD;
import org.json.JSONArray;

/**
 *
 * @author amlazo
 */
public class ComunaDAO {
    public static boolean Insertar(Comuna comuna)
        {
            //podria haber problemas con el null
            boolean sql = BD.sqlQuery("INSERT INTO `test`.`comuna` (`idcomuna`, `nombre`, `region_idregion`) VALUES ('1', 'holi', '2');");
            return sql;
        }

        public static boolean Actualizar(int idComuna, Comuna comuna)
        {
            boolean sql = BD.sqlQuery("UPDATE `test`.`comuna` SET `idcomuna`='2', `nombre`='fg', `region_idregion`='3' WHERE `idcomuna`='1';");
            return sql;
        }

        public static boolean Elimimar(int idComuna)
        {
            boolean sql = BD.sqlQuery("DELETE FROM `test`.`comuna` WHERE `idcomuna`='1';");
            return sql;
        }


        public static JSONArray Leer(int idComuna)
        {
            JSONArray lista;
            lista=BD.sqlSelect(idComuna,"comuna");
            //For para la lista
            return lista;
        }

        public static JSONArray LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            JSONArray lista;
            lista=BD.sqlSelectAll("comuna");
            return lista;
            
        }
}
