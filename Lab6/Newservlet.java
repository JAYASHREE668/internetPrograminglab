

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(name = "NewServlet1", urlPatterns = {"/NewServlet1"})
public class NewServlet1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        Connection con;
        Statement st;
        try (PrintWriter out = response.getWriter()) {
          int mark=0;
          String n=request.getParameter("m1");
          String q1=request.getParameter("q1");
          String q2=request.getParameter("q2");
          String q3=request.getParameter("q3");
          String q4=request.getParameter("q4");
          String q5=request.getParameter("q5");
          String q6=request.getParameter("q6");
          String q7=request.getParameter("q7");
          String q8=request.getParameter("q8");
          String q9=request.getParameter("q9");
          String q10=request.getParameter("q10");
          if(q1.equals("True"))
                  {
                      mark+=1;
                  }
           if(q2.equals("True"))
                  {
                      mark+=1;
                  }
           if(q3.equals("request.getCookies()"))
                 {
                     mark+=1;
                }
            if(q4.equals("False"))
                  {
                      mark+=1;
                  }
             if(q5.equals("servlet filter"))
                  {
                      mark+=1;
                  }
              if(q6.equals("False"))
                  {
                      mark+=1;
                  }
              if(q7.equals("True"))
                  {
                      mark+=1;
                  }
              if(q8.equals("True"))
                  {
                      mark+=1;
                  }
               if(q9.equals("True"))
                  {
                      mark+=1;
                  }
                if(q10.equals("False"))
                  {
                      mark+=1;
                  }
           out.println(n+" scored "+mark);
           con=DriverManager.getConnection("jdbc:derby://localhost:1527/exam details");
           st=con.createStatement();
           String insert="insert into untitled values('"+n+"',"+mark+")";
           st.executeUpdate(insert);
           con.close();
           out.println("row inserted");
        }
        catch(Exception e){
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(NewServlet1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(NewServlet1.class.getName()).log(Level.SEVERE, null, ex);
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
