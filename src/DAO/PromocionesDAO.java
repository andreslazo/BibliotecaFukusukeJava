/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Promociones;
import generales.BD;
import org.json.JSONArray;

/**
 *
 * @author amlazo
 */
public class PromocionesDAO {
    public static boolean Insertar(Promociones promociones)
        {
            boolean sql = BD.sqlQuery("INSERT INTO `test`.`promociones` (`idpromo`, `descripcion`, `precio`, `sucursal_idsucursal`) VALUES ('"+promociones.getIdPromo()+"', '"+promociones.getDescripcion()+"', '"+promociones.getPrecio()+"', '"+promociones.getIdSucursal()+"');");
            //podria haber problemas con el null
            return sql;
        }

        public static boolean Actualizar(int idPromociones, Promociones promociones)
        {
            boolean sql = BD.sqlQuery("UPDATE `test`.`promociones` SET `descripcion`='"+promociones.getDescripcion()+"', `precio`='"+promociones.getPrecio()+"', `sucursal_idsucursal`='"+promociones.getIdSucursal()+"' WHERE `idpromo`='"+idPromociones+"';");
            return sql;
        }

        public static boolean Elimimar(int idPromociones)
        {
            boolean sql = BD.sqlQuery("DELETE FROM `test`.`promociones` WHERE `idpromo`='"+idPromociones+"';");
            return sql;
        }


        public static JSONArray Leer(int idPromociones)
        {
            JSONArray lista;
            lista=BD.sqlSelect(idPromociones,"promociones");
            //For para la lista
            return lista;
        }

        public static JSONArray LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            JSONArray lista;
            lista=BD.sqlSelectAll("promociones");
            return lista;
            
        }
}
