/*
 * Copyright 2012 by Nightingale, Inc.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information 
 * of Nightingale, Inc.
 *
 * @author Sergio Couture
 */
package com.nightingale.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.nightingale.shared.PersonInfo;

@RemoteServiceRelativePath("person")
public interface PersonService extends RemoteService{

    PersonInfo getPerson(int personID) throws Exception;
    
}
