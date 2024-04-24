<<<<<<< HEAD
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
=======
package dto;

public class Recipient {
    private int recipientID;
    private String destAddress;
    private String recipientName;
    private String phoneNumber;
    private int status;
    private int userID;
>>>>>>> 6770ea82b5f81063b4428d2e813f6349066e2f00

    public Recipient() {
    }

<<<<<<< HEAD
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
=======
    public Recipient(int recipientID, String destAddress, String recipientName, String phoneNumber, int status, int userID) {
        this.recipientID = recipientID;
        this.destAddress = destAddress;
        this.recipientName = recipientName;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.userID = userID;
    }

    public Recipient(String destAddress, String recipientName, String phoneNumber, int status, int userID) {
        this.destAddress = destAddress;
        this.recipientName = recipientName;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.userID = userID;
    }

    public int getRecipientID() {
        return recipientID;
    }

    public void setRecipientID(int recipientID) {
        this.recipientID = recipientID;
    }

    public String getDestAddress() {
        return destAddress;
    }

    public void setDestAddress(String destAddress) {
        this.destAddress = destAddress;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    
    
>>>>>>> 6770ea82b5f81063b4428d2e813f6349066e2f00
    
}
