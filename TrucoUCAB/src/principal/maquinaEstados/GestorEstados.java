package principal.maquinaEstados;

import java.awt.Graphics;

import principal.maquinaEstados.estados.juego.GestorJuego;
import principal.maquinaEstados.estados.juego.GestorReparteCartas;

public class GestorEstados {

	private EstadoJuego[] estados;
	private EstadoJuego estadoActual;
	
	public GestorEstados() {
		iniciarEstados();
		iniciarEstadoActual();
	}

	private void iniciarEstadoActual() {
		estadoActual = estados[0];
		
	}

	private void iniciarEstados() {
		estados = new EstadoJuego[2];
		estados[0] = new GestorReparteCartas();
		estados[1] = new GestorJuego();
	}
	
	public void actualizar() {
		estadoActual.actualizar();
	}
	public void dibujar(final Graphics g) {
		estadoActual.dibujar(g);
	}
	
	public void cambiarEstadoActual(final int nuevoEstado) {
		estadoActual = estados[nuevoEstado];		
	}
	public EstadoJuego saberEstadoActual() {
		return estadoActual;
	}
}
