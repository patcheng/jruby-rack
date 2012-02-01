/*
 * Copyright (c) 2010-2012 Engine Yard, Inc.
 * Copyright (c) 2007-2009 Sun Microsystems, Inc.
 * This source code is available under the MIT license.
 * See the file LICENSE.txt for details.
 */

package org.jruby.rack.embed;

import javax.servlet.ServletConfig;

import org.jruby.rack.AbstractServlet;
import org.jruby.rack.RackContext;
import org.jruby.rack.RackDispatcher;

public class Servlet extends AbstractServlet {

    private final Dispatcher dispatcher;
    private final Context context;

    public Servlet(Dispatcher dispatcher, Context context) {
        this.dispatcher = dispatcher;
        this.context = context;
    }

    @Override
    protected RackContext getContext() {
        return this.context;
    }

    @Override
    protected RackDispatcher getDispatcher() {
        return this.dispatcher;
    }

    @Override
    public void init(ServletConfig config) {
        // NOOP
    }
    
}
