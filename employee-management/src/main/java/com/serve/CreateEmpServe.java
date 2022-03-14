package com.serve;
import com.demo.EmpApp;
import com.demo.EmpExistsException;
import com.demo.Emp;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/create")
public class CreateEmpServe  extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmpApp emp = new EmpApp();
		int id = Integer.parseInt(req.getParameter("empid"));
		String name = req.getParameter("name");
		String city = req.getParameter("city");
		double salary = Double.parseDouble( req.getParameter("salary"));
		Emp e = new Emp(id,name,city,salary);
		PrintWriter out = resp.getWriter();
		try {
			out.println(emp.createEmp(id,e));
		} catch (EmpExistsException e1) {
			out.println("already exist");
		}
		
	}
}
