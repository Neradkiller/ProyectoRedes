package principal.sprites;

import java.awt.image.BufferedImage;

import principal.herramientas.CargadorRecursos;

public class HojaSprites {

	final private int anchoHojaPixeles;
	final private int altoHojaPixeles;
	
	final private int anchoHojaENSprites;
	final private int altoHojaENSprites;
	
	final private int anchoSPrites;
	final private int altoSprites;
	
	final private Sprite[] sprites;
	
	public HojaSprites(final String ruta, final int spriteSizeAlto,final int spriteSizeAncho, final boolean opaco) {
		final BufferedImage imagen;
		
		if (opaco) {
			imagen = CargadorRecursos.cargarImagenCompatible(ruta);
		}
		else {
			imagen = CargadorRecursos.cargarImagenCompatibleTraslucida(ruta);
		}
		
		anchoHojaPixeles = imagen.getWidth();
		altoHojaPixeles = imagen.getHeight();
		
		anchoHojaENSprites = anchoHojaPixeles / spriteSizeAncho;
		altoHojaENSprites = altoHojaPixeles / spriteSizeAlto;
		
		this.anchoSPrites = spriteSizeAncho;
		this.altoSprites = spriteSizeAlto;
		
		sprites = new Sprite[anchoHojaENSprites * altoHojaENSprites];
		
		extraerSpritesDesdeImagen(imagen);
	}
	
	private void extraerSpritesDesdeImagen(final BufferedImage imagen) {
		for (int y =0; y < altoHojaENSprites; y++) {
			for (int x = 0 ; x <anchoHojaENSprites; x++) {
				final int posX = x * anchoSPrites;
				final int posY = y * altoSprites;
				sprites[x + y * anchoHojaENSprites] = new Sprite(imagen.getSubimage(posX, posY, anchoSPrites, altoSprites));
			}
		}
	}
	
	public Sprite getSprite(final int indice) {
		return sprites[indice];
	}
	public Sprite getSprite(final int x , final int y) {
		return sprites[x + y * anchoHojaENSprites];
	}
}
