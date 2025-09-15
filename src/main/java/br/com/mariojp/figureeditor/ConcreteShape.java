package br.com.mariojp.figureeditor;

import java.awt.Color;
import java.awt.Shape;

public class ConcreteShape {

	private final Shape shape;
    private final Color fill;
    private final Color border;
	
    public ConcreteShape(Shape shape, Color fill, Color border) {
		this.shape = shape;
		this.fill = fill;
		this.border = border;
	}
	
    public Shape getShape() {
		return shape;
	}
	public Color getFill() {
		return fill;
	}
	public Color getBorder() {
		return border;
	}
    
    
}
