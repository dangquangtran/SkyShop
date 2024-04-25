/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.sql.Date;

/**
 *
 * @author THUAN
 */
public class OrderRevenue {
   
    private Date orderDate;
    private int totalRevenue;

    public OrderRevenue(Date orderDate, int totalRevenue) {
        this.orderDate = orderDate;
        this.totalRevenue = totalRevenue;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public int getTotalRevenue() {
        return totalRevenue;
    }
}


