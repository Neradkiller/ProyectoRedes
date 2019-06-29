package principal.control;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import principal.herramientas.CargadorRecursos;

public class Mouse {

	private final Cursor cursor;
	
	public Mouse() {
		Toolkit config = Toolkit.getDefaultToolkit();
		
		BufferedImage icono = CargadorRecursos.cargarImagenCompatibleTraslucida("/cursor/red.png");
		
		Point punta = new Point(0,0);
		
		this.cursor = config.createCustomCursor(icono, punta, "Cursor");
	}

	public Cursor getCursor() {
		return cursor;
	}
	
}
