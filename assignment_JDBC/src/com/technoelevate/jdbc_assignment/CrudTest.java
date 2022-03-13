package com.technoelevate.jdbc_assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CrudTest {
	public static void main(String[] args) {
		Connection connection = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 1 for insertion");
		System.out.println("enter 2 for deletion");
		System.out.println("enter 3 for updation");
		int option = scanner.nextInt();

		switch (option) {
		case 1:
			System.out.println("enter name of student");
			String name = scanner.next();
			System.out.println("enter age of student");
			int age = scanner.nextInt();
			if (!name.isEmpty()) {
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
						Statement statement = connection.createStatement();
						// 5. write a query

						String query = "insert into student values(?,?,?)";
						PreparedStatement preparedStatement = connection.prepareStatement(query);
						preparedStatement.setInt(1, 12);
						preparedStatement.setString(2, name);
						preparedStatement.setInt(3, age);
						// 6 process the result
						int execute = preparedStatement.executeUpdate();
						System.out.println(execute);
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
//					connection=null;
					try {
						connection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			break;
		case 2:
			System.out.println("enter the id want to delete");
			int id = scanner.nextInt();
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
					Statement statement = connection.createStatement();
					// 5. write a query

					String query = "delete   from student  where s_id=" + id;
					boolean execute = statement.execute(query);
					// 6 process the result
					System.out.println(execute);

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
			break;
		case 3:
			System.out.println("enter student id to update");
			int updateId = scanner.nextInt();
			
			System.out.println("enter age");
            int updateAge=scanner.nextInt(); 
			
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
					Statement statement = connection.createStatement();
					// 5. write a query

					String query = "update  student set s_age="+updateAge+" where s_id="+updateId;
					boolean execute = statement.execute(query);
					// 6 process the result
					System.out.println(execute);

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
//					connection=null;
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		    break;
		case 4:   
		}

	}

}
