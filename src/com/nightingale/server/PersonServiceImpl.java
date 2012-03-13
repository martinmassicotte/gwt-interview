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
        
        return returnValue;
    }
    
    
}
