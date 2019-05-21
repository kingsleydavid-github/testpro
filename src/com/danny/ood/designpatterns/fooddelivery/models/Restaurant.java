package com.danny.ood.designpatterns.fooddelivery.models;

public class Restaurant {

    private String restaurantName;
    private Menu menu;
    
    public Restaurant(){
    }
    
    public Restaurant(String name, Menu menu)
    {
        this.restaurantName = name;
        this.menu = menu;
        this.menu.setRestaurant(this);
    }

    public String getRestaurantName()
    {
        return restaurantName;
    }


    public Menu getMenu()
    {
        return menu;
    }
}
