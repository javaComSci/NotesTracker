package com.javaComSci.app; // {{ groupId}}.app
// import the rest service you created!
import com.javaComSci.rest.HelloRestService;
import com.javaComSci.rest.NotesRestService;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;
public class HelloApplication extends Application {
    private Set<Object> singletons = new HashSet<Object>();
    public HelloApplication() {
        // Register our hello service
        singletons.add(new HelloRestService());
        singletons.add(new NotesRestService());
    }
    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}