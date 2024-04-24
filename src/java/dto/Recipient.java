/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author THUAN
 */
public class Recipient {
    private int RecipientId;
    private String Dest_address;
    private String RecipientName;
    private int PhoneNumber;
    private int UserId;

    public Recipient() {
    }

    public Recipient(int RecipientId, String Dest_address, String RecipientName, int PhoneNumber, int UserId) {
        this.RecipientId = RecipientId;
        this.Dest_address = Dest_address;
        this.RecipientName = RecipientName;
        this.PhoneNumber = PhoneNumber;
        this.UserId = UserId;
    }

    public int getRecipientId() {
        return RecipientId;
    }

    public void setRecipientId(int RecipientId) {
        this.RecipientId = RecipientId;
    }

    public String getDest_address() {
        return Dest_address;
    }

    public void setDest_address(String Dest_address) {
        this.Dest_address = Dest_address;
    }

    public String getRecipientName() {
        return RecipientName;
    }

    public void setRecipientName(String RecipientName) {
        this.RecipientName = RecipientName;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }
    
}
