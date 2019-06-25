package com.msready19.raist213;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/tools")
public class ToolsService {

    private Reverser _tools;

    
    public ToolsService(Reverser tools) {
        _tools = tools;
    }

    @GET
    @Path("echo")
    @Produces("text/plain")
    public String echo(@QueryParam("source") String source) {
        return source;
    }

    @GET
    @Path("reverse")
    @Produces("text/plain")
    public String reverse(@QueryParam("source") String source) {
        // return reverser.get().doReverse(source);
        return _tools.doReverse(source);
    }

}