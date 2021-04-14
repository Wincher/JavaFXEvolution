package org.geektimes.projects.user.web.controller;

import org.geektimes.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author wincher
 * <p> org.geektimes.projects.user.web.controller <p>
 */
@Path("/user")
public class LoginSuccessPageController implements PageController {

    @GET
    @Path("/login-success")
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        return "login-success.jsp";
    }

}
