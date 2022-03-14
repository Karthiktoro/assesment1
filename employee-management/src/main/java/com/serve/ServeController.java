package com.serve;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controller")
public class ServeController extends HttpServlet {
	
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String data = req.getParameter("data");
	switch (data) {
	case "find":
		RequestDispatcher rd = req.getRequestDispatcher("/find");
		rd.forward(req, resp);
		break;
	case "create":
		RequestDispatcher rd1 = req.getRequestDispatcher("/create");
		rd1.forward(req, resp);
		break;
	case "list":
		RequestDispatcher rd2 = req.getRequestDispatcher("/list");
		rd2.forward(req, resp);
		break;
	default:
		break;
	}
	
}
	
}
