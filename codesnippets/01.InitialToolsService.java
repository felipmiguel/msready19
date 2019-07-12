package com.msready19.raist213;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/tools")
public class ToolsService {

    private SuperUtilities _tools;

    @POST
    @Path("echo")
    @Produces("text/plain")
    public String echo(@FormParam("source") String source) {
        return source;
    }

}