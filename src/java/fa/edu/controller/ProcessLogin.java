/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.edu.controller;

import fa.edu.model.Book;
import fa.edu.model.Users;
import fa.edu.service.BookService;
import fa.edu.service.UserService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import fa.edu.service.UserService;
import java.util.List;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Hong Hiep IT
 */
public class ProcessLogin extends HttpServlet {


    
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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        HttpSession session=request.getSession();
        Users user=UserService.checkLogin(username, password);
        if(user!=null){
            
            session.setAttribute("user", user);
            if(user.getRoleID()==false){
                List<Book>listBook=BookService.getListAllListBook();
                session.setAttribute("listBook", listBook);
                response.sendRedirect("ProcessHome");
               
            }else{
                response.sendRedirect("ProcessBookList");
            }
            
            
        }else{
            session.setAttribute("message", "Invalid username or password");
            response.sendRedirect("LoginForm.jsp");
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
        processRequest(request, response);
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
