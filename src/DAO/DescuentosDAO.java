/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Descuentos;
import generales.BD;
import org.json.JSONArray;

/**
 *
 * @author amlazo
 */
public class DescuentosDAO {
    public static boolean Insertar(Descuentos descuentos)
        {
            boolean sql = BD.sqlQuery("INSERT INTO `test`.`descuentos` (`iddescuento`, `descripcion`, `porcentajedesc`) VALUES ('"+descuentos.getIdDescuentos()+"', '"+descuentos.getDescripcion()+"', '"+descuentos.getPorcentajedesc()+"');");
            //podria haber problemas con el null
            return sql;
        }

        public static boolean Actualizar(int idDescuentos, Descuentos descuentos)
        {
            boolean sql = BD.sqlQuery("UPDATE `test`.`descuentos` SET `iddescuento`='"+descuentos.getIdDescuentos()+"', `descripcion`='"+descuentos.getDescripcion()+"', `porcentajedesc`='"+descuentos.getIdDescuentos()+"' WHERE `iddescuento`='"+idDescuentos+"';");
            return sql;
        }

        public static boolean Elimimar(int idDescuentos)
        {
            boolean sql = BD.sqlQuery("DELETE FROM `test`.`descuentos` WHERE `iddescuento`='"+idDescuentos+"';");
            return sql;
        }


        public static JSONArray Leer(int idDescuentos)
        {
            JSONArray lista;
            lista=BD.sqlSelect(idDescuentos,"descuentos");
            //For para la lista
            return lista;
        }

        public static JSONArray LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            JSONArray lista;
            lista=BD.sqlSelectAll("descuentos");
            return lista;
            
        }
}
