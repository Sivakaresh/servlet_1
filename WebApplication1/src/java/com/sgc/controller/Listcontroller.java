
package com.sgc.controller;

import com.sgc.data.BookDao;
import com.sgc.data.MCDao;
import com.sgc.data.SCDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Listcontroller", urlPatterns = {"/Listcontroller"})
public class Listcontroller extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            request.setAttribute("bookId", request.getParameter("bookId"));
            request.setAttribute("author", request.getParameter("Author"));
               
            String mcname=request.getParameter("mainclassifications");
            request.setAttribute("mainclassifications", mcname);
            
            MCDao mc1 = new MCDao();
            SCDao sc1 = new SCDao();
             //List x = sc1.S_C_name(mcname);
//             List y=mc1.M_C_name();
//             request.setAttribute("mainClassificationList", y);
//             request.setAttribute("subClassificationList", x);
           // request.setAttribute("bookObject", book);
             
             ServletContext context= getServletContext();
RequestDispatcher rd= context.getRequestDispatcher("/book.jsp");
rd.forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
