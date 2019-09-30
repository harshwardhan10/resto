package com.example.resto;

public class CategoryView {
    private String imageUrl;
    private String categoryText;
//    private String [] dishes;
    public CategoryView() {
    }

    public CategoryView(String imageUrl, String categoryText) {
        this.imageUrl = imageUrl;
        this.categoryText = categoryText;
    }

//    public CategoryView(String imageUrl, String categoryText, String[] dishes) {
//        this.imageUrl = imageUrl;
//        this.categoryText = categoryText;
//        this.dishes = dishes;
//    }

//    public String[] getDishes() {
//        return dishes;
//    }
//
//    public void setDishes(String[] dishes) {
//        this.dishes = dishes;
//    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategoryText() {
        return categoryText;
    }

    public void setCategoryText(String categoryText) {
        this.categoryText = categoryText;
    }
}
