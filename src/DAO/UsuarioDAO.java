/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Usuario;
import generales.BD;
import org.json.JSONArray;

/**
 *
 * @author amlazo
 */
public class UsuarioDAO {
    public static boolean Insertar(Usuario usuario)
        {
            boolean sql = BD.sqlQuery("INSERT INTO `test`.`usuario` (`usuario`, `password`) VALUES ('"+usuario.getUsuario()+"', '"+usuario.getPassword()+"');");
            //podria haber problemas con el null
            return sql;
        }

        public static boolean Actualizar(String nombreUsuario, Usuario usuario)
        {
            boolean sql = BD.sqlQuery("UPDATE `test`.`usuario` SET `password`='"+usuario.getPassword()+"' WHERE `usuario`='"+nombreUsuario+"';");
            return sql;
        }

        public static boolean Elimimar(String usuario)
        {
            boolean sql = BD.sqlQuery("DELETE FROM `test`.`usuario` WHERE `usuario`='"+usuario+"';");
            return sql;
        }


        public static JSONArray Leer(String usuario)
        {
            JSONArray lista;
            lista=BD.sqlSelectString(usuario,"usuario","usuario");
            //For para la lista
            return lista;
        }

        public static JSONArray LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            JSONArray lista;
            lista=BD.sqlSelectAll("usuario");
            return lista;
            
        }
}
