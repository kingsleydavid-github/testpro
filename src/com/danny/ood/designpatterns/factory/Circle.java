package com.danny.ood.designpatterns.factory;

public class Circle extends Shape{

    private Double radius;
    
    public Circle()
    {}
    
    public Circle(Double radius)
    {
        this.radius = radius;
    }
    
    static
    {
        ShapeFactory.getInstance().registerShape("circle", new Circle());
    }
    
    @Override
    public Double getArea()
    {
        return 3.14 * Math.sqrt(this.radius);
    }

    @Override
    public Circle getShape()
    {
        System.out.println("Circle Created");
        return new Circle();
    }

}
