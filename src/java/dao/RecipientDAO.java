package dao;

import dto.Recipient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.DBContext;

public class RecipientDAO {
    Connection conn= null;
    PreparedStatement ps =null;
    ResultSet rs = null;
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
}
