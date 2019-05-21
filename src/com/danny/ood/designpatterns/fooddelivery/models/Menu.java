package com.danny.ood.designpatterns.fooddelivery.models;

import java.util.List;

public class Menu {
    
    private Restaurant restaurant;
    private List<Dish> dishes;
    
    public Menu(List<Dish> dishes)
    {
        this.dishes = dishes;
        this.dishes.stream().forEach(dish -> {
            dish.setMenu(this);
        });
    }

    public List<Dish> getDishes()
    {
        return dishes;
    }

    public Restaurant getRestaurant()
    {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant)
    {
        this.restaurant = restaurant;
    }

}
