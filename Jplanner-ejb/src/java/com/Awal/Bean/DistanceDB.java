
package com.Awal.Bean;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
//import com.Awal.Bean.connection;
import java.sql.DriverManager;



/**
 *
 * @author ak2049l
 */
@Stateless
@LocalBean
public class DistanceDB {

    public static int stid;
   
 
    public static int insertQuery (DistanceBean Db) throws SQLException{
        
        
        Statement query = null;
       Statement statement = null;
        String result ="";
        
        try{
              Class.forName("org.apache.derby.jdbc.ClientDriver");
        
            String url="jdbc:derby://localhost:1527/awalDB";
            Connection conn= DriverManager.getConnection(url,"awal","awal");
           PreparedStatement ps =conn.prepareStatement ("insert into Distance(distanceid, stid)values(?,?)"); 
           ps.setInt(1, Db.getDistanceid());
           ps.setInt(2, Db.getStid());
           ps.executeQuery();
            
           ResultSet returnStid =ps.getGeneratedKeys();
           
           
        }catch (Exception ex){
            
        }
        return stid;
    }
 
}
