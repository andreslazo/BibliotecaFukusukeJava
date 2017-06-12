/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Region;
import generales.BD;
import org.json.JSONArray;

/**
 *
 * @author amlazo
 */
public class RegionDAO {
    public static boolean Insertar(Region region)
        {
            boolean sql = BD.sqlQuery("INSERT INTO `test`.`region` (`idregion`, `codigo`, `nombre`) VALUES ('"+region.getIdRegion()+"', '"+region.getCodigo()+"', '"+region.getNombre()+"');");
            //podria haber problemas con el null
            return sql;
        }

        public static boolean Actualizar(int idRegion, Region region)
        {
            boolean sql = BD.sqlQuery("UPDATE `test`.`region` SET `codigo`='"+region.getCodigo()+"', `nombre`='"+region.getNombre()+"' WHERE `idregion`='"+idRegion+"';");
            return sql;
        }

        public static boolean Elimimar(int idRegion)
        {
            boolean sql = BD.sqlQuery("DELETE FROM `test`.`region` WHERE `idregion`='"+idRegion+"';");
            return sql;
        }


        public static JSONArray Leer(int idRegion)
        {
            JSONArray lista;
            lista=BD.sqlSelect(idRegion,"region","idregion");
            //For para la lista
            return lista;
        }

        public static JSONArray LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            JSONArray lista;
            lista=BD.sqlSelectAll("region");
            return lista;
            
        }
}
