/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.CatIngred;
import generales.BD;
import org.json.JSONArray;

/**
 *
 * @author amlazo
 */
public class CatIngredDAO {
    public static boolean Insertar(CatIngred catIngred)
        {
            //podria haber problemas con el null
            boolean sql = BD.sqlQuery("INSERT INTO `test`.`catingred` (`idcatingred`, `descripcion`) VALUES ('"+catIngred.getIdCatIngred()+"', '"+catIngred.getDescripcion()+"');");
            return sql;
        }

        public static boolean Actualizar(int idCatIngred, CatIngred catIngred)
        {
            boolean sql = BD.sqlQuery("UPDATE `test`.`catingred` SET `idcatingred`='"+catIngred.getIdCatIngred()+"', `descripcion`='"+catIngred.getDescripcion()+"' WHERE `idcatingred`='"+idCatIngred+"';");
            return sql;
        }

        public static boolean Elimimar(int idCatIngred)
        {
            boolean sql = BD.sqlQuery("DELETE FROM `test`.`catingred` WHERE `idcatingred`='"+idCatIngred+"';");
            return sql;
        }


        public static JSONArray Leer(int idCatIngred)
        {
            JSONArray lista;
            lista=BD.sqlSelect(idCatIngred,"catingred","idcatingred");
            //For para la lista
            return lista;
        }

        public static JSONArray LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from catingred");
            JSONArray lista;
            lista=BD.sqlSelectAll("catingred");
            return lista;
            
        }
}
