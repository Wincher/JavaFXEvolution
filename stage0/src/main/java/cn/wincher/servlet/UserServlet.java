package cn.wincher.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author wincher
 * <p> cn.wincher.servlet <p>
 */
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //与OutputStream互斥,一次请求中不能都调用, 是对其的封装, 并且一个写的是byte流, 一个写的是字符串
//        PrintWriter writer = resp.getWriter();
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.write(("Hello, contextPath is " + req.getContextPath()).getBytes(StandardCharsets.UTF_8) );
        outputStream.flush();
        outputStream.close();
    }
}
