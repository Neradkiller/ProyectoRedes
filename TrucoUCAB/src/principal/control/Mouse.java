 package principal.control;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;

import javax.swing.SwingUtilities;

import principal.Constantes;
import principal.graficos.SuperficieDibujo;

public class Mouse extends MouseAdapter {

		private Point pos;
	public Mouse(final SuperficieDibujo sd) {
		Toolkit config = Toolkit.getDefaultToolkit();
		
		Point punta = new Point(0,0);
		pos = new Point();
		actualizarPos(sd);
	}
	private void actualizarPos(final SuperficieDibujo sd) {
		final Point posInicial = MouseInfo.getPointerInfo().getLocation();
		
		SwingUtilities.convertPointFromScreen(posInicial, sd);
		
		pos.setLocation(posInicial.getX(),posInicial.getY());
	}
	public void actualizar(final SuperficieDibujo sd) {
		actualizarPos(sd);
	}
	
	public void dibujar(final Graphics g) {
		g.setColor(Color.RED);
		g.drawString("RX " + pos.getX() , Constantes.ANCHO_PANTALLA - 70, Constantes.ALTO_PANTALLA - 30);
		g.drawString("RY " + pos.getY() , Constantes.ANCHO_PANTALLA - 70, Constantes.ALTO_PANTALLA - 15);
	}
}

