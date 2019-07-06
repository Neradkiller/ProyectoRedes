package principal.herramientas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class DibujoDebug {

	private static int objetosDibujados = 0;
	
	public static void dibujarImagen(final Graphics g, final BufferedImage img, final int x, final int y) {
		objetosDibujados++;
		g.drawImage(img,x,y,null);
	}
	
	public static void dibujarImagen(final Graphics g, final BufferedImage img, final Point p) {
		objetosDibujados++;
		g.drawImage(img,p.x,p.y,null);
	}
	
	public static void dibujarString(final Graphics g,final String s,final int x, final int y, final Color c) {
		g.setColor(c);
		g.drawString(s, x, y);
	}
	
	public static void dibujarString(final Graphics g,final String s,final Point p,final Color c) {
		g.setColor(c);
		g.drawString(s, p.x, p.y);
	}
	
	public static void dibujarRectanguloRelleno(final Graphics g, final int x, final int y, final int ancho, final int alto) {
		g.fillRect(x, y, ancho, alto);
	}
	
	public static void dibujarRectanguloRelleno(final Graphics g, final Rectangle r) {
		g.fillRect(r.x, r.y, r.width, r.height);
	}
	
	public static void dibujarRectanguloRelleno(final Graphics g, final int x, final int y, final int ancho, final int alto, final Color c) {
		g.setColor(c);
		g.fillRect(x, y, ancho, alto);
	}
	
	public static void dibujarRectanguloRelleno(final Graphics g, final Rectangle r,final Color c) {
		g.setColor(c);
		g.fillRect(r.x, r.y, r.width, r.height);
	}
	
	public static void dibujarRectanguloVacio(final Graphics g, final int x, final int y, final int ancho, final int alto) {
		g.drawRect(x, y, ancho, alto);
	}
	
	public static void dibujarRectanguloVacio(final Graphics g, final Rectangle r) {
		g.drawRect(r.x, r.y, r.width, r.height);
	}
	
	public static void dibujarRectanguloVacio(final Graphics g, final int x, final int y, final int ancho, final int alto, final Color c) {
		g.setColor(c);
		g.drawRect(x, y, ancho, alto);
	}
	
	public static void dibujarRectanguloVacio(final Graphics g, final Rectangle r,final Color c) {
		g.setColor(c);
		g.drawRect(r.x, r.y, r.width, r.height);
	}
}
