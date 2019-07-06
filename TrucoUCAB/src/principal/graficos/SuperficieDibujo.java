package principal.graficos;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;

import principal.control.GestorControles;
import principal.control.Mouse;
import principal.maquinaEstados.GestorEstados;

public class SuperficieDibujo extends Canvas {
	
	private static final long serialVersionUID = -6227038142688953660L;
	
	private int ancho;
	private int alto;
	
	private Mouse mouse;
	
	public SuperficieDibujo(final int ancho, final int alto) {
		this.ancho = ancho;
		this.alto = alto;		
		setIgnoreRepaint(true);
		setPreferredSize(new Dimension(ancho, alto));
		addKeyListener(GestorControles.teclado);
		setFocusable(true);
		requestFocus();
		this.mouse = new Mouse(this);
	}
	
	public void dibujar(final GestorEstados ge) {
		BufferStrategy buffer = getBufferStrategy();
		
		if (buffer == null) {
			createBufferStrategy(4);
			return;
			}
		
		final Graphics2D g = (Graphics2D) buffer.getDrawGraphics();
		
		//Aca se puede dibujar el fondo del juego
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, ancho, alto);
		
		ge.dibujar(g);
		mouse.dibujar(g);
		
		Toolkit.getDefaultToolkit().sync();
		
		g.dispose();
		
		buffer.show();
	}
	public void actualizar() {
		mouse.actualizar(this);
	}
	
	//GETTERS SETTERS

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
}
