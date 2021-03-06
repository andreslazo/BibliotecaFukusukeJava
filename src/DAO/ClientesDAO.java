/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Clientes;
import generales.BD;
import org.json.JSONArray;

/**
 *
 * @author amlazo
 */
public class ClientesDAO {
    public static boolean Insertar(Clientes cliente)
        {
            //podria haber problemas con el null
            boolean sql = BD.sqlQuery("INSERT INTO 'clientes' ('idcliente', 'rut', 'dv', 'nombre', 'appat', 'apmat', 'calle', 'numero', 'dpto', 'block', 'telefono', 'celular', 'mail', 'comuna_idcomuna', 'usuario_usuario', 'genero_idgenero') VALUES ('"+cliente.getIdCliente()+"', '"+cliente.getRut()+"', '"+cliente.getDv()+"', '"+cliente.getNombre()+"', '"+cliente.getApPat()+"', '"+cliente.getApMat()+"', '"+cliente.getCalle()+"', '"+cliente.getNumero()+"', '"+cliente.getDpto()+"', '"+cliente.getBlock()+"', '"+cliente.getTelefono()+"', '"+cliente.getCelular()+"', '"+cliente.getMail()+"', '"+cliente.getIdComuna()+"', '"+cliente.getUsuario()+"', '"+cliente.getIdGenero()+"');");
            return sql;
        }

        public static boolean Actualizar(int idCliente, Clientes cliente)
        {
            boolean sql = BD.sqlQuery("UPDATE `clientes` SET `idcliente`='"+cliente.getIdCliente()+"', `rut`='"+cliente.getRut()+"', `dv`='"+cliente.getDv()+"', `nombre`='"+cliente.getNombre()+"', `appat`='"+cliente.getApPat()+"', `apmat`='"+cliente.getApMat()+"', `calle`='"+cliente.getCalle()+"', `numero`='"+cliente.getNumero()+"', `dpto`='"+cliente.getDpto()+"', `block`='"+cliente.getBlock()+"', `telefono`='"+cliente.getTelefono()+"', `celular`='"+cliente.getCelular()+"', `mail`='"+cliente.getMail()+"', `comuna_idcomuna`='"+cliente.getIdComuna()+"', `usuario_usuario`='"+cliente.getUsuario()+"', `genero_idgenero`='"+cliente.getIdGenero()+"' WHERE `idcliente`='"+idCliente+"';");
            return sql;
        }

        public static boolean Elimimar(int idCliente)
        {
            boolean sql = BD.sqlQuery("DELETE FROM 'clientes' WHERE 'idcliente'='"+idCliente+"';");
            return sql;
        }


        public static JSONArray Leer(String user)
        {
            JSONArray lista;
            lista=BD.sqlSelectString(user,"clientes","usuario_usuario");
            //For para la lista
            return lista;
        }

        public static JSONArray LeerTodo()
        {
            //DataTable dt = BD.getInstance().sqlSelect("Select * from cargo");
            JSONArray lista;
            lista=BD.sqlSelectAll("clientes");
            return lista;
            
        }
        
        public static int ObtenerId(String user){
            return BD.sqlSelectOneIntPrimo(user, "clientes", "usuario_usuario", "idcliente");
        }
}
