package org.geektimes.projects.user.web.controller;

import org.geektimes.projects.user.repository.DatabaseUserRepository;
import org.geektimes.projects.user.repository.UserRepository;
import org.geektimes.projects.user.sql.DBConnectionManager;
import org.geektimes.web.mvc.controller.Controller;
import org.geektimes.web.mvc.controller.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.xml.crypto.Data;
import java.io.IOException;

/**
 * @author wincher
 * <p> org.geektimes.projects.user.web.controller <p>
 */
@Path("/user")
public class UserController implements RestController {

    UserRepository userRepository = new DatabaseUserRepository(new DBConnectionManager());

    @POST
    @Path("/form-register")
    public String register(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        resp.sendRedirect("login-success");
        return null;
    }

    @POST
    @Path("/form-signin")
    public String signIn(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        resp.sendRedirect("login-success");
        return null;
    }
}
