package com.employee.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.model.Employee;

/**
 * Servlet implementation class createServlet
 */
@WebServlet("/createServlet")
public class createServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html charset='utf-8'");
			PrintWriter output = response.getWriter();
			Employee myEmployee = new Employee();
			
			//Variables
				//myEmployee.setIdEmployee(Integer.parseInt(request.getParameter("txtIdEmployee")));
			myEmployee.setNameEmployee(request.getParameter("txtNameEmployee"));
			myEmployee.setAgeEmployee(Byte.parseByte(request.getParameter("txtAgeEmployee")));
			myEmployee.setAddressEmployee(request.getParameter("txtAddressEmployee"));
			myEmployee.setSalaryEmplooye(Double.parseDouble(request.getParameter("txtSalaryEmployee")));
			myEmployee.setDepartmentEmployee(request.getParameter("txtDepartmentEmployee"));
			
			
			//Variables connection
			Properties props =  new Properties();
			InputStream in = this.getClass().getClassLoader().getResourceAsStream("resources.properties");
			props.load(in);
			String urlServer =  props.getProperty("urlServer");
			String user= props.getProperty("userName");
			String password = props.getProperty("password");
			int rowsAffected=0;
			
			//Connection
			Connection conn = null;
			PreparedStatement pstm = null;
			
			//Prepared Statement structure
			String SntSQLPdStm = "insert into employees (nameEmployee, ageEmployee, addressEmployee, salaryEmployee, departmentEmployee) values (?,?,?,?,?)";
					//SentenceSQLPreparedStatement
			
			//
			try {
				//String Driver
				Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
				
				//Open Connection
				conn=DriverManager.getConnection(urlServer,user,password);
				
				//Prepared Statement
				pstm = conn.prepareStatement(SntSQLPdStm);
					//pstm.setInt(1, myEmployee.getIdEmployee());
				pstm.setString(1, myEmployee.getNameEmployee());
				pstm.setByte(2, myEmployee.getAgeEmployee());
				pstm.setString(3, myEmployee.getAddressEmployee());
				pstm.setDouble(4, myEmployee.getSalaryEmplooye());
				pstm.setString(5, myEmployee.getDepartmentEmployee());
				
				//Query
				rowsAffected = pstm.executeUpdate();
				if (rowsAffected>0) {
					output.append("You Created a new Register");
					output.append("<br>");
					output.append("<a href=create.jsp>Return</a>");
					output.append("<br>");
					output.append("<a href=index.jsp>Return Home</a>");
					
				}else
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
				} catch (Exception e) {
					
				}
			}
			output.close();
	}

}
