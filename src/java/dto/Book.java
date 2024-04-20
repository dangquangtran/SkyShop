/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.sql.Date;

/**
 *
 * @author DELL
 */
public class Book {
    private int bookId;
    private String bookName;
    private String description;
    private String authorName;
    private String publishingCompany;
    private String issusingCompany;
    private String translatorName;
    private Date publishDate;
    private int quantity;
    private float unitPrice;
    private int categoryId;
    private int status;
    private int totalFeedback;

    public Book() {
    }

    public Book(String bookName, String description, String authorName, String publishingCompany, String issusingCompany, String translatorName, Date publishDate, int quantity, float unitPrice, int categoryId, int status, int totalFeedback) {
        this.bookName = bookName;
        this.description = description;
        this.authorName = authorName;
        this.publishingCompany = publishingCompany;
        this.issusingCompany = issusingCompany;
        this.translatorName = translatorName;
        this.publishDate = publishDate;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.categoryId = categoryId;
        this.status = status;
        this.totalFeedback = totalFeedback;
    }

    public Book(int bookId, String bookName, String description, String authorName, String publishingCompany, String issusingCompany, String translatorName, Date publishDate, int quantity, float unitPrice, int categoryId, int status, int totalFeedback) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.description = description;
        this.authorName = authorName;
        this.publishingCompany = publishingCompany;
        this.issusingCompany = issusingCompany;
        this.translatorName = translatorName;
        this.publishDate = publishDate;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.categoryId = categoryId;
        this.status = status;
        this.totalFeedback = totalFeedback;
    }

    
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public String getIssusingCompany() {
        return issusingCompany;
    }

    public void setIssusingCompany(String issusingCompany) {
        this.issusingCompany = issusingCompany;
    }

    public String getTranslatorName() {
        return translatorName;
    }

    public void setTranslatorName(String translatorName) {
        this.translatorName = translatorName;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getTotalFeedback() {
        return totalFeedback;
    }

    public void setTotalFeedback(int totalFeedback) {
        this.totalFeedback = totalFeedback;
    }

    @Override
    public String toString() {
        return "Book{" + "bookId=" + bookId + ", bookName=" + bookName + ", description=" + description + ", authorName=" + authorName + ", publishingCompany=" + publishingCompany + ", issusingCompany=" + issusingCompany + ", translatorName=" + translatorName + ", publishDate=" + publishDate + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", categoryId=" + categoryId + ", status=" + status + ", totalFeedback=" + totalFeedback + '}';
    }
    
}