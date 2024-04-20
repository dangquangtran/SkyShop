package dto;

/**
 *
 * @author Quanglatui
 */
public class SubCategory {
    private int subcategoryID;
    private String subName;
    private String description;
    private int status;

    public SubCategory() {
    }

    public SubCategory(int subcategoryID, String subName, String description, int status) {
        this.subcategoryID = subcategoryID;
        this.subName = subName;
        this.description = description;
        this.status = status;
    }

    public SubCategory(String subName, String description, int status) {
        this.subName = subName;
        this.description = description;
        this.status = status;
    }

    public int getSubcategoryID() {
        return subcategoryID;
    }

    public void setSubcategoryID(int subcategoryID) {
        this.subcategoryID = subcategoryID;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
