/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generales;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

/**
 *
 * @author amlazo
 */
public class BD {
    public static boolean sqlQuery(String sql) {
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","c+90017172");
                
                Statement statement = connection.createStatement();
                
                String query=sql;
                
                
                statement.executeUpdate(query);
                
                connection.close();
                
                return true;
            }catch(Exception e){
                return false;
            }
    }
    
    public static JSONArray sqlSelectAll(String tabla) {
        try{
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","c+90017172");

                    Statement statement = connection.createStatement();
                    String consultaSQL = "SELECT * FROM "+tabla+";";
                    ResultSet results = statement.executeQuery(consultaSQL);
                    
                    //ArrayList<String> arrayResultados=new ArrayList<String>();

                    //txtResultados.setText(); Convertir resultset en array
                    
                    JSONArray json = new JSONArray();
                    ResultSetMetaData rsmd = results.getMetaData();
                    
                    while (results.next())
                    {
                        int numColumns = rsmd.getColumnCount();
                        JSONObject obj = new JSONObject();
                        for (int i=1; i<=numColumns; i++) {
                          String column_name = rsmd.getColumnName(i);
                          obj.put(column_name, results.getObject(column_name));
                        }
                        json.put(obj);
                        //Como recibir multiples columnas
                    }

                    connection.close();
                    
                    return json;
                }catch (JSONException e){
                    return null;
                }catch (Exception e){
                    //txtResultados.setText("error"+e.toString());
                    return null;
                }
        
    }
    
    public static JSONArray sqlSelect(int id,String tabla,String nombreIdentificador) {
        try{
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","c+90017172");

                    Statement statement = connection.createStatement();
                    String consultaSQL = "select * from "+tabla+" where "+nombreIdentificador+"='"+id+"';";
                    //String consultaSQL = "SET @"+nombreIdentificador+"_to_select = 1; SELECT "+tabla+".* FROM "+tabla+" WHERE genero.idgenero = @idgenero_to_select;";
                    ResultSet results = statement.executeQuery(consultaSQL);
                    
                    //ArrayList<String> arrayResultados=new ArrayList<String>();
                    
                    JSONArray json = new JSONArray();
                    ResultSetMetaData rsmd = results.getMetaData();

                    //txtResultados.setText(); Convertir resultset en array
                    
                    while (results.next())
                    {
                        int numColumns = rsmd.getColumnCount();
                        JSONObject obj = new JSONObject();
                        for (int i=1; i<=numColumns; i++) {
                          String column_name = rsmd.getColumnName(i);
                          obj.put(column_name, results.getObject(column_name));
                        }
                        json.put(obj);
                        //Como recibir multiples columnas
                    }

                    connection.close();
                    
                    return json;
                }catch (Exception e){
                    //txtResultados.setText("error"+e.toString());
                    JSONArray json = new JSONArray();
                    JSONObject obj = new JSONObject();
                    obj.put("error", e);
                    json.put(obj);    
                    return json;
                }
        
    }
    
    public static JSONArray sqlSelectString(String id,String tabla,String nombreIdentificador) {
        try{
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","c+90017172");

                    Statement statement = connection.createStatement();
                    String consultaSQL = "select * from "+tabla+" where "+nombreIdentificador+"='"+id+"';";
                    ResultSet results = statement.executeQuery(consultaSQL);
                    
                    //ArrayList<String> arrayResultados=new ArrayList<String>();
                    
                    JSONArray json = new JSONArray();
                    ResultSetMetaData rsmd = results.getMetaData();

                    //txtResultados.setText(); Convertir resultset en array
                    
                    while (results.next())
                    {
                        int numColumns = rsmd.getColumnCount();
                        JSONObject obj = new JSONObject();
                        for (int i=1; i<=numColumns; i++) {
                          String column_name = rsmd.getColumnName(i);
                          obj.put(column_name, results.getObject(column_name));
                        }
                        json.put(obj);
                        //Como recibir multiples columnas
                    }

                    connection.close();
                    
                    return json;
                }catch (Exception e){
                    //txtResultados.setText("error"+e.toString());
                    JSONArray json = new JSONArray();
                    JSONObject obj = new JSONObject();
                    obj.put("error", e);
                    json.put(obj);    
                    return json;
                }
        
        
        
    }
    
    public static int sqlSelectOneInt(int id,String tabla,String nombreIdentificador,String objetoBuscado) {
        try{
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","c+90017172");

                    Statement statement = connection.createStatement();
                    String consultaSQL = "select "+objetoBuscado+" from "+tabla+" where "+nombreIdentificador+"='"+id+"';";
                    ResultSet results = statement.executeQuery(consultaSQL);
                    
                    int resultado=0;
                    while (results.next())
                    {
                        resultado=results.getInt(objetoBuscado);
                    }

                    connection.close();
                    
                    return resultado;
                }catch (Exception e){
                    return 0;
                }
        
          
    }
    
     public static int sqlSelectOneIntPrimo(String id,String tabla,String nombreIdentificador,String objetoBuscado) {
        try{
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","c+90017172");

                    Statement statement = connection.createStatement();
                    String consultaSQL = "select "+objetoBuscado+" from "+tabla+" where "+nombreIdentificador+"='"+id+"';";
                    ResultSet results = statement.executeQuery(consultaSQL);
                    
                    int resultado=0;
                    while (results.next())
                    {
                        resultado=results.getInt(objetoBuscado);
                    }

                    connection.close();
                    
                    return resultado;
                }catch (Exception e){
                    return 0;
                }
        
          
    }
      
}
