package com.example.myrestuarantserver.Model;

import java.util.List;

public class Request {

    private String phone;
    private String name;
    private String address;
    private String total;
    private String status;
    private String comment;
    private List<Order> foods; // list of food order

    public Request(){

    }

    public Request(String phone, String name, String address, String total,String status, String comment, List<Order> foods){
        this.phone = phone;
        this.name = name;
        this.address = address;
        this.total = total;
        this.foods = foods;
        this.comment = comment;
        this.status = "0"; //default is 0,1:shipping 2 shipped
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal() {
        return total;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setFoods(List<Order> foods) {
        this.foods = foods;
    }

    public List<Order> getFoods() {
        return foods;
    }

}
