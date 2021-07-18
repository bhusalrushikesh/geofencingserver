package com.example.myrestuarantserver.Model;

public class Food {


    private String Name,Image,Description,Price,Discount,MenuId;

    public Food(){

    }

    public Food(String name,String image, String description, String price, String discount, String menuId){

        Name = name;
        Image = image;
        Description = description;
        Price = price;
        Discount = discount;
        MenuId = menuId;
    }

    public String getImage() {
        return Image;
    }

    public String getName() {
        return Name;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getDescription() {
        return Description;
    }

    public String getDiscount() {
        return Discount;
    }

    public String getMenuId() {
        return MenuId;
    }

    public String getPrice() {
        return Price;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setDiscount(String discount) {
        Discount = discount;
    }

    public void setMenuId(String menuId) {
        MenuId = menuId;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(String price) {
        Price = price;
    }


}