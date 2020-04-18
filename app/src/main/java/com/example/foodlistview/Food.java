package com.example.foodlistview;

public class Food {
    private String nameFood;
    private String price;
    private int image_preview;


    public Food(String nameFood, String price, int image_preview) {
        this.nameFood = nameFood;
        this.price = price;
        this.image_preview = image_preview;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImage_preview() {
        return image_preview;
    }

    public void setImage_preview(int image_preview) {
        this.image_preview = image_preview;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }
}
