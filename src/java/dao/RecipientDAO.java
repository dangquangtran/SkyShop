<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
=======
>>>>>>> 6770ea82b5f81063b4428d2e813f6349066e2f00
=======
>>>>>>> 6770ea82b5f81063b4428d2e813f6349066e2f00
=======
>>>>>>> 6770ea82b5f81063b4428d2e813f6349066e2f00
=======
>>>>>>> 6770ea82b5f81063b4428d2e813f6349066e2f00
package dao;

import dto.Recipient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.DBContext;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
/**
 *
 * @author THUAN
 */
=======
>>>>>>> 6770ea82b5f81063b4428d2e813f6349066e2f00
=======
>>>>>>> 6770ea82b5f81063b4428d2e813f6349066e2f00
=======
>>>>>>> 6770ea82b5f81063b4428d2e813f6349066e2f00
=======
>>>>>>> 6770ea82b5f81063b4428d2e813f6349066e2f00
public class RecipientDAO {
    Connection conn= null;
    PreparedStatement ps =null;
    ResultSet rs = null;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    
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
=======
=======
>>>>>>> 6770ea82b5f81063b4428d2e813f6349066e2f00
=======
>>>>>>> 6770ea82b5f81063b4428d2e813f6349066e2f00
=======
>>>>>>> 6770ea82b5f81063b4428d2e813f6349066e2f00
    public List<dto.Recipient> getRecipientByUserID(int userID){
        List<Recipient> listRecipient = new ArrayList<>();
        String query = "Select * from Recipient where UserId = ?";
        try {
                conn = new DBContext().getConnection();
                ps = conn.prepareStatement(query);
                ps.setInt(1, userID);
                rs = ps.executeQuery();
                while (rs.next()) {
                    listRecipient.add(new dto.Recipient(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
                        rs.getInt(6)));
                }
                return listRecipient;
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return null;
    }
    public void createRecipient(Recipient newItem) {
        try {
            // Câu truy vấn để chèn dữ liệu vào bảng Recipient
            String sql = "INSERT INTO Recipient (destAddress, recipientName, phoneNumber, status, userID) "
                    + "VALUES (?, ?, ?, ?, ?)";
            
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, newItem.getDestAddress());
            ps.setString(2, newItem.getRecipientName());
            ps.setString(3, newItem.getPhoneNumber());
            ps.setInt(4, newItem.getStatus());
            ps.setInt(5, newItem.getUserID());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error creating Recipient: " + e.getMessage());
        }
        
        // Nếu có lỗi, trả về null hoặc xử lý ngoại lệ khác
    }
    
    public Recipient getRecipientByOrderID(int orderID){
        String query = "SELECT r.recipientID, r.destAddress, r.recipientName, r.phoneNumber "
                     + "FROM Orders o "
                     + "JOIN Recipient r ON o.RecipientId = r.recipientID "
                     + "WHERE o.orderID = ?";
        try {
                conn = new DBContext().getConnection();
                ps = conn.prepareStatement(query);
                ps.setInt(1, orderID);
                rs = ps.executeQuery();
                if (rs.next()) {
                    return new dto.Recipient(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
                        rs.getInt(6));
                }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return null;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6770ea82b5f81063b4428d2e813f6349066e2f00
=======
>>>>>>> 6770ea82b5f81063b4428d2e813f6349066e2f00
=======
>>>>>>> 6770ea82b5f81063b4428d2e813f6349066e2f00
=======
>>>>>>> 6770ea82b5f81063b4428d2e813f6349066e2f00
    }
}
