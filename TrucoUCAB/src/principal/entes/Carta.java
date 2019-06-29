package principal.entes;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Carta {
	
	private static int VALOR;
	private static String TIPO;
	private static boolean ENMAZO;
	
	private int posX;
	private int posY;
	
	private BufferedImage imagen;
	
	public Carta(int valor, String tipo, boolean enmazo,  BufferedImage bufferedImage) {
		this.VALOR = valor;
		this.TIPO = tipo;
		this.ENMAZO = enmazo;
		
		this.posX = posX;
		this.posY = posY;
		
		this.imagen = bufferedImage;
	}
	
	public void dibujar(Graphics g, int x , int y) {
		
	
	}

	public BufferedImage getImagen() {
		return imagen;
	}

	public void setImagen(BufferedImage imagen) {
		this.imagen = imagen;
	}
}
