package com.jsp.school.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/studentmenu")
public class StudentMenuController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String register = req.getParameter("register");
		String delete = req.getParameter("delete");
		String update = req.getParameter("update");
		String getbyid = req.getParameter("getbyid");
		
		if(register != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("studentregisterpage.jsp");
			requestDispatcher.forward(req, resp);
		}else if (delete != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("studentdeletepage.jsp");
			requestDispatcher.forward(req, resp);
		}else if (update != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("studentupdatepage.jsp");
			requestDispatcher.forward(req, resp);
		}else if (getbyid != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("studentinfopage.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
}
