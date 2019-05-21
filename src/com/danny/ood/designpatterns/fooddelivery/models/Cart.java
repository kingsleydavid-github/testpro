package com.danny.ood.designpatterns.fooddelivery.models;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Cart {

    private List<Item> items; 
    
    public Cart()
    {
        items = new ArrayList<>();
    }
    
    public void addItem(Item items)
    {
        this.items.add(items);
    }

    public void removeItem(Item items)
    {
        this.items.remove(items);
    }
    
    public Integer getTotalPrice()
    {
        AtomicInteger total = new AtomicInteger(0);
        this.items.stream().forEach(item -> {
            int q = item.getQuantity();
            while( q > 0)
            {
                total.addAndGet(item.getDish().getPrice());
            }
        });
        return total.get();
    }
}
