package com.dao;

import java.util.List;

import com.pojo.Student;

public interface StudentDao {

	
	public int saveStudentdata(String firstName, String lastName, String surname, String cnic, String contactNumber,
			String image, String country, String provinceName, String citiesOfpunjab, String citiesOfsindh,
			String citiesOfbalochistan, String citiesOfkpk, String citiesOfgilgit, String citiesOfazadKashmir,
			String dateOfbirth, String gender, String address, String email, String hobbies, String password,
			String retypePassword);
	
	//List<String> getSelectedhobbies(String id);

	public List<Student> getAllHobbies();
	 

	public List<Student> getAllstudentdata();

	public Student getStudentdataByid(String  id);

	public List<String> getSelectedHobbies(String id);
	
	
    

    public void deleteStudentdataByid(String id);

	public int  updateStudentdata(int id, String firstName, String lastName, String surname, String cnic,
			String contactNumber, String image, String dateOfbirth, String gender, String countryName,
			String provinceName, String cityOfsindh, String cityOfpunjab, String cityOfbalochistan, String cityOfkpk,
			String cityOfgilgit, String cityOfazadKashmir, String hobbyNames, String address, String email,
			String password, String retypePassword);



	

    
    

			
			
}


