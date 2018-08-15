/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.edu.controller.admin;

import fa.edu.repository.BookRepositoryImp;
import fa.edu.service.BookService;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author Hong Hiep IT
 */
public class ProcessCreateNewBook extends HttpServlet {

    private static InputStream in;

    @Override
    public void init(ServletConfig config) throws ServletException {
        String pathImageBook = config.getServletContext().getContextPath() + "/download.jpg";
        try {
            in = new FileInputStream(pathImageBook);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProcessCreateNewBook.class.getName()).log(Level.SEVERE, null, ex);
        }

        super.init(config); //To change body of generated methods, choose Tools | Templates.
    }

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

        String title = request.getParameter("title");
        String brief = request.getParameter("brief");
        String content = request.getParameter("content");

        String publisher = request.getParameter("publisher");
        String author = request.getParameter("author");
        String category = request.getParameter("category");

        int publisherId = Integer.valueOf(publisher);
        int authorId = Integer.valueOf(author);
        int categoryId = Integer.valueOf(category);

//        String imageCover=request.getParameter("imageCover");
        InputStream inputStream = null;
//        Part filePart = request.getPart("imageCover");
//        if (filePart != null) {
//            inputStream = filePart.getInputStream();
//        }

        if (inputStream == null) {
            inputStream = in;
        }

        boolean result = BookService.addNewBook(title, brief, content, publisherId, authorId, categoryId, inputStream);

        response.sendRedirect("ProcessBookList");

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
