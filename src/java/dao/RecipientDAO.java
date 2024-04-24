/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Recipient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.DBContext;

/**
 *
 * @author THUAN
 */
public class RecipientDAO {
    Connection conn= null;
    PreparedStatement ps =null;
    ResultSet rs = null;
    
     public List<Recipient> getAllListRecipient() {
        List<Recipient> listSub = new ArrayList<>();
        String query = "Select * from Recipient";
        try {
                conn = new DBContext().getConnection();
                ps = conn.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()) {
                    listSub.add(new Recipient(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5)));
                }
            
        } 
        catch (Exception e) {
            
        }
        return listSub;
    }
}
