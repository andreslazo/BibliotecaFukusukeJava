/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Genero;
import generales.BD;
import org.json.JSONArray;

/**
 *
 * @author amlazo
 */
public class GeneroDAO {
    public static boolean Insertar(Genero genero)
        {
            boolean sql = BD.sqlQuery("INSERT INTO `test`.`genero` (`idgenero`, `descripcion`) VALUES ('"+genero.getIdGenero()+"', '"+genero.getDescripcion()+"');");
            //podria haber problemas con el null
            return sql;
        }

        public static boolean Actualizar(int idGenero, Genero genero)
        {
            boolean sql = BD.sqlQuery("UPDATE `test`.`genero` SET `descripcion`='"+genero.getDescripcion()+"' WHERE `idgenero`='"+idGenero+"';");
            return sql;
        }

        public static boolean Elimimar(int idGenero)
        {
            boolean sql = BD.sqlQuery("DELETE FROM `test`.`genero` WHERE `idgenero`='"+idGenero+"';");    
            return sql;
        }


        public static JSONArray Leer(int idGenero)
        {
            JSONArray lista;
            lista=BD.sqlSelect(idGenero,"genero","idgenero");
            //For para la lista
            return lista;
        }

        public static JSONArray LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            JSONArray lista;
            lista=BD.sqlSelectAll("genero");
            return lista;
            
        }
}
