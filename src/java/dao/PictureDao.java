/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.BookImages;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static util.DBContext.getConnection;

/**
 *
 * @author DELL
 */
public class PictureDao {
    
    
    public List<BookImages> getBookImages() throws SQLException {
        List<BookImages> listBook = new ArrayList<BookImages>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
                pst = getConnection().prepareStatement("SELECT * FROM BookImages");
                rs = pst.executeQuery();
                while (rs.next()) {
                    listBook.add(new BookImages(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
                }
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return listBook;
    }
}
