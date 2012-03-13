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

public interface CountCallServiceAsync {

    void countCall(Integer number, AsyncCallback<Integer> callback);

}
