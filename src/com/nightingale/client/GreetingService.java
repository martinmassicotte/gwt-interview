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

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
	String greetServer(String name) throws IllegalArgumentException;
}
