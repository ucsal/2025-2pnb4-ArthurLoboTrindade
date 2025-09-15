package br.com.mariojp.figureeditor;

import java.awt.event.MouseEvent;

public interface ShapeFactory {

    ConcreteShape createCircle(MouseEvent e, double size);

	
}
