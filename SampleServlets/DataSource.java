package com.highradius.dataLoading;

public class DataSource {
	public static String dbuserName = "root";
	public static String dbpassword = "root";
	public static String jdbcDriver = "com.mysql.jdbc.Driver";
	public static String urlH2H = "jdbc:mysql://localhost:3306/h2h_internship";

	public static String insertInvoiceDataQuery = "INSERT INTO invoice_details (`business_code`,`cust_number`,`name_customer`,"
			+ "`clear_date`,`business_year`,`doc_id`,`posting_date`,`document_create_date`,`document_create_date_1`,`due_in_date`"
			+ ",`invoice_currency`,`document_type`,`posting_id`,`area_business`,`total_open_amount`,`baseline_create_date`"
			+ ",`cust_payment_terms`,`invoice_id`,`isOpen`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
	public static String getDataCount = "SELECT COUNT(*) FROM invoice_details;";
	public static String getCustName = "SELECT name_customer FROM invoice_details WHERE doc_id = ?";
}
