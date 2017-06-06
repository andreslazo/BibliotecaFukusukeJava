/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generales;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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
    
    public static ArrayList<String> sqlSelectAll(String tabla) {
        try{
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","c+90017172");

                    Statement statement = connection.createStatement();
                    String consultaSQL = "SELECT * FROM "+tabla+";";
                    ResultSet results = statement.executeQuery(consultaSQL);
                    
                    ArrayList<String> arrayResultados=new ArrayList<String>();

                    //txtResultados.setText(); Convertir resultset en array
                    
                    while (results.next())
                    {
                        
                        //Como recibir multiples columnas
                    }

                    connection.close();
                    
                    return null;
                }catch (Exception e){
                    //txtResultados.setText("error"+e.toString());
                    return null;
                }
        
    }
    
    public static ArrayList<String> sqlSelect(int id,String tabla) {
        try{
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","c+90017172");

                    Statement statement = connection.createStatement();
                    String consultaSQL = "SELECT * FROM "+tabla+";";
                    ResultSet results = statement.executeQuery(consultaSQL);
                    
                    ArrayList<String> arrayResultados=new ArrayList<String>();

                    //txtResultados.setText(); Convertir resultset en array
                    
                    while (results.next())
                    {
                        
                        //Como recibir multiples columnas
                    }

                    connection.close();
                    
                    return null;
                }catch (Exception e){
                    //txtResultados.setText("error"+e.toString());
                    return null;
                }
        
    }
}
