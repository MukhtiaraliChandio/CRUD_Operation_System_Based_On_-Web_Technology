<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="com.pojo.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Student Data</title>

<!-- ✅ Bootstrap 5 CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- ✅ Google Font -->
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet">

<style>
body {
  font-family: 'Poppins', sans-serif;
  background: linear-gradient(to right, #74ebd5, #ACB6E5);
  min-height: 100vh;
  margin: 0;
  padding: 30px;
}

h2 {
  text-align: center;
  margin-bottom: 30px;
  color: #0b3954;
  font-weight: 600;
}

.table-container {
  background-color: #ffffff;
  border-radius: 15px;
  box-shadow: 0 5px 20px rgba(0, 0, 0, 0.1);
  padding: 25px;
}

table th {
  background-color: #0b3954;
  color: white;
  text-align: center;
  vertical-align: middle;
}

table td {
  vertical-align: middle;
  text-align: center;
}

.table-hover tbody tr:hover {
  background-color: #f1f1f1;
}

img {
  width: 50px;
  height: 50px;
  border-radius: 50%;
  object-fit: cover;
}

.btn-custom {
  border: none;
  color: white;
  padding: 5px 10px;
  border-radius: 6px;
  transition: all 0.3s ease;
}

.btn-edit {
  background-color: #1e90ff;
}

.btn-edit:hover {
  background-color: #0d6efd;
}

.btn-delete {
  background-color: #ff4c4c;
}

.btn-delete:hover {
  background-color: #e63946;
}
</style>
</head>

<body>
<div class="container table-container">
    <h2> List of Student Data</h2>
    <div class="table-responsive">
        <table class="table table-bordered table-hover align-middle">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>First Name</th>      
                    <th>Last Name</th>
                    <th>Surname</th>
                    <th>CNIC</th>
                    <th>Contact</th>
                    <th>Profile Pic</th>
                    <th>DOB</th>
                    <th>Gender</th>
                    <th>Country</th>
                    <th>Province</th>
                    <th>City (Sindh)</th>
                    <th>City (Punjab)</th>
                    <th>City (Balochistan)</th>
                    <th>City (KPK)</th>
                    <th>City (Gilgit Baltistan)</th>
                    <th>City (Azad Kashmir)</th>
                    <th>Hobbies</th>
                    <th>Address</th>
                    <th>Email</th>
                    <th>Password</th>
                    <th>Re-Type Password</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
            </thead>

            <tbody>
                <c:forEach var="studentData" items="${stdData}">
                <tr>
                    <td>${studentData.stdId}</td>
                    <td>${studentData.firstName}</td>
                    <td>${studentData.lastName}</td>
                    <td>${studentData.surname}</td>
                    <td>${studentData.cnic}</td>
                    <td>${studentData.contactNumber}</td>
                    <td><img src="${studentData.profilePic}" alt="Profile" /></td>
                    <td>${studentData.dateOfbirth}</td>
                    <td>${studentData.gender}</td>
                    <td>${studentData.selectCountry}</td>
                    <td>${studentData.selectProvince}</td>
                    <td>${studentData.selectCitysindh}</td>
                    <td>${studentData.selectCitypunjab}</td>
                    <td>${studentData.selectCitybalochistan}</td>
                    <td>${studentData.selectCitykpk}</td>
                    <td>${studentData.selectCitygilgitBaltistan}</td>
                    <td>${studentData.selectAzadkashmir}</td>
                    <td>${studentData.hobbies}</td>
                    <td>${studentData.address}</td>
                    <td>${studentData.email}</td>
                    <td>${studentData.userPassword}</td>
                    <td>${studentData.retypePassword}</td>
                    <td>
                        <a href="StudentServlet?option=getDatabyIdeditForm&stdId=${studentData.stdId}" 
                           class="btn-custom btn-edit">Edit</a>
                    </td>
                    <td>
                        <a href="StudentServlet?option=deleteData&stdId=${studentData.stdId}" 
                           class="btn-custom btn-delete">Delete</a>
                    </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<!-- ✅ Bootstrap JS (optional for interactivity) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
