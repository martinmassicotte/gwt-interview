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

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void greetServer(String input, AsyncCallback<String> callback)
			throws IllegalArgumentException;
}
