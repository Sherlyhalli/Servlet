package com.servlet.assign;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
/**
 * Servlet implementation class ServletDemo
 */
public class ServletDemo extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException
	{
		String username=req.getParameter("uname");
		String password=req.getParameter("passo");
		String dept=req.getParameter("dp");
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='lightgreen'>"+"<h2>Welcome "+username+"   "+password+"  "+dept+"</h2></body></html>");
		out.flush();
		out.close();
	}

}
