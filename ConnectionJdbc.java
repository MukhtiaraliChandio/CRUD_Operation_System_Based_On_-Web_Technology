package com.connection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//import com.pojo.*;

public class ConnectionJdbc {



	public ConnectionJdbc(){
	 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_operation_web_demo","root","");
			System.out.println("Connection Created");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
    private  Connection con;
    

    private static void init() throws Exception{

    	
    }// end of static init method .

	public  Connection getCon() {
		return con;
	}
	
	

	
	
	
	
	
	
}//end of ConnectionJdbc class.