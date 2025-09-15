package br.com.mariojp.figureeditor;

import java.awt.Color;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

public class BlueFactory implements ShapeFactory{
	
	private static final Color color =new Color(30, 144, 255);
	
	@Override
	public ConcreteShape createCircle(MouseEvent e, double size) {
		Shape s =  new Ellipse2D.Double(e.getPoint().x, e.getPoint().y, size, size);
		return new ConcreteShape(s, color, color);
	}
	
	

}
