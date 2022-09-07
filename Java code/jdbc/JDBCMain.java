package jdbc;

import java.sql.*;

public class JDBCMain {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/mysql_work_shop";
		String uname = "hbstudent";
		String pass = "hbstudent";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		System.out.println("Connection success");
		Statement st = con.createStatement();
		int n= st.executeUpdate("insert into student values (15,'Ameer','ameer@gmail.com',27)");
		System.out.println(n+" row/s affected.");
		System.out.println();
		System.out.println();
		ResultSet rs = st.executeQuery("select * from student");
		while (rs.next()) {
			System.out.print(rs.getInt(1) + "  " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
			System.out.println();
		}
		con.close();
	}

}
