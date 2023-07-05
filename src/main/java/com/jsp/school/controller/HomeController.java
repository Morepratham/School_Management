package com.jsp.school.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/home")
public class HomeController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String student =  req.getParameter("Student");
		String teacher = req.getParameter("Teacher");
		if(student != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("studentmenu.jsp");
			requestDispatcher.forward(req, resp);
		}else if (teacher != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("teachermenu.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
}
