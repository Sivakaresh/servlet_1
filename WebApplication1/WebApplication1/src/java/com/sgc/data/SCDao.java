
package com.sgc.data;

import static com.sgc.data.MCDao.con;
import static com.sgc.data.MCDao.pstmt;
import com.sgc.model.SC;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SCDao {
    public static void saveSC(SC sc)throws ClassNotFoundException, SQLException{
        DatabaseConnection dbConnection=new DatabaseConnection();
        Connection con=dbConnection.getConnection();
        Statement statement=con.createStatement();
        statement.executeUpdate("insert into sub_class values('"+sc.getSubClassificationId()+"','"+sc.getSubClassificationName()+"');");
    }
    
     public List S_C_name() throws ClassNotFoundException{
         List<String> sclassificationList=new ArrayList<>();
        try{    
       DatabaseConnection dbConnection=new DatabaseConnection();
        Connection c =dbConnection.getConnection();
        //System.out.print("kowsik");
        String query="select S_C_name from sub_class";
        Statement stmt = c.createStatement();
       ResultSet rs= stmt.executeQuery(query);
       
            while (rs.next()) {
               sclassificationList.add(rs.getString("S_C_name"));
                System.out.println("test"+rs.getString("S_C_name"));
            }
            
        }
             
      catch(SQLException e)
       {
           System.out.println(e.toString());
       }
       
    return sclassificationList;
    }
    
     public ArrayList<SC> viewSubClassificationByMainClassficationId(String mainClassificationId){
         ArrayList<SC> subClassificationList = new ArrayList<>();
         
         String sql = "SELECT * FROM sub_class "
                 + "WHERE M_C_ID='" + mainClassificationId + "'";
         Statement stmt = null;
         
         try{
             DatabaseConnection dbConnection=new DatabaseConnection();
        Connection c =dbConnection.getConnection();
        
            stmt = c.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                SC sc = new SC();
                sc.setSubClassificationId(rs.getString("S_C_ID"));
                sc.setSubClassificationName(rs.getString("S_C_name"));
                subClassificationList.add(sc);
            }
            
         } catch (SQLException ex) {
            Logger.getLogger(SCDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SCDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         return subClassificationList;
     }
     
      public List<SC> viewSub() throws SQLException, ClassNotFoundException{
       
        con = DatabaseConnection.getConnection();
        
        String sql = "SELECT * FROM sub_class";
        pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        
        List<SC> mainList = new ArrayList<>();
        while(rs.next()){
         SC mainClass = new SC();
         mainClass.setSubClassificationId(rs.getString("S_C_ID"));
         mainClass.setSubClassificationName(rs.getString("S_C_name"));
         mainList.add(mainClass);
        }
        return mainList;                
    }
}
