package Servlets;
import com.awal.Bean.Login;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javafx.scene.control.PasswordField;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import sun.security.util.Password;

/**
 *
 * @author ak2049l
 */
public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
         // String username;  
            
       String username= request.getParameter("username");
       String password = request.getParameter("password");
    
     if (username.contains("abc")&& password.contains("123")); 
     RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
     rd.forward(request,response);
  
    request.setAttribute("error","Invalid Username or Password");

          JOptionPane.showMessageDialog(null, "password is wrong\nclick ok, try again", "wrong pass", JOptionPane.ERROR_MESSAGE);
            
                }
    }

    
    
    
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
