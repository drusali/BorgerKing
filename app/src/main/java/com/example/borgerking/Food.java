package com.example.borgerking;

public class Food {
    private int foodID;
    private String foodname;
    private String desc;
    private String price;
    private int imageDrawableId;

    public Food(int foodID, String foodname, String desc, String price, int imageDrawableId) {
        this.foodID = foodID;
        this.foodname = foodname;
        this.price=price;
        this.desc = desc;
        this.imageDrawableId = imageDrawableId;
    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }
}
