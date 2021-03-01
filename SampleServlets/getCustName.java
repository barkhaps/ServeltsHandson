package com.highradius.SampleServlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import com.highradius.dataLoading.DataSource;

public class getCustName extends HttpServlet {
	
	static Connection conn;
	static PreparedStatement prestmt;
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	Long doc_id = Long.parseLong(req.getParameter("num1"));
	PrintWriter out = res.getWriter();
	try {
		Class.forName(DataSource.jdbcDriver).newInstance();
		conn = DriverManager.getConnection(DataSource.urlH2H, DataSource.dbuserName, DataSource.dbpassword);
		prestmt = conn.prepareStatement(DataSource.getCustName);
		prestmt.setLong(1,doc_id);
		ResultSet rs = prestmt.executeQuery();
		if(rs.next()) {
			out.println("The customer name for document ID <"+ doc_id + "> is: " + rs.getString(1));
		} else {
			out.println("No Data found for document ID <"+ doc_id + ">");
		}
		conn.close();
	} catch(Exception e) {
		e.printStackTrace();
	}
	}

}
