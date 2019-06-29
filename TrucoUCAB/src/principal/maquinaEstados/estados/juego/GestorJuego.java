package principal.maquinaEstados.estados.juego;

import java.awt.Graphics;
import java.util.ArrayList;

import principal.entes.Carta;
import principal.maquinaEstados.EstadoJuego;

public class GestorJuego implements EstadoJuego {
	
	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	
	@Override
	public void dibujar(Graphics g) {
		//carta.dibujar(g);
	}

	@Override
	public void actualizar() {
		
	}

} 
