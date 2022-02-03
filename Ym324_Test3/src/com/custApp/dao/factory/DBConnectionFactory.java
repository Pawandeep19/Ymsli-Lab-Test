package com.custApp.dao.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



import java.sql.*;



public class DBConnectionFactory {
private static Connection connection=null;
    
    public static Connection getConnection() {
        Properties properties=new Properties();
        InputStream ins=null;
        try {
        	ins=new FileInputStream("db.properties");
        	properties.load(ins);
        }
        catch(IOException e) {
        	
        }
        
        String url=properties.getProperty("jdbc.url");
        String driver=properties.getProperty("jdbc.driver");
        String username=properties.getProperty("jdbc.username");
        String password=properties.getProperty("jdbc.password");
        
        try {
            Class.forName(driver);
            System.out.println("driver is loaded...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        try {
            connection = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return connection;
       
    }
}