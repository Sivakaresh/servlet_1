package com.sgc.data;

import com.sgc.model.MC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MCDao {
    static Connection con = null;
    static Statement statement = null;
    static PreparedStatement pstmt = null;
    public static void saveMC(MC mc) throws ClassNotFoundException, SQLException {
        
        con = DatabaseConnection.getConnection();
        statement = con.createStatement();
        statement.executeUpdate("insert into main_class values('" + mc.getMainClassificationId() + "','" + mc.getMainClassificationName() + "');");
        con.close();
    }

    // public void mainSearch()
    public List M_C_name() throws ClassNotFoundException, SQLException {
        List<String> classificationList = new ArrayList<>();
        try {
            Connection c = DatabaseConnection.getConnection();

            String query = "select M_C_name from main_class";
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                classificationList.add(rs.getString("M_C_name"));
                System.out.println("test" + rs.getString("M_C_name"));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        con.close();
        return classificationList;
    }
    
    public List<MC> searchMain(String searchKey) throws SQLException, ClassNotFoundException{
       
        con = DatabaseConnection.getConnection();
        
        String sql = "SELECT * FROM main_class WHERE M_C_name = ?";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, searchKey);
        ResultSet rs = pstmt.executeQuery();
        
        List<MC> mainList = new ArrayList<>();
        while(rs.next()){
         MC mainClass = new MC();
         mainClass.setMainClassificationId(rs.getString("M_C_ID"));
         mainClass.setMainClassificationName(rs.getString("M_C_name"));
         mainList.add(mainClass);
        }
        con.close();
        return mainList;                
    }
    public void deleteMain(String deleteKey) throws SQLException, ClassNotFoundException{
        con=DatabaseConnection.getConnection();
        String sql="DELETE FROM main_class WHERE M_C_ID=?";
        pstmt=con.prepareStatement(sql);
        pstmt.setString(1, deleteKey);
        pstmt.executeUpdate();
        
        con.close();
        
        
    }
    public List<MC> viewMain(){
       
            List<MC> mainList = new ArrayList<>();
        try {
            con = DatabaseConnection.getConnection();
            
            String sql = "SELECT * FROM main_class";
            pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                MC mainClass = new MC();
                mainClass.setMainClassificationId(rs.getString("M_C_ID"));
                mainClass.setMainClassificationName(rs.getString("M_C_name"));
                mainList.add(mainClass);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MCDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MCDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return mainList;
    }
    
    
}
