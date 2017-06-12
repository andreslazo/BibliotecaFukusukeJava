/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Ingredientes;
import generales.BD;
import org.json.JSONArray;

/**
 *
 * @author amlazo
 */
public class IngredientesDAO {
    public static boolean Insertar(Ingredientes ingredientes)
        {
            boolean sql = BD.sqlQuery("INSERT INTO `test`.`ingredientes` (`idingrediente`, `nombre`, `catingred_idcatingred`) VALUES ('"+ingredientes.getIdIngrediente()+"', '"+ingredientes.getNombre()+"', '"+ingredientes.getIdCatIngred()+"');");
            //podria haber problemas con el null
            return sql;
        }

        public static boolean Actualizar(int idIngredientes, Ingredientes ingredientes)
        {
            boolean sql = BD.sqlQuery("UPDATE `test`.`ingredientes` SET `nombre`='"+ingredientes.getNombre()+"', `catingred_idcatingred`='"+ingredientes.getIdCatIngred()+"' WHERE `idingrediente`='"+idIngredientes+"';");
            return sql;
        }

        public static boolean Elimimar(int idIngredientes)
        {
            boolean sql = BD.sqlQuery("DELETE FROM `test`.`ingredientes` WHERE `idingrediente`='"+idIngredientes+"';");
            return sql;
        }


        public static JSONArray Leer(int idIngredientes)
        {
            JSONArray lista;
            lista=BD.sqlSelect(idIngredientes,"ingredientes","idingrediente");
            //For para la lista
            return lista;
        }

        public static JSONArray LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            JSONArray lista;
            lista=BD.sqlSelectAll("ingredientes");
            return lista;
            
        }
}
