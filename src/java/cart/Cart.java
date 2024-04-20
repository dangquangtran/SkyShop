/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cart;

import dto.Book;
import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 */
//Quang Vinh >>>>>>>>>>
public class Cart {

    private Map<String, Book> cart;

    public Cart() {
    }

    public Cart(Map<String, Book> cart) {
        this.cart = cart;
    }

    //Lấy giỏ hàng
    public Map<String, Book> getCart() {
        return cart;
    }

    //Thiết đặt giỏ hàng
    public void setCart(Map<String, Book> cart) {
        this.cart = cart;
    }

    //Thêm sản phẩm mới vào giỏ hàng
//    public boolean add(Book product) {
//        boolean check = false;
//        if (this.cart == null) {
//            this.cart = new HashMap<>();
//
//        }
//        if (this.cart.containsKey(product.getProductID())) {
//            int currentQuantity = this.cart.get(product.getProductID()).getQuantity();
//            product.setQuantity(currentQuantity + product.getQuantity());
//        }
//        this.cart.put(Integer.toString(product.getProductID()), product);
//        check = true;
//        return check;
//    }

    //Xóa sản phẩm khỏi giỏ hàng
    public boolean remove(int productID) {
        boolean check = false;
        if (this.cart != null) {
            if (this.cart.containsKey(Integer.toString(productID))) {
                this.cart.remove(Integer.toString(productID));
                check = true;
            }
        }
        return check;
    }

    //Chỉnh sửa số lượng sản phẩm
    public boolean edit(int productID, Book product) {
        boolean check = false;
        if (this.cart != null) {
            if (this.cart.containsKey(Integer.toString(productID))) {
                this.cart.replace(Integer.toString(productID), product);
                check = true;
            }
        }
        return check;
    }

    //Lấy tổng thành tiền của giỏ hàng
//    public double getTotalMoney() {
//        double total = 0;
//        for (Book product : cart.values()) {
//            total += product.getQuantity() * product.getPrice();
//        }
//        return total;
//    }

    //Xóa tất cả sản phẩm trong giỏ hàng
    public boolean removeAll() {
        boolean check = false;
        if (this.cart != null) {
            this.cart.clear();
            check = true;
        }
        return check;
    }
}
//<<<<<<<<<<