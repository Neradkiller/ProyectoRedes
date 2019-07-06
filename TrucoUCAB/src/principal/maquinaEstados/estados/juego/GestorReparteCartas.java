package principal.maquinaEstados.estados.juego;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import principal.Constantes;
import principal.entes.Carta;
import principal.graficos.Ventana;
import principal.maquinaEstados.EstadoJuego;
import principal.sprites.HojaSprites;

public class GestorReparteCartas implements EstadoJuego {

	public static ArrayList<Carta> mazoCartas = new ArrayList<Carta>();
	private static final HojaSprites sprites = new HojaSprites(Constantes.RUTA_CARTAS, Constantes.ALTO_CARTA, Constantes.LADO_CARTA, false);
	
	public GestorReparteCartas() {
		
		mazoCartas.add(new Carta( "1", "Basto", true, sprites.getSprite(0, 0).getImagen()));
		mazoCartas.add(new Carta( "2", "Basto", true, sprites.getSprite(1, 0).getImagen()));
		mazoCartas.add(new Carta( "3", "Basto", true, sprites.getSprite(2, 0).getImagen()));
		mazoCartas.add(new Carta( "4", "Basto", true, sprites.getSprite(3, 0).getImagen()));
		mazoCartas.add(new Carta( "5", "Basto", true, sprites.getSprite(4, 0).getImagen()));
		mazoCartas.add(new Carta( "6", "Basto", true, sprites.getSprite(5, 0).getImagen()));
		mazoCartas.add(new Carta( "7", "Basto", true, sprites.getSprite(6, 0).getImagen()));
		mazoCartas.add(new Carta( "10", "Basto", true, sprites.getSprite(7, 0).getImagen()));
		mazoCartas.add(new Carta( "11", "Basto", true, sprites.getSprite(8, 0).getImagen()));
		mazoCartas.add(new Carta( "12", "Basto", true, sprites.getSprite(9, 0).getImagen()));
		
		mazoCartas.add(new Carta( "1", "Copa", true, sprites.getSprite(0, 1).getImagen()));
		mazoCartas.add(new Carta( "2", "Copa", true, sprites.getSprite(1, 1).getImagen()));
		mazoCartas.add(new Carta( "3", "Copa", true, sprites.getSprite(2, 1).getImagen()));
		mazoCartas.add(new Carta( "4", "Copa", true, sprites.getSprite(3, 1).getImagen()));
		mazoCartas.add(new Carta( "5", "Copa", true, sprites.getSprite(4, 1).getImagen()));
		mazoCartas.add(new Carta( "6", "Copa", true, sprites.getSprite(5, 1).getImagen()));
		mazoCartas.add(new Carta( "7", "Copa", true, sprites.getSprite(6, 1).getImagen()));
		mazoCartas.add(new Carta( "10", "Copa", true, sprites.getSprite(7, 1).getImagen()));
		mazoCartas.add(new Carta( "11", "Copa", true, sprites.getSprite(8, 1).getImagen()));
		mazoCartas.add(new Carta( "12", "Copa", true, sprites.getSprite(9, 1).getImagen()));
		
		mazoCartas.add(new Carta( "1", "Espada", true, sprites.getSprite(0, 2).getImagen()));
		mazoCartas.add(new Carta( "2", "Espada", true, sprites.getSprite(1, 2).getImagen()));
		mazoCartas.add(new Carta( "3", "Espada", true, sprites.getSprite(2, 2).getImagen()));
		mazoCartas.add(new Carta( "4", "Espada", true, sprites.getSprite(3, 2).getImagen()));
		mazoCartas.add(new Carta( "5", "Espada", true, sprites.getSprite(4, 2).getImagen()));
		mazoCartas.add(new Carta( "6", "Espada", true, sprites.getSprite(5, 2).getImagen()));
		mazoCartas.add(new Carta( "7", "Espada", true, sprites.getSprite(6, 2).getImagen()));
		mazoCartas.add(new Carta( "10", "Espada", true, sprites.getSprite(7, 2).getImagen()));
		mazoCartas.add(new Carta( "11", "Espada", true, sprites.getSprite(8, 2).getImagen()));
		mazoCartas.add(new Carta( "12", "Espada", true, sprites.getSprite(9, 2).getImagen()));
		
		mazoCartas.add(new Carta( "1", "Oro", true, sprites.getSprite(0, 3).getImagen()));
		mazoCartas.add(new Carta( "2", "Oro", true, sprites.getSprite(1, 3).getImagen()));
		mazoCartas.add(new Carta( "3", "Oro", true, sprites.getSprite(2, 3).getImagen()));
		mazoCartas.add(new Carta( "4", "Oro", true, sprites.getSprite(3, 3).getImagen()));
		mazoCartas.add(new Carta( "5", "Oro", true, sprites.getSprite(4, 3).getImagen()));
		mazoCartas.add(new Carta( "6", "Oro", true, sprites.getSprite(5, 3).getImagen()));
		mazoCartas.add(new Carta( "7", "Oro", true, sprites.getSprite(6, 3).getImagen()));
		mazoCartas.add(new Carta( "10", "Oro", true, sprites.getSprite(7, 3).getImagen()));
		mazoCartas.add(new Carta( "11", "Oro", true, sprites.getSprite(8, 3).getImagen()));
		mazoCartas.add(new Carta( "12", "Oro", true, sprites.getSprite(9, 3).getImagen()));
		
	}
	@Override
	public void actualizar() {
	}

	@Override
	public void dibujar(Graphics g) {
		
		int i;
		i = this.seleccionarCarta();
		BufferedImage imagen;
		imagen = mazoCartas.get(i).getImagen();
		ImageIcon img = new ImageIcon(imagen,mazoCartas.get(i).getTIPO()+","+mazoCartas.get(i).getVALOR());
		Ventana.BOTON_CARTA_CENTRO.setIcon(img);
		
		i = this.seleccionarCarta();
		BufferedImage imagen1;
		imagen1 = mazoCartas.get(i).getImagen();
		ImageIcon img1 = new ImageIcon(imagen1,mazoCartas.get(i).getTIPO()+","+mazoCartas.get(i).getVALOR());
		Ventana.BOTON_CARTA_DERECHA.setIcon(img1);
		
		i = this.seleccionarCarta();
		BufferedImage imagen2;
		imagen2 = mazoCartas.get(i).getImagen();
		ImageIcon img2 = new ImageIcon(imagen2,mazoCartas.get(i).getTIPO()+","+mazoCartas.get(i).getVALOR());
		Ventana.BOTON_CARTA_IZQUIERDA.setIcon(img2);
	}
	
	public int seleccionarCarta() {
		int valor = (int) (Math.random() * 39);
		return valor;
	}

}
