package com.jsp.school.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/teachermenu")
public class TeacherMenuController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String register = req.getParameter("register");
		String delete = req.getParameter("delete");
		String update = req.getParameter("update");
		String getstudentbyid = req.getParameter("getstudentbyid");
		String getteacherbyid = req.getParameter("getteacherbyid");
		String getall = req.getParameter("getall");
		
		if(register != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("teacherinfo.jsp");
		} else if (delete != null) {

		} else if (update != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateTeacher.jsp");
			requestDispatcher.forward(req, resp);

		} else if (getstudentbyid != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("getStudentById1.jsp");
			requestDispatcher.forward(req, resp);


		} else if (getall != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAllStudent.jsp");
			requestDispatcher.forward(req, resp);

		}
		else if(getteacherbyid!=null) {
			
		}
	}
}
