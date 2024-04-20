package dao;

import dto.SubCategory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.DBContext;

/**
 *
 * @author Quanglatui
 */
public class SubCategoryDAO {
    Connection conn= null;
    PreparedStatement ps =null;
    ResultSet rs = null;
    public List<SubCategory> getSubByCategoryID(int id) {
    List<SubCategory> subcategories = new ArrayList<>();
    String query = "SELECT s.* FROM SubCategory s INNER JOIN Cate_Subcate cs ON s.ID = cs.SubCategoryID WHERE cs.CategoryId = ?";
    
    try {
        conn = new DBContext().getConnection();
        ps = conn.prepareStatement(query);
        ps.setInt(1, id);
        rs = ps.executeQuery();
        
        while (rs.next()) {
            SubCategory subcategory = new SubCategory();
            subcategory.setSubcategoryID(rs.getInt("ID"));
            subcategory.setSubName(rs.getString("SubName"));
            subcategory.setDescription(rs.getString("Description"));
            subcategory.setStatus(rs.getInt("Status"));
            subcategories.add(subcategory);
        }
    } catch (Exception e) {
        e.printStackTrace();
    } 
    
    return subcategories;
}
}
