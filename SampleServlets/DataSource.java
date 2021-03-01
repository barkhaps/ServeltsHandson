package com.highradius.SampleServlets;

public class DataSource {
	public static String dbuserName = "root";
	public static String dbpassword = "root";
	public static String jdbcDriver = "com.mysql.jdbc.Driver";
	public static String urlH2H = "jdbc:mysql://localhost:3306/h2h_internship";

	public static String getCustName = "SELECT name_customer FROM invoice_details WHERE doc_id = ?";
}
