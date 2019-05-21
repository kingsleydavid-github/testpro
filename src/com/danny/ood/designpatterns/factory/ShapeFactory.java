package com.danny.ood.designpatterns.factory;

import java.util.HashMap;

public class ShapeFactory {
    
    private static ShapeFactory shapeFactory;
    
    private HashMap shapes = new HashMap<>();
    
    public void registerShape(String shapeName, Shape shape)
    {
        shapes.put(shapeName, shape);
    }
    
    public Shape createShape(String shape)
    {
           //Using reflection
           /* Class shapeCls = (Class) shapes.get(shape);
              Constructor shapeConstructor = shapeCls.getDeclaredConstructor(new Class[] {String.class});
              return (Shape) shapeConstructor.newInstance( ); 
           */
           //without relection
           return ((Shape) shapes.get(shape.toLowerCase())).getShape();
    }
    
    public static synchronized ShapeFactory getInstance()
    {
        if(shapeFactory == null)
        {
            shapeFactory = new ShapeFactory(); 
            return shapeFactory;
        }
        return shapeFactory;
    }

}
