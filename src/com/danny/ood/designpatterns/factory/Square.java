package com.danny.ood.designpatterns.factory;

public class Square extends Shape {

    private Double side;

    public Square(){}
    public Square(Double side){
        this.side = side;
    }
    
    static
    {
        ShapeFactory.getInstance().registerShape("square", new Square());
    }
    
    @Override
    public Double getArea()
    {
        return Math.sqrt(this.side);
    }

    @Override
    public Shape getShape()
    {
        System.out.println("Square Created");
        return new Square();
    }
}
