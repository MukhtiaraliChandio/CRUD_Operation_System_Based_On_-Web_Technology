package com.dao.impl;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.connection.ConnectionJdbc;
import com.dao.StudentDao;
import com.pojo.Student;


public class StudentDaoImpl implements StudentDao {

ConnectionJdbc db = new ConnectionJdbc();
	
	Student std=new Student();
	

public int saveStudentdata(String firstName, String lastName, String surname, String cnic, String contactNumber,
			String image, String country, String provinceName, String citiesOfpunjab, String citiesOfsindh,
			String citiesOfbalochistan, String citiesOfkpk, String citiesOfgilgit, String citiesOfazadKashmir,
			String dateOfbirth, String gender, String address, String email, String hobbies, String password,
			String retypePassword) {

		Connection con =db.getCon();
	    
		   
		String query="insert into student(first_name, last_name, surname, cnic, contact_number, profile_pic, date_of_birth, gender,  select_country, select_province, select_city_sindh, select_city_punjab, select_city_balochistan, select_city_kpk, select_city_gilgit_baltistan, select_city_azad_kashmir, hobbies,  address, email, user_password, retype_password) values ('"+firstName+"', '"+lastName+"', '"+surname+"',   '"+cnic+"', '"+contactNumber+"', '"+image+"', '"+dateOfbirth+"',  '"+gender+"',   '"+country+"', '"+provinceName+"', '"+ citiesOfsindh+"', '"+citiesOfpunjab+"',  '"+citiesOfbalochistan+"', '"+citiesOfkpk+"',  '"+citiesOfgilgit+"', '"+citiesOfazadKashmir+"', '"+hobbies+"'  , '"+address+"',   '"+email+"',  '"+password+"', '"+retypePassword+"' ) ";
		
	    System.out.println(query);
	    Statement st=null;
	    int row=0;
	    try{
	        st=con.createStatement();
	        System.out.println(std);
	        row=st.executeUpdate(query);
	        if(row>=1) 
	        	System.out.println("Data Save");
	        else 
	        	System.out.println("Data Not Save");
	     
	        
	       //return rows;  
	                
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
		return row;
		

}	


public List<Student> getAllstudentdata(){

		List<Student> list = new ArrayList<Student>();
				
		Connection con = db.getCon(); // here is call connection jdbc. 
		String sql = "select * from student"; /// here is write sql query? 
		System.out.print(sql);

		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()){
						    
				
				int stdId = rs.getInt("std_id");
		        String firstName=rs.getString("first_name");
				String lastName=rs.getString("last_name");
				String surname=rs.getString("surname");
				String cnic=rs.getString("cnic");
				String contactNo=rs.getString("contact_number");
				String profilePic=rs.getString("profile_pic");
				String dateOfbirth=rs.getString("date_of_birth");
				String gender=rs.getString("gender");
			    String selectCountry=rs.getString("select_country");
			    String selectProvince=rs.getString("select_province");	    
			    String selectCitysindh=rs.getString("select_city_sindh");
			    String selectCitypunjab=rs.getString("select_city_punjab");
			    String selectCitybalochistan=rs.getString("select_city_balochistan");
			    String selectCitykpk=rs.getString("select_city_kpk");
			    String selectCitygilgitBaltistan=rs.getString("select_city_gilgit_baltistan");
		        String selectCityazadKashmir=rs.getString("select_city_azad_kashmir");
		        String address=rs.getString("address");
		        String hobbies=rs.getString("hobbies");
			    String email=rs.getString("email");
			    String  password=rs.getString("user_password");
			    String  retypePassword=rs.getString("retype_password");

			  //JOptionPane.showMessageDialog(null, "List Size : "+);
			    
				Student  std = new Student();
				
				
				std.setStdId(stdId);
				std.setFirstName(firstName);
				std.setLastName(lastName);
				std.setSurname(surname);
				std.setContactNumber(contactNo);
				std.setCnic(cnic);
				std.setProfilePic(profilePic);
				std.setDateOfbirth(dateOfbirth);
				std.setGender(gender);
				std.setSelectCountry(selectCountry);
				std.setSelectProvince(selectProvince);
				std.setSelectCitysindh(selectCitysindh);
				std.setSelectCitypunjab(selectCitypunjab);
				std.setSelectCitybalochistan(selectCitybalochistan);
				std.setSelectCitykpk(selectCitykpk);
				std.setSelectCitygilgitBaltistan(selectCitygilgitBaltistan);
				std.setSelectAzadkashmir(selectCityazadKashmir);
				std.setHobbies(hobbies);
				std.setAddress(address);
				std.setEmail(email);
				std.setUserPassword(retypePassword);
				std.setRetypePassword(retypePassword);
		        
				
				list.add(std);

			}
		} catch (Exception e) {
			
			e.printStackTrace();
			
			
		}

