package com.technoelevate.jdbc_assignment;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Scanner;

public class CrudTest2 {

	public static void main(String[] args) {
		Connection connection=null;
		
		
		Scanner scanner=new Scanner(System.in);
		try {

			// 2.Load and register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
		// 3 .establish the connection with database
			String db_name = "Student";
			String url = "jdbc:mysql://localhost:3306/" + db_name;
			;
			String username = "root";
			String password = "root";

			 
			try {
				connection = DriverManager.getConnection(url, username, password);

				if (!connection.isClosed()) {
					System.out.println("connection establised");

				} else {
					System.out.println("connection not estalside");

				}

				// 4.create statement
			
				// 5. write a query

//				String query = "insert into student values(?,?,?)";
//				PreparedStatement preparedStatement = connection.prepareStatement(query);
//				preparedStatement.setInt(1, 12);
//				preparedStatement.setString(2, name);
//				preparedStatement.setInt(3, age);
//				// 6 process the result
//				int execute = preparedStatement.executeUpdate();
//				System.out.println(execute);
				// 6. process the result
				// statement.execute(query)
				// statement.executeUpdate(query);
				// statement .executeQuery(query))

				// boolean execute = statement.execute(query);
				// System.out.println(execute);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 7. connection close
//			connection=null;
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("enter 1 for insert data");
		System.out.println("enter 2 for delete data");
		System.out.println("enter 3 for update data");
		int option=scanner.nextInt();
		
		switch(option) {
		       
		case 1: 
		        System.out.println("enter age to insert");
		        int age=scanner.nextInt();
		        System.out.println("enter name to insert");
		        String name=scanner.next();
		      
		    	if(!name.isEmpty()) {
		
			try {
				
				  String query = "insert into student values(?,?,?)";
			 	PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1, 13);
				preparedStatement.setString(2, name);
				preparedStatement.setInt(3, age);
				// 6 process the result
				int execute = preparedStatement.executeUpdate();
				System.out.println(execute);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		
		}}
	
	}

	
}
