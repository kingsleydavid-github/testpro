package com.danny.ood.designpatterns.factory;

public class Rectangle extends Shape {

    private Double height;
    private Double width;
    
    public Rectangle(){}
    
    public Rectangle(Double height, Double width){
        this.height = height;
        this.width = width;
    }
    
    static
    {
        ShapeFactory.getInstance().registerShape("rectangle", new Rectangle());
    }
    
    @Override
    public Double getArea()
    {
        return this.height * this.width ;
    }

    @Override
    public Rectangle getShape()
    {
        System.out.println("Rectangle Created");
        return new Rectangle();
    }

}
