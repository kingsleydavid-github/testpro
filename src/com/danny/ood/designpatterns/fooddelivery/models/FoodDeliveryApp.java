package com.danny.ood.designpatterns.fooddelivery.models;

import java.util.ArrayList;
import java.util.List;

public class FoodDeliveryApp {

    public static void main(String[] args)
    {
        List<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish("Tandoori Chicken", 200));
        dishes.add(new Dish("Chicken 65", 150));
        dishes.add(new Dish("Hyderabadi Dum Biriyani", 250));
        
        Menu m1 = new Menu(dishes);
        
        Restaurant r1 = new Restaurant("Lets Eat out !!!", m1);
        
        r1.getMenu().getDishes().stream().filter(dish -> dish.getName().contains("Biriyani")).forEach(d -> {
            System.out.println("Dish" + d.getName());
            System.out.println("Dish is from Restaurant :: " + d.getMenu().getRestaurant().getRestaurantName());
        });
    }
}
