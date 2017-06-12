/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.HorarioAtenc;
import generales.BD;
import org.json.JSONArray;

/**
 *
 * @author amlazo
 */
public class HorarioAtencDAO {
    public static boolean Insertar(HorarioAtenc horarioAtenc)
        {
            boolean sql = BD.sqlQuery("INSERT INTO `test`.`horarioatenc` (`idhorario`, `diasem`, `horainicio`, `horafin`, `sucursal_idsucursal`) VALUES ('1', '2', '12:30', '12:30', '1');");
            //podria haber problemas con el null
            return sql;
        }

        public static boolean Actualizar(int idHorarioAtenc, HorarioAtenc horarioAtenc)
        {
            boolean sql = BD.sqlQuery("");
            return sql;
        }

        public static boolean Elimimar(int idHorarioAtenc)
        {
            boolean sql = BD.sqlQuery("");
            return sql;
        }


        public static JSONArray Leer(int idHorarioAtenc)
        {
            JSONArray lista;
            lista=BD.sqlSelect(idHorarioAtenc,"cargo","idcargo");
            //For para la lista
            return lista;
        }

        public static JSONArray LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            JSONArray lista;
            lista=BD.sqlSelectAll("horarioAtenc");
            return lista;
            
        }
}
