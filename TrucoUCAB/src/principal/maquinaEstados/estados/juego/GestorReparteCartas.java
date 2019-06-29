package principal.maquinaEstados.estados.juego;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import principal.entes.Carta;
import principal.maquinaEstados.EstadoJuego;
import principal.sprites.HojaSprites;

public class GestorReparteCartas implements EstadoJuego {

	public static ArrayList<Carta> mazoCartas = new ArrayList<Carta>();
	private static final HojaSprites sprites = new HojaSprites("/Assets/cartas/naipes2.png", 96, 72, false);
	
	public GestorReparteCartas() {
		mazoCartas.add(new Carta( 1, "Basto", true, sprites.getSprite(0, 0).getImagen()));
		mazoCartas.add(new Carta( 2, "Basto", true, sprites.getSprite(1, 0).getImagen()));
	}
	@Override
	public void actualizar() {
	}

	@Override
	public void dibujar(Graphics g) {
		System.out.println("hi boi");
		BufferedImage imagen;
		imagen = mazoCartas.get(1).getImagen();
		g.drawImage(imagen, 0, 0, 72, 96, null);
		
		
	}

}
