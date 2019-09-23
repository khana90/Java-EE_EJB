
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
        <link rel="stylesheet" href ="LiveJ.css">  
    </head>
    <div class ="header" color:blue>
         <center><hi>Login Page </hi> </center> </div>
    <body background="Tube_1.jpg">       
      <form action ="LoginServlet" method="POST"> 
      <table align ="center">
              <tr>
                <th align ="right"> User Name: </th>
                <td><input type ="text" name ="username" placeholder="username" required="required"></td>
                </tr>
                <tr>
                <th align ="right"> Password:</th>
                <td> <input type="text" name="password" placeholder="password" required="required"></td>
                </tr>
                <tr> <td colspan="2" align ="right">
                        <input type ="submit" value ="Login" class ="btn btn-primary"> </td>
            </table>
      
        </form>
    </body>
</html>
           
    