package assignment1;
import java.sql.*; 

public class studentMarks {

	public static void main(String[] args) throws SQLException { 
		// Connect to database
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "seliparJepun00");	
	
		// Create a statement to retrieve objects
		Statement s = conn.createStatement();        

		// Retrieve results from the table
		ResultSet rs = s.executeQuery ("Select * from Student"); 
		
		// Print columns headers
		ResultSetMetaData rsmd =rs.getMetaData(); 
		int i =rsmd.getColumnCount( );
		
		for(int j=1; j<=i; j++) { 
			System.out.print(rsmd.getColumnName(j)+"\t"); 
			System.out.print(" "); 
		}
		System.out.println("\n--------------------------------------------------------------");

		// Print records
		while(rs.next( ) ) { 
			{ 
				int rNo			=	rs.getInt("rollNo");
				int sID			=	rs.getInt("studentID");
				String sName	=	rs.getString("studentName");
				String dept		=	rs.getString("department");
				
				System.out.println("   "+ rNo +"   \t"+ sID +" \t\t"+ sName +"\t"+ dept); 
			}
		}
		
	}
}
