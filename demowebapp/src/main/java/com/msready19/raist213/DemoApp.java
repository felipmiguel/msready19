package com.msready19.raist213;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class DemoApp extends Application {
    private Set<Object> singletons = new HashSet<Object>();
    private Set<Class<?>> classes = new HashSet<Class<?>>();

    public DemoApp() {
        // classes.add(Reverser.class);
        // classes.add(SuperUtilities.class);
        // classes.add(ToolsService.class);
        Reverser reverser = new SuperUtilities();
        singletons.add(new ToolsService(reverser));        
        singletons.add(reverser);        
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }

}