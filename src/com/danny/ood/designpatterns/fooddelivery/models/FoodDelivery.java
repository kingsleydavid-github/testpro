package com.danny.ood.designpatterns.fooddelivery.models;

import java.util.ArrayList;
import java.util.List;

public class FoodDelivery {

    private List<Restaurant> restaurants;
    private Cart cart;
    private User userDetails;
    
    public FoodDelivery()
    {
        this.restaurants = new ArrayList<>();
    }
    
    public void registerRestaurant(Restaurant restaurant)
    {
        this.restaurants.add(restaurant);
    }

    public void unregisterRestaurant(Restaurant restaurant)
    {
        this.restaurants.remove(restaurant);
    }
}
