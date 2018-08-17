package com.sgc.data;


import com.sgc.model.Book;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookDao {
    Connection con = null;
    Statement stmt= null;
    
    public void saveBook(Book book){
        try {
            con = DatabaseConnection.getConnection();
            Statement statement=con.createStatement();
            statement.executeUpdate("insert into books_details values('"+book.getBookId()+"','"+book.getTitles()+"','"+book.getAuthor()+"','"+book.getMainclassification()+"','"+book.getSubclassification()+"','"+book.getYop()+"','"+book.getLpy()+"','"+book.getIsbn()+"','"+book.getNop()+"');");
            System.out.println("");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList viewBook(){
        ArrayList<Book> bookList = new ArrayList<>();
        
        String sql = "SELECT * FROM books_details";
        
        try{
            con = DatabaseConnection.getConnection();
             stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                Book book = new Book();
                book.setBookId(rs.getString("bookid"));
                book.setTitles(rs.getString("titles"));
                book.setAuthor(rs.getString("author"));
                book.setMainclassification(rs.getString("mainclassification"));
                book.setSubclassification(rs.getString("subclassification"));
                book.setYop(rs.getString("yearofpuclishing"));
                book.setLpy(rs.getString("lastprintedyear"));
                book.setIsbn(rs.getString("isbnno"));
                book.setNop(rs.getString("noofpages"));
                
                bookList.add(book);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bookList;
    }
    
    
    public ArrayList searchBook(Book book){
        Statement stmt = null;
        ArrayList<Book> listBook = new ArrayList<>();
        String sql = "SELECT * FROM books_details WHERE "
                + "bookid='" + book.getBookId() + "' OR "
                + "titles='" + book.getTitles() + "' OR "
                + "author='" + book.getAuthor() + "'";
        
        try{
            con = DatabaseConnection.getConnection();
            stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                book = new Book();
                book.setBookId(rs.getString("bookId"));
                book.setTitles(rs.getString("titles"));
                book.setAuthor(rs.getString("author"));
                book.setMainclassification(rs.getString("mainclassification"));
                book.setSubclassification(rs.getString("subclassification"));
                book.setYop(rs.getString("yearofpuclishing"));
                book.setLpy(rs.getString("lastprintedyear"));
                book.setIsbn(rs.getString("isbnno"));
                book.setNop(rs.getString("noofpages"));
                listBook.add(book);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listBook;
    }
    
    public ArrayList viewBookById(String bookId){
        String sql = "SELECT * FROM books_details WHERE bookid = '" + bookId + "'";
        ArrayList<Book> bookList = new ArrayList<>();
        try{
            con = DatabaseConnection.getConnection();
            stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                Book book = new Book();
                book.setBookId(rs.getString("bookid"));
                book.setTitles(rs.getString("titles"));
                book.setAuthor(rs.getString("author"));
                book.setMainclassification(rs.getString("mainclassification"));
                book.setSubclassification(rs.getString("subclassification"));
                book.setYop(rs.getString("yearofpuclishing"));
                book.setLpy(rs.getString("lastprintedyear"));
                book.setIsbn(rs.getString("isbnno"));
                book.setNop(rs.getString("noofpages"));
                bookList.add(book);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bookList;
    }
}


