package com.danny.ood.designpatterns.fooddelivery.models;

public class Item {

    private Dish dish;
    private Integer quantity;
    
    public Item(Dish dish, Integer quantity)
    {
        this.dish = dish;
        this.quantity = quantity;
    }
    
    public Dish getDish()
    {
        return dish;
    }
    public Integer getQuantity()
    {
        return quantity;
    }

    public void setQuantity(Integer quantity)
    {
        this.quantity = quantity;
    }
    
}
