package principal.sprites;

import java.awt.image.BufferedImage;

public class Sprite {
	
	private final BufferedImage imagen;
	
	private final int ANCHO;
	private final int ALTO;
	
	public Sprite(BufferedImage imagen) {
		this.imagen = imagen;
		
		ANCHO = imagen.getWidth();
		ALTO = imagen.getHeight();
	}

	public BufferedImage getImagen() {
		return imagen;
	}

	public int getANCHO() {
		return ANCHO;
	}

	public int getALTO() {
		return ALTO;
	}
	
	
}
