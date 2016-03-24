package com.codegile.training.testingarea;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

// Extend HttpServlet class
@WebServlet(name="exampleservlet",
urlPatterns={"/exservlet"})
public class MyServletClass extends HttpServlet {

    private String message;

    public void init() throws ServletException
    {
        // Do required initialization
        message = "Hello! I am Silviana!";
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        this.message="Salut! Bine ai venit, "+request.getParameter("name");
        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.

            PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");



    }

    public void destroy()
    {
        // do nothing.
    }
}