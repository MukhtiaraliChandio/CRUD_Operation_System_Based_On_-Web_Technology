package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Student;
import com.dao.*;
import com.dao.impl.*;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    StudentDao stdDao= new StudentDaoImpl(); 
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		this.doPost(request, response);
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	
		
		PrintWriter out=response.getWriter();
		
		String option=request.getParameter("option");
		if(option.equals("showData")) {
			
			try {
				  listStudentData(request, response);
			      //response.sendRedirect("NewStudentListData.jsp");
			}  catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}else if(option.equals("insertData")) {
			
			try {
				  insertStudentdata(request, response);
				 // 
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else if(option.equals("getDatabyIdeditForm")) {
			
			try {
				
				   
				getStudentdataByid(request, response);
				 // response.sendRedirect("EditStudentFormjsp.jsp");


			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}else if(option.equals("updateData")) {
			
			try {
				updateStudentdataByid(request,response);
			}  catch (Exception e) {
			
				e.printStackTrace();
			}
		}else if(option.equals("deleteData")) {
			
			try {
				 deleteStudentdataByid(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
			
		
		
		
	
	}
	
private void listStudentData(HttpServletRequest request, HttpServletResponse response)throws Exception, IOException, ServletException {

	    Student std=new Student();
		List <Student> liststdData =stdDao.getAllstudentdata();
	    request.setAttribute("stdData", liststdData);
	    System.out.print(liststdData);
	    RequestDispatcher dispatcher = request.getRequestDispatcher("NewStudentListData.jsp");
	    dispatcher.forward(request, response);
	    

}// end of list Employee method.	*/	
		
private void  insertStudentdata(HttpServletRequest request, HttpServletResponse response) throws Exception, IOException {
		
		//User user=new User();
	     
	     PrintWriter out=response.getWriter();
	     Student std=new Student();
	     
	     String firstName= request.getParameter("firstname");
		 String lastName= request.getParameter("lastname");
		 String surname= request.getParameter("surname");
		 String cnic=request.getParameter("cnic");
		 String contactNumber=request.getParameter("contactNo");
		 String image= request.getParameter("img");
		 String dateOfbirth=request.getParameter("birthday");
		 String country=request.getParameter("countryName");
		 String provinceName=request.getParameter("provinceName");
		 String citiesOfpunjab=request.getParameter("citiesOfpunjab");
		 String citiesOfsindh=request.getParameter("citieOfsindh");
		 String citiesOfbalochistan=request.getParameter("citiesOfbalochistan");
		 String citiesOfkpk=request.getParameter("citiesOfkpk");
		 String citiesOfgilgit=request.getParameter("citiesOfgilgit");
		 String citiesOfazadKashmir=request.getParameter("citiesOfazadkashmir");
		 String gender= request.getParameter("gender");	     
	     String address=request.getParameter("address");
	     String email=request.getParameter("email");
	     String password=request.getParameter("psw");
	     String retypePassword=request.getParameter("psw-repeat");
	   
	
	     String []hobbies=request.getParameterValues("hobyName");
	  
	     //System.out.println(firstName+"\n"+ lastName+"\n"+ surname+"\n"+ cnic);
	     
	     if (hobbies != null) {

	    	 String  hobbyNames = String.join(" ", hobbies);

	           // System.out.print(hobbyNames);
	            response.getWriter().println("Preferences successfully stored in the database: " + hobbyNames);
			      
	            stdDao.saveStudentdata(firstName, lastName, surname, cnic,contactNumber, image, country, provinceName, citiesOfpunjab, citiesOfsindh, citiesOfbalochistan,citiesOfkpk, citiesOfgilgit, citiesOfazadKashmir,  dateOfbirth, gender, address, email, hobbyNames, password,  retypePassword);
	       

	     
	     } else {
	            response.getWriter().println("No preferences selected.");
	        }
	     
	     response.sendRedirect("StudentRegisterationForm.html");
	     
	 
	
	
		 
		
}//end of insertUser method.

private void getStudentdataByid(HttpServletRequest request, HttpServletResponse response) throws Exception, IOException {

    Student std=new Student();
	
    List<Student> hobbiesList = stdDao.getAllHobbies();
    List<String> selectedhobbies = new ArrayList<>();
    


    String id=request.getParameter("stdId");
	System.out.println(id);
	int customerId = Integer.parseInt(id);

	std=stdDao.getStudentdataByid(id);
    List<String> selectedHobbies = stdDao.getSelectedHobbies(id);
	
	
   
	System.out.print(std);

   
	request.setAttribute("stdData",std);
	request.setAttribute("hobbiesList", hobbiesList);
    request.setAttribute("selectedhobbies", selectedhobbies);

    
    request.getRequestDispatcher("NewEditForm.jsp").forward(request, response);

	
	
}// end of getCustomerdataByid method.

private void updateStudentdataByid(HttpServletRequest request, HttpServletResponse response) throws Exception, IOException {

	
	 //PrintWriter out=response.getWriter();
     //Student std=new Student();
     
     String id=request.getParameter("stdId");
 	 System.out.println(id);
 	 int stdId = Integer.parseInt(id);
     
 	 
 	 String firstName= request.getParameter("firstname");
 	 String lastName= request.getParameter("lastname");
 	 String surname= request.getParameter("surname");
	 String cnic=request.getParameter("cnic");
	 String contactNumber=request.getParameter("contactNo");
	 String image= request.getParameter("image");
	 String dateOfbirth=request.getParameter("birthday");
	 String gender= request.getParameter("gender");	
	 String countryName=request.getParameter("countryName");
	 String provinceName=request.getParameter("provinceName");
	 String cityOfsindh=request.getParameter("selectCitysindh");
	 String cityOfpunjab=request.getParameter("selectCitypunjab");
	 String cityOfbalochistan=request.getParameter("selectCitybalochistan");
	 String cityOfkpk=request.getParameter("selectCitykpk");
	 String cityOfgilgit=request.getParameter("selectcityOfgilgit");
	 String cityOfazadKashmir=request.getParameter("selectCityofazadkashmir");
     String address=request.getParameter("address");
     String email=request.getParameter("email");
     String password=request.getParameter("psw");
     String retypePassword=request.getParameter("psw-repeat");
     String  []selectedHobbies = request.getParameterValues("hobbies");
     
    // String  []Hobbies = request.getParameterValues("hobbyName");
 	
 	//System.out.println("\nStdId:"+stdId+"firstname"+firstName+"\nlastName:"+lastName);
 	
     System.out.println("HobyName:"+selectedHobbies);
  
     if (selectedHobbies != null) {
    	
    
    	 String hobbyNames = String.join(" ",selectedHobbies);

         
         response.getWriter().println("Preferences successfully stored in the database: " + hobbyNames);
         
       
         System.out.println("FirstName:  "+firstName+"\nLast Name:  "+
        		 lastName+"\nSurname:  "+surname+"\nCnic:"+cnic+"\ncontactNumber:"+contactNumber+"\nimage:"+image+"\nDateofbirth:"+dateOfbirth+"\nGender:"+gender+"\nCountry:  "+countryName+"\nProvince:  "+provinceName+
        		 "\nCitiesOfSindh:  "+cityOfsindh+"\nCitiesOfPunjab: "+cityOfpunjab+"\nCitiesOfGilgitBaltistan: "+cityOfgilgit+"\nCitiesOfAzadKashmir: "+cityOfazadKashmir
        		 +"\nCitiesOfBalochistan:  "+cityOfbalochistan+"\nCitiesOfKyhberPakhtunKhawa:  "+cityOfkpk+"\nHobbies"+hobbyNames
        		 +"\nAddress:"+address+"\nEmail:"+email+"nUserPassword:"+password+"\nRetypePassword:"+retypePassword);
         
         
     	 stdDao.updateStudentdata(stdId, firstName, lastName, surname, cnic, contactNumber, 
     		       image, dateOfbirth, gender,  countryName, provinceName, cityOfsindh,  cityOfpunjab,  cityOfbalochistan,  cityOfkpk,  cityOfgilgit, cityOfazadKashmir, 
     		       hobbyNames,  address,  email,  password, retypePassword);

     	 
     	 
     } else {
         response.getWriter().println("No preferences selected.");
     }	
 	
     
     //response.sendRedirect("NewEditForm.jsp");
     
     RequestDispatcher dispatcher = request.getRequestDispatcher("NewEditForm.jsp");
     dispatcher.forward(request, response);
     

}// end of 

	
public void deleteStudentdataByid(HttpServletRequest request, HttpServletResponse response) throws Exception, IOException  {

	Student std=new Student();
	String stdId=request.getParameter("stdId");
	int  id=Integer.parseInt(stdId);
	
	stdDao.deleteStudentdataByid(stdId);
	List < Student > listCustomer =stdDao.getAllstudentdata();
    request.setAttribute("customData", listCustomer);
    System.out.print(listCustomer);
   
    //RequestDispatcher dispatcher = request.getRequestDispatcher("NewEditForm.jsp");
    //dispatcher.forward(request, response);
    
    response.sendRedirect("NewStudentListData.jsp");
	
	//
	
}



	
	
	
}
