package principal.entes;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Carta {
	
	private String VALOR;
	private String TIPO;
	
	private String valorTrama;
	private String tipoTrama;
	
	private boolean ENMAZO;
	
	private BufferedImage imagen;
	
	public Carta(String valor, String tipo,String valorTrama, String tipoTrama, boolean enmazo,  BufferedImage bufferedImage) {
		this.VALOR = valor;
		this.TIPO = tipo;
		this.valorTrama = valorTrama;
		this.tipoTrama = tipoTrama;
		this.ENMAZO = enmazo;
		
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

	public String getValorTrama() {
		return valorTrama;
	}

	public void setValorTrama(String valorTrama) {
		this.valorTrama = valorTrama;
	}

	public String getTipoTrama() {
		return tipoTrama;
	}

	public void setTipoTrama(String tipoTrama) {
		this.tipoTrama = tipoTrama;
	}

}