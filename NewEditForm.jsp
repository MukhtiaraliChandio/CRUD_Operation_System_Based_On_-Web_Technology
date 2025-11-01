<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page import="java.util.List" %>
<%@ page import="com.pojo.*" %>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8"> <!-- Ensure the meta tag charset matches the contentType charset -->
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <style>
     body{
       font-family: Calibri, Helvetica, sans-serif;
       background-color: pink;
     }
     .container {
         padding: 50px;
       background-color: lightblue;
     }
     
     input[type=text], input[type=password], textarea {
       width: 100%;
       padding: 15px;
       margin: 5px 0 22px 0;
       display: inline-block;
       border: none;
       background: #f1f1f1;
     }
     input[type=text]:focus, input[type=password]:focus {
       background-color: orange;
       outline: none;
     }
     div {
             padding: 10px 0;
          }
     hr {
       border: 1px solid #f1f1f1;
       margin-bottom: 25px;
     }
     .registerbtn {
       background-color: #4CAF50;
       color: white;
       padding: 16px 20px;
       margin: 8px 0;
       border: none;
       cursor: pointer;
       width: 100%;
       opacity: 0.9;
     }
     .registerbtn:hover {
       opacity: 1;
     }
     
 .resetbtn {  
  background-color: #4CAF50;  
  color: white;  
  padding: 16px 20px;  
  margin: 8px 0;  
  border: none;  
  cursor: pointer;  
  width: 100%;  
  opacity: 0.9;  
}  
.resetbtn:hover {  
  opacity: 1;  
}       
     
   </style>
</head>
<body>
  <form action="StudentServlet" method="post">
    <input type="hidden" name="option" value="updateData">
    
    <div class="container">
      <center>  
        <h1>Student Edit Registration Form</h1>
      </center>
      <hr>
      
      <label> Student Id </label>   
      <input type="text" name="stdId" placeholder="StdId" value="${stdData.stdId}" size="15" required /> 

      <label>Firstname</label>   
      <input type="text" name="firstname" placeholder="Firstname" size="15" value="${stdData.firstName}" required />

      <label>Lastname</label>    
      <input type="text" name="lastname" placeholder="Lastname" size="15" value="${stdData.lastName}" required />

      <label>Surname</label>   
      <input type="text" name="surname" placeholder="Surname" size="15" value="${stdData.surname}" required />

      <label>Cnic</label>   
      <input type="text" name="cnic" placeholder="Cnic" size="15" value="${stdData.cnic}" required />

      <label>Contact Number</label>   
      <input type="text" name="contactNo" placeholder="Contact No" size="15" value="${stdData.contactNumber}" required />

      <div> 
        <label>Profile Pic</label><br>
        <label for="img">Select image:</label>
        <input type="file" id="img" name="image" accept="image/*" value="${stdData.profilePic}" />
      </div>

      <div>
        <label for="birthday">Date of Birth:</label>
        <input type="date" id="birthday" name="birthday" value="${stdData.dateOfbirth}" />
      </div>

      <label>Gender:</label><br>
      <input type="radio" value="Male" name="gender" ${stdData.gender == 'Male' ? 'checked' : ''}> Male   
      <input type="radio" value="Female" name="gender" ${stdData.gender == 'Female' ? 'checked' : ''}> Female   
      <input type="radio" value="Other" name="gender" ${stdData.gender == 'Other' ? 'checked' : ''}> Other  

<div>
<label>Select the Country:</label>
 <select id="countryDropdown1" name="countryName">
 <c:forEach var="country" items="${stdData.selectCountry}">
      <option value="${country}">${country}</option>
  </c:forEach>
</select>

<br>
<br>
               
<label>Select the Province in Your Country</label>
 <select id="dropDownlistDropdown1" name="provinceName">
 <c:forEach var="province" items="${stdData.selectProvince}">
 <option value="${province}">${province}</option>
</c:forEach>
 </select>
  
<br>
<br>

<label>Select Your City in  Sindh</label>
 <select id="dropDownlistDropdown2" name="selectCitysindh">
 <c:forEach var="citySindh" items="${stdData.selectCitysindh}">
 <option value="${citySindh}">${citySindh}</option>
</c:forEach>
 </select>
               
<br>
<br>

<label>Select Your City in  Punjab</label>
 <select id="dropDownlistDropdown3" name="selectCitypunjab">
 <c:forEach var="cityPunjab" items="${stdData.selectCitypunjab}">
 <option value="${cityPunjab}">${cityPunjab}</option>
</c:forEach>
 </select>
 
<br>
<br>

<label>Select Your City in  Balochistan </label>
 <select id="dropDownlistDropdown4" name="selectCitybalochistan">
 <c:forEach var="cityBaloch" items="${stdData.selectCitybalochistan}">
 <option value="${cityBaloch}">${cityBaloch}</option>
</c:forEach>
 </select>
 
<br>
<br>

<label>Select Your City in Khyber PakhtaonKhwa</label>
 <select id="dropDownlistDropdown5" name="selectCitykpk">
 <c:forEach var="cityKpk" items="${stdData.selectCitykpk}">
 <option value="${cityKpk}">${cityKpk}</option>
</c:forEach>
 </select>
               
<br>
<br>
<label>Select Your City in GilgitBaltistan </label>
 <select id="dropDownlistDropdown6" name="selectcityOfgilgit">
 <c:forEach var="citygilgit" items="${stdData.selectCitygilgitBaltistan}">
 <option value="${citygilgit}">${citygilgit}</option>
</c:forEach>
 </select>
                
<br>
<br>

<label>Select Your City in  Azad Kashmir</label>
 <select id="dropDownlistDropdown7" name="selectCityofazadkashmir">
 <c:forEach var="cityAzad" items="${stdData.selectAzadkashmir}">
 <option value="${cityAzad}">${cityAzad}</option>
</c:forEach>
 </select>

</div> 



<div>

<label for="selectedHobbies">Choose Your Hobbies</label><br>

  <c:forEach var="hobby" items="${hobbiesList}">
        <input type="checkbox" name="hobbies" value="${hobby.hobbies}" checked/>
        ${hobby.hobbies} <br>
       
    
    </c:forEach>
		
 
        
  </div>      

      <div>  
      <label>Current Address:</label>
      <textarea cols="80" rows="5" placeholder="Current Address" name="address" required>${stdData.address}</textarea>
      </div>

      <label for="email"><b>Email</b></label>
      <input type="text" placeholder="Enter Email" name="email" value="${stdData.email}" required>

      <label for="psw"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="psw" value="${stdData.userPassword}" required>

      <label for="psw-repeat"><b>Re-type Password</b></label>
      <input type="password" placeholder="Retype Password" name="psw-repeat" value="${stdData.retypePassword}" required>

      <button type="submit" class="registerbtn" value="submit">Update</button>
        <br><br>
    <button type="reset" class="resetbtn" value="reset">Resset</button>
    
    </form>
  </div>
</body>
</html>