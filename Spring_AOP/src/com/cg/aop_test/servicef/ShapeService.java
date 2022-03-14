package com.cg.aop_test.servicef;

import com.cg.aop_test.model.Circle;
import com.cg.aop_test.model.Triangle;

public class ShapeService {
	private Circle circle;
	private Triangle triangle;
	
	public Circle getCircle()
	{
		return circle;
	}
    public Triangle getTriangle()
    {
    	return triangle;
    }
    public void setTriangle(Triangle triangle)
    {
    	this.triangle = triangle;
    }
    
}
