/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgc.controller;

import com.sgc.data.BookDao;
import com.sgc.model.Book;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sivakaresh
 */
@WebServlet(name = "SearchBookController", urlPatterns = {"/SearchBookController"})
public class SearchBookController extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
//        List<Book> searchBookList = new ArrayList<>();
//        Book book = new Book();
//        BookDao bookDao = new BookDao();
//        
//        book.setBookId(request.getParameter("bookIdSearch"));
//        book.setTitles(request.getParameter("bookTitleSearch"));
//        book.setAuthor(request.getParameter("bookAuthorSearch"));
//        
//        searchBookList = bookDao.searchBook(book);
//        
//        request.setAttribute("listBookAttribute", searchBookList);
//        request.getRequestDispatcher("book.jsp").forward(request, response);
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String bookIdSearch = request.getParameter("bookIdSearch");
       String bookTitleSearch = request.getParameter("bookTitleSearch");
       String bookAuthorSearch = request.getParameter("bookAuthorSearch");
        BookDao bookDao = new BookDao();
        Book book = new Book();
        book.setBookId(bookIdSearch);
        book.setAuthor(bookAuthorSearch);
        book.setTitles(bookTitleSearch);
                     
            List<Book> bookList = bookDao.searchBook(book);
            
            request.setAttribute("listBookAttribute", bookList);
            request.getRequestDispatcher("book.jsp").forward(request, response);
        
    }
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
