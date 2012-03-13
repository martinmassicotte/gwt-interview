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

import java.util.ArrayList;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.nightingale.client.PersonService;
import com.nightingale.shared.PersonInfo;

/**
 * Simple service class the make database queries to the Person table 
 */
public class PersonServiceImpl extends RemoteServiceServlet implements PersonService {

    private static final long serialVersionUID = 3595567717763427649L;

    
    @Override
    public PersonInfo getPerson(int personID) throws Exception{
        PersonInfo returnValue = new PersonInfo();
        
        returnValue.setFirstName("Tyrion");
        returnValue.setLastName("Lannister");
        returnValue.setPersonID(1);
        
        // Easier to mock object than have a full database connection
//        try {
//			Connection conn = pgConnProvider.getConn();
//			String query = "select personid, firstname,  lastname from person";
//			
//			Statement select = conn.createStatement();
//			ResultSet result = select.executeQuery(query);
//			
//			if (result.next()) {
//			    returnValue.setPersonID(result.getInt(1));
//			    returnValue.setFirstName(result.getString(2));
//			    returnValue.setLastName(result.getString(3));
//			} else {
//			    throw new Exception("Did not find any person");
//			}
//			result.close();
//			select.close();
//			conn.close();
//			
//		} catch (PSQLException e) {
//			e.printStackTrace();
//			throw new Exception("SQL error : " + e.getMessage());
//		}
        
        return returnValue;
    }
    
    
}
