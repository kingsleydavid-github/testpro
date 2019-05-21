package com.danny.ood.designpatterns.fooddelivery.models;

public class Dish {
    
    private String name;
    private Integer price;
    private Menu menu;
    
    public Dish() {}
    
    public Dish(String name, Integer price){
        this.name = name;
        this.price = price;
    }
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getPrice()
    {
        return price;
    }

    public void setPrice(Integer price)
    {
        this.price = price;
    }
    
    public Menu getMenu()
    {
        return menu;
    }
    
    public void setMenu(Menu menu)
    {
        this.menu = menu;
    }
}