		return list;

				
}// end of list employee method.


public Student getStudentdataByid(String  id) {
	
	Connection con = db.getCon(); // here is call connection jdbc. 

	  Student stdData  = null;
      String  query = "select * from student where std_id="+id;
      System.out.println(query);
    		
      try {
           
    	    Statement st = con.createStatement();
    	    ResultSet rs = st.executeQuery(query);
    	    st=con.createStatement();
  	        if(rs.next()){
  	  	
  			int stdId = rs.getInt("std_id");
  	        String firstName=rs.getString("first_name");
  			String lastName=rs.getString("last_name");
  			String surname=rs.getString("surname");
  			String cnic=rs.getString("cnic");
  			String contactNo=rs.getString("contact_number");
  			String profilePic=rs.getString("profile_pic");
  			String dateOfbirth=rs.getString("date_of_birth");
  			String gender=rs.getString("gender");
  		    String selectCountry=rs.getString("select_country");
  		    String selectProvince=rs.getString("select_province");	    
  		    String selectCitysindh=rs.getString("select_city_sindh");
  		    String selectCitypunjab=rs.getString("select_city_punjab");
  		    String selectCitybalochistan=rs.getString("select_city_balochistan");
  		    String selectCitykpk=rs.getString("select_city_kpk");
  		    String selectCitygilgitBaltistan=rs.getString("select_city_gilgit_baltistan");
  	        String selectCityazadKashmir=rs.getString("select_city_azad_kashmir");
  	        String hobbies=rs.getString("hobbies");
  	        String address=rs.getString("address");
  		    String email=rs.getString("email");
  		    String  password=rs.getString("user_password");
  		    String  retypePassword=rs.getString("retype_password");

  		  //JOptionPane.showMessageDialog(null, "List Size : "+);
  		    
  			stdData = new Student();
  			
  			stdData.setStdId(stdId);
  			stdData .setFirstName(firstName);
  			stdData .setLastName(lastName);
  			stdData.setSurname(surname);
  			stdData.setContactNumber(contactNo);
  			stdData.setCnic(cnic);
  			stdData.setProfilePic(profilePic);
  			stdData.setDateOfbirth(dateOfbirth);
  			stdData.setGender(gender);
  			stdData.setSelectCountry(selectCountry);
  			stdData.setSelectProvince(selectProvince);
  			stdData.setSelectCitysindh(selectCitysindh);
  			stdData.setSelectCitypunjab(selectCitypunjab);
  			stdData.setSelectCitybalochistan(selectCitybalochistan);
  			stdData.setSelectCitykpk(selectCitykpk);
  			stdData.setSelectCitygilgitBaltistan(selectCitygilgitBaltistan);
  			stdData.setSelectAzadkashmir(selectCityazadKashmir);
  			stdData.setHobbies(hobbies);
  			stdData.setAddress(address);
  			stdData.setEmail(email);
  			stdData.setUserPassword(retypePassword);
  			stdData.setRetypePassword(retypePassword);
  	       
  	        }      	      
  	    }catch(Exception e){
  	    	e.printStackTrace();
  	    }
  	
  		
     
      return stdData;

      
}/// end of 



