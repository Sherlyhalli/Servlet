package com.servlet.assign;
import javax.servlet.*;
import java.io.*;
public class FirstServlet extends GenericServlet {
	static
	{
		System.out.println("Inside Static Block");
	}
	public FirstServlet()
	{
		System.out.println("Inside Constructor");
	}
	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("Inside init()");
	}
	public void service(ServletRequest req,ServletResponse resp)throws IOException
	{
		System.out.println("Inside service()");
	}
	public void destroy()
	{
		System.out.println("Inside destroy()");
	}
	public String getServletInfo()
	{
		return"FirstServlet";
	}
	public ServletConfig getServletConfig()
	{
		ServletConfig config=null;
		return config;
	}

}
