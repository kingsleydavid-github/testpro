package com.danny.ood.designpatterns.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeGenerator {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int inp = 5;
      
        List<String> shapes = new ArrayList<>();
        
        while(inp > 0)
        {
            shapes.add(in.nextLine());
            inp--;
        }
        
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        
        shapes.stream().forEach(s -> {
            
            System.out.println("Shape : "  + s);
            Shape shape = shapeFactory.createShape(s);
        });
    }
}