@Override
public List<Student> getAllHobbies() {
	Connection con = db.getCon(); // here is call connection jdbc. 

    List<Student> hobbies = new ArrayList<>();
    Student hobbyName  = null;
    String query = "SELECT std_id, hobbies FROM student";
  
    try  
    {
       
    	Statement st = con.createStatement();
  	    ResultSet rs = st.executeQuery(query);
  	    st=con.createStatement();
        if (rs.next()) {
        	
        	hobbyName = new Student();	
        	int stdId = rs.getInt("std_id");
            String hobbies1=rs.getString("hobbies");
            
            hobbyName.setStdId(stdId);
            hobbyName.setHobbies(hobbies1);
        	hobbies.add(hobbyName);
        	
           
           
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return hobbies;
}

@Override
public List<String> getSelectedHobbies(String id) {
	
	Connection con = db.getCon(); // here is call connection jdbc. 
    List<String> selectedHobbies = new ArrayList<>();
    String  query = "select * from student where std_id="+id;
    
    try {
    	Statement st = con.createStatement(); 
    	 ResultSet rs = st.executeQuery(query);
   	    st=con.createStatement();
        //st.setString(1, userId);
         
            if (rs.next()) {
                selectedHobbies.add(rs.getString("std_id"));
            }
        
    }catch (Exception e) {
        e.printStackTrace();
    }
    return selectedHobbies;
}


@Override
public void deleteStudentdataByid(String id) {
Connection con = db.getCon();
	
	//JOptionPane.showMessageDialog(null,""+emp.getEmployeeId());
		
	    
	    String query="delete from student where std_id="+id;
		System.out.print(query);

		Statement st=null;
		int row=0;
		try{
			st=con.createStatement();
			row=st.executeUpdate(query);
			 //row=st.executeUpdate(query);
		        if(row>=1) 
		        	System.out.println("Data Delete");
		        else 
		        	System.out.println("Data Not Delete");
		     

		}catch(Exception e){
			e.printStackTrace();
		}
		
	
}
/////////////////////// end of delete code //////////////////////////////////////////////////



public   int  updateStudentdata(int id, String firstName, String lastName, String surname, String cnic,
		String contactNumber, String image, String dateOfbirth, String gender, String countryName,
		String provinceName, String cityOfsindh, String cityOfpunjab, String cityOfbalochistan, String cityOfkpk,
		String cityOfgilgit, String cityOfazadKashmir, String hobbyNames, String address, String email,
		String password, String retypePassword) {

	Connection con =db.getCon();
    
	   
	String query="Update student Set first_name='"+firstName+"', last_name='"+lastName+"', surname='"+surname+"',  cnic='"+cnic+"', contact_number='"+contactNumber+"',  profile_pic='"+image+"',  date_of_birth='"+dateOfbirth+"', gender='"+gender+"', select_country='"+countryName+"',  select_province='"+provinceName+"',  select_city_sindh='"+cityOfsindh+"', select_city_punjab='"+cityOfpunjab+"', select_city_balochistan='"+cityOfbalochistan+"' , select_city_kpk='"+cityOfkpk+"',  select_city_gilgit_baltistan='"+cityOfgilgit+"', select_city_azad_kashmir='"+cityOfazadKashmir+"', hobbies='"+hobbyNames+"', address='"+address+"',  email='"+email+"', user_password='"+password+"',  retype_password='"+retypePassword+"' where std_id='"+id+"' "; 
    System.out.println("UpdateQuery:"+query);
    Statement st=null;
    int row=0;
    try{
        st=con.createStatement();
        //System.out.println(std);
        row=st.executeUpdate(query);
        if(row>=1) 
        	System.out.println("Data Update");
        else 
        	System.out.println("Data Not Update");
     
        
       //return rows;  
                
    }catch(Exception e){
    	e.printStackTrace();
    }
	return row;
	
}








	
}