package com.serve;
import com.demo.EmpApp;
import com.demo.EmpNotFoundException;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/find")
public class FindEmpServe extends HttpServlet {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 EmpApp emp = new EmpApp();
	 int num =Integer.parseInt(req.getParameter("empid"));
	 
	 PrintWriter out = resp.getWriter();
	 try {
		out.println( emp.findEmp(num));
	} catch (EmpNotFoundException e) {
		out.println("No Employee Found");
		
	}
}
}
