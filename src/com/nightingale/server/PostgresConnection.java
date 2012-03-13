/*
 * Copyright 2012 by Nightingale, Inc.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information 
 * of Nightingale, Inc.
 *
 * @author Sergio Couture
 */
package com.nightingale.server;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgresConnection {

    
    /**
     * Get a connection ... no pooling, no nothing.
     * @return Connection
     */
    protected Connection getConn() {

        Connection conn = null;

        // Add this into the /etc/hosts and point it to a live DB
        String url      = "jdbc:postgresql://db-interview:5432/";

        String db       = "interview";
        String driver   = "org.postgresql.Driver";
        String user     = "postgres";
        String pass     = "";
        
        url = url + db;
        
        //System.out.println("connection url: " + url);
        try {

            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            // error
            System.err.println("PostgresSQL Connection Error: ");
            // for debugging error
            e.printStackTrace();
        }

        if (conn == null)  {
            System.out.println("~~~~~~~~~~ can't get a PostgresSQL connection");
        }
        
        return conn;
    }
}
