
package com.generic;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class GenericServletDemo extends GenericServlet{
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{ 
        System.out.println("Hello ! I'm from Service[Generic Servlet]");

        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<h1 style='text-align:center; color:red;'>Hello ! I'm from Service[Generic Servlet]</h1>");
        
        pw.close();
    }
    
}
