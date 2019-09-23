
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.Line;
import static java.lang.Character.getName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ak2049l
 */
public class Search extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
                    PrintWriter out = response.getWriter();

        try {
        
          response.addHeader("searching", "true");
           // int id=Integer.parseInt(request.getParameter("id"));
            String search = request.getParameter("Search");
           out.write(search);
          
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    String url="jdbc:derby://localhost:1527/AwalDB";
    Connection con = DriverManager.getConnection(url,"awal","awal");
    PreparedStatement stmt = con.prepareStatement("select * from LINE where LINENAME LIKE ?");
    stmt.setString(1,"%"+search+"%");
    ResultSet Rs = stmt.executeQuery();
    //System.out.println("println");
    while (Rs.next()){
        out.write(Rs.getInt("LINEID"));
        out.write(Rs.getString("LINENAME"));
        out.write(Rs.getString("STARTPOINT"));
        out.write(Rs.getString("ENDPOINT"));
        out.write("<br/>");
    }
                 }catch (ClassNotFoundException | SQLException ex){
            out.write(ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
