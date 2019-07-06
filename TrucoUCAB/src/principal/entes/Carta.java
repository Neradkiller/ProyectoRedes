package principal.entes;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Carta {
	
	private String VALOR;
	private String TIPO;
	private boolean ENMAZO;
	
	private int posX;
	private int posY;
	
	private BufferedImage imagen;
	
	public Carta(String valor, String tipo, boolean enmazo,  BufferedImage bufferedImage) {
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

	public String getVALOR() {
		return VALOR;
	}

	public void setVALOR(String vALOR) {
		VALOR = vALOR;
	}

	public String getTIPO() {
		return TIPO;
	}

	public void setTIPO(String tIPO) {
		TIPO = tIPO;
	}

	public boolean isENMAZO() {
		return ENMAZO;
	}

	public void setENMAZO(boolean eNMAZO) {
		ENMAZO = eNMAZO;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

}