package com.smartcity.smartcity.dbhandler;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private static Connection connection;
    private static final Properties dbProperties = new Properties();

    /**
     * Returns dbConnection to change db? edit property file DbConnectionConfigs.properties
     * @return Connection
     */
    public static Connection getConnection(){

        try {
            dbProperties.load(new FileReader("E:\\University\\Programming\\JavaDirectory\\SmartCity\\src\\" +
                    "main\\resources\\properties\\DbConnectionConfigs.properties"));

        } catch (IOException e) {
            e.printStackTrace();
        }


        String connectionConfig = "jdbc:mysql://" + dbProperties.getProperty("dbHost") + ":" +
                dbProperties.getProperty("dbPort") + "/" + dbProperties.getProperty("dbName");


        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            connection = DriverManager.getConnection(connectionConfig, dbProperties.getProperty("dbUser"), dbProperties.getProperty("dbPass"));

        } catch (SQLException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (InvocationTargetException e) {
            e.printStackTrace();

        } catch (InstantiationException e) {
            e.printStackTrace();

        } catch (IllegalAccessException e) {
            e.printStackTrace();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();

        }


        return connection;

    }
}