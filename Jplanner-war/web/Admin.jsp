<%-- 
    Document   : Main page
    Created on : 05-Mar-2018, 19:42:33
    Author     : ak2049l
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>  
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="LiveJ.css">
        <title>Live journey main page</title>
    </head> 
    <div class="header">
        <center><h1 align-center>Live Journey Planner</h1></center>
   
  </div>
    <body>
       
   <ul class="topnav">   
   <li class="dropdown">
    <a href="Admin.jsp" class="dropbtn">Home</a>
  </li>  
  <li><a href="contact.jsp">Contact</a></li>
  <li><a href ="About.jsp">About</a></li> 
  
  </ul>
        <p></p>
<div class="row">
<div class="col-3 menu">
  <ul>
    <li onclick ="location.href = 'index.xhtml';">Amend Line Services</li>
    <li onclick ="location.href = 'index.xhtml';"> Update Station </li>
    <li onclick ="location.href ='lineList.xhtml';"> List of lines </li>
    <li onclick ="location.href ='index2.xhtml';"> Station on Crossing</li>
  </ul>
</div>   
</div> 
        <p></p>
        
        <footer style="margin-bottom:70px">
           
            <div class ="col-50">
                <div class ="footer">
                    Lets see how this re-size with different sizes of windows.
                </div>
            </div>
          
        </footer> 

    </body>
</html>
