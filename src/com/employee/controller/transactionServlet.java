package com.employee.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class transactionServlet
 */
@WebServlet("/transactionServlet")
public class transactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset-8");
		PrintWriter output = response.getWriter();
		
		//Variables
		Properties props =  new Properties();
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("resources.properties");
		props.load(in);
		String urlServer =  props.getProperty("urlServer");
		String user= props.getProperty("userName");
		String password = props.getProperty("password");
		int rowsAffected = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		String SQL1 =  "insert into employees (nameEmployee, ageEmployee, salaryEmployee, addressEmployee) values ('Constanza',20, 100,'Mazatlan')";
		String SQL2 =  "insert into employees (nameEmployee, ageEmployee, salaryEmployee, addressEmployee) values ('Alejandro',40, 500,'Mazatlan')";
		String SQL3 =  "insert into employees (nameEmployee, ageEmployee, salaryEmployee, addressEmployee) values ('Mario',20, 200,'Mazatlan')";
		String SQL4 =  "insert into employees (nameEmployee, ageEmployee, salaryEmployee, addressEmployee) values ('Maria',20, 150,'Mazatlan')";
		String SQL5 =  "insert into employees (nameEmployee, ageEmployee, salaryEmployee, addressEmployee) values ('Elena',20, 70,'Mazatlan')";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			
			conn= DriverManager.getConnection(urlServer, user, password);
			conn.setAutoCommit(false);
			
			pstm = conn.prepareStatement(SQL1);
			pstm.executeUpdate();
			
			pstm = conn.prepareStatement(SQL2);
			pstm.executeUpdate();
			
			pstm = conn.prepareStatement(SQL3);
			pstm.executeUpdate();
			
			pstm = conn.prepareStatement(SQL4);
			pstm.executeUpdate();
			
			pstm = conn.prepareStatement(SQL5);
			pstm.executeUpdate();
			
			conn.commit();
			//response.getWriter().append("yeah");
			rowsAffected = pstm.executeUpdate();
			if(rowsAffected>0) {
				output.append("All executed");
				output.append("<br>");
				output.append("<a href=transaction.jsp>Return</a>");
				output.append("<br>");
				output.append("<a href=index.jsp>Return Home</a>");
			} else
			{
				output.append("Error");
				output.append("<br>");
				output.append("<a href=create.jsp>Return</a>");
				output.append("<br>");
				output.append("<a href=index.jsp>Return Home</a>");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
		} finally 
		{
			try {
				pstm.close();
				conn.close();
			} catch (Exception e) {}
		}
		output.close();
	}
}
