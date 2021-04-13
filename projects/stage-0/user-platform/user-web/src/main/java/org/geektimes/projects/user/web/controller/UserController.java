package org.geektimes.projects.user.web.controller;

import org.geektimes.web.mvc.controller.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * @author wincher
 * <p> org.geektimes.projects.user.web.controller <p>
 */
@Path("/user")
public class UserController implements Controller {

    @POST
    @Path("/form-register")
    public String register(HttpServletRequest req, HttpServletResponse resp) {
        return "{'success':true}";
    }

    @POST
    @Path("/form-signin")
    public String signIN(HttpServletRequest req, HttpServletResponse resp) {
        return "{'success':true}";
    }
}
