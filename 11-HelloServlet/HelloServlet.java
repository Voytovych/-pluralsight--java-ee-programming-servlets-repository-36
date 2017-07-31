package com.pluralsight.demos;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class HelloServlet extends HttpServlet 
{
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 	ServletException, IOException 
     {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<h3>Hello From Servlet");

     }
}