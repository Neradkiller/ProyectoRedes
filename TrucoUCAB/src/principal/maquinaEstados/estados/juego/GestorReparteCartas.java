package principal.maquinaEstados.estados.juego;

import java.awt.Graphics;
import java.util.ArrayList;

import principal.Constantes;
import principal.entes.Carta;
import principal.maquinaEstados.EstadoJuego;
import principal.sprites.HojaSprites;

public class GestorReparteCartas implements EstadoJuego {

	public static ArrayList<Carta> mazoCartas = new ArrayList<Carta>();
	private static final HojaSprites sprites = new HojaSprites(Constantes.RUTA_CARTAS, Constantes.ALTO_CARTA, Constantes.LADO_CARTA, false);
	
	public static ArrayList<Carta> manoJugador1 = new ArrayList<Carta>();
	
	public GestorReparteCartas() {
		
		mazoCartas.add(new Carta( "1", "Basto","","10", true, sprites.getSprite(0, 0).getImagen()));
		mazoCartas.add(new Carta( "2", "Basto","","10", true, sprites.getSprite(1, 0).getImagen()));
		mazoCartas.add(new Carta( "3", "Basto","","10", true, sprites.getSprite(2, 0).getImagen()));
		mazoCartas.add(new Carta( "4", "Basto","0000","10", true, sprites.getSprite(3, 0).getImagen()));
		mazoCartas.add(new Carta( "5", "Basto","0001","10", true, sprites.getSprite(4, 0).getImagen()));
		mazoCartas.add(new Carta( "6", "Basto","0010","10", true, sprites.getSprite(5, 0).getImagen()));
		mazoCartas.add(new Carta( "7", "Basto","0011","10", true, sprites.getSprite(6, 0).getImagen()));
		mazoCartas.add(new Carta( "10", "Basto","0100","10", true, sprites.getSprite(7, 0).getImagen()));
		mazoCartas.add(new Carta( "11", "Basto","0101","10", true, sprites.getSprite(8, 0).getImagen()));
		mazoCartas.add(new Carta( "12", "Basto","0110","10", true, sprites.getSprite(9, 0).getImagen()));
		
		mazoCartas.add(new Carta( "1", "Copa","","00", true, sprites.getSprite(0, 1).getImagen()));
		mazoCartas.add(new Carta( "2", "Copa","","00", true, sprites.getSprite(1, 1).getImagen()));
		mazoCartas.add(new Carta( "3", "Copa","","00", true, sprites.getSprite(2, 1).getImagen()));
		mazoCartas.add(new Carta( "4", "Copa","0000","00", true, sprites.getSprite(3, 1).getImagen()));
		mazoCartas.add(new Carta( "5", "Copa","0001","00", true, sprites.getSprite(4, 1).getImagen()));
		mazoCartas.add(new Carta( "6", "Copa","0010","00", true, sprites.getSprite(5, 1).getImagen()));
		mazoCartas.add(new Carta( "7", "Copa","0011","00", true, sprites.getSprite(6, 1).getImagen()));
		mazoCartas.add(new Carta( "10", "Copa","0100","00", true, sprites.getSprite(7, 1).getImagen()));
		mazoCartas.add(new Carta( "11", "Copa","0101","00", true, sprites.getSprite(8, 1).getImagen()));
		mazoCartas.add(new Carta( "12", "Copa","0110","00", true, sprites.getSprite(9, 1).getImagen()));
		
		mazoCartas.add(new Carta( "1", "Espada","","11", true, sprites.getSprite(0, 2).getImagen()));
		mazoCartas.add(new Carta( "2", "Espada","","11", true, sprites.getSprite(1, 2).getImagen()));
		mazoCartas.add(new Carta( "3", "Espada","","11", true, sprites.getSprite(2, 2).getImagen()));
		mazoCartas.add(new Carta( "4", "Espada","0000","11", true, sprites.getSprite(3, 2).getImagen()));
		mazoCartas.add(new Carta( "5", "Espada","0001","11", true, sprites.getSprite(4, 2).getImagen()));
		mazoCartas.add(new Carta( "6", "Espada","0010","11", true, sprites.getSprite(5, 2).getImagen()));
		mazoCartas.add(new Carta( "7", "Espada","","11", true, sprites.getSprite(6, 2).getImagen()));
		mazoCartas.add(new Carta( "10", "Espada","0100","11", true, sprites.getSprite(7, 2).getImagen()));
		mazoCartas.add(new Carta( "11", "Espada","0101","11", true, sprites.getSprite(8, 2).getImagen()));
		mazoCartas.add(new Carta( "12", "Espada","0110","11", true, sprites.getSprite(9, 2).getImagen()));
		
		mazoCartas.add(new Carta( "1", "Oro","","01", true, sprites.getSprite(0, 3).getImagen()));
		mazoCartas.add(new Carta( "2", "Oro","","01", true, sprites.getSprite(1, 3).getImagen()));
		mazoCartas.add(new Carta( "3", "Oro","","01", true, sprites.getSprite(2, 3).getImagen()));
		mazoCartas.add(new Carta( "4", "Oro","0000","01", true, sprites.getSprite(3, 3).getImagen()));
		mazoCartas.add(new Carta( "5", "Oro","0001","01", true, sprites.getSprite(4, 3).getImagen()));
		mazoCartas.add(new Carta( "6", "Oro","0010","01", true, sprites.getSprite(5, 3).getImagen()));
		mazoCartas.add(new Carta( "7", "Oro","","01", true, sprites.getSprite(6, 3).getImagen()));
		mazoCartas.add(new Carta( "10", "Oro","0100","01", true, sprites.getSprite(7, 3).getImagen()));
		mazoCartas.add(new Carta( "11", "Oro","0101","01", true, sprites.getSprite(8, 3).getImagen()));
		mazoCartas.add(new Carta( "12", "Oro","0110","01", true, sprites.getSprite(9, 3).getImagen()));
		
	}
	@Override
	public void actualizar() {
		int i;
		i = this.seleccionarCarta();
		manoJugador1.add(mazoCartas.get(i));
		i = this.seleccionarCarta();
		manoJugador1.add(mazoCartas.get(i));
		i = this.seleccionarCarta();
		manoJugador1.add(mazoCartas.get(i));
	}

	@Override
	public void dibujar(Graphics g) {
		
	}
	
	public int seleccionarCarta() {
		int valor = (int) (Math.random() * 39);
		return valor;
	}
	public ArrayList<Carta> getManoJugador1() {
		return manoJugador1;
	}
	public void setManoJugador1(ArrayList<Carta> manoJugador1) {
		this.manoJugador1 = manoJugador1;
	}

}
