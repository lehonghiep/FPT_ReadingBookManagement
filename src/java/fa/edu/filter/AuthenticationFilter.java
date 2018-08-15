/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa.edu.filter;

import fa.edu.model.Users;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 *
 * @author Hong Hiep IT
 */
@WebFilter(urlPatterns = {"/ProcessHome","/ProcessBookDetail",
    "/ProcessReadBook","/ProcessMyBook","/ProcessAddBook",
    "/ProcessBookList","/ProcessCreateBookPage","/ProcessCreateNewBook"})
public class AuthenticationFilter implements Filter{

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest) request;
        HttpServletResponse res=(HttpServletResponse) response;
        
        HttpSession session=req.getSession();
        
        Users user=(Users) session.getAttribute("user");
        if(user!=null){
            chain.doFilter(request, response);
        }else{
            res.sendRedirect("LoginForm.jsp");
        }
    }
}
