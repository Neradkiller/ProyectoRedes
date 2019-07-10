package principal;

import principal.graficos.SuperficieDibujo;
import principal.graficos.Ventana;
import principal.maquinaEstados.GestorEstados;
import principal.maquinaEstados.estados.menuPrincipal.ControlMaestro;

public class GestorPrincipal {

	private boolean enFuncionamiento = false;
	private boolean primeraMano = true;
	
	private String titulo;
	private int alto;
	private int ancho;
	
	private SuperficieDibujo sd;
	private Ventana ventana;
	private MenuPrincipalPantalla pantalla;
	private GestorEstados ge;
	private ControlMaestro control;
	
	public GestorPrincipal(final String titulo, final int ancho, final int alto){
		this.titulo = titulo;
		this.ancho = ancho;
		this.alto = alto;
		this.iniciarBuclePrincipal();
	} 
	public static void main(String[] args) {
		GestorPrincipal gestor = new GestorPrincipal(Constantes.NOMBRE_JUEGO,Constantes.ANCHO_PANTALLA,Constantes.ALTO_PANTALLA);
		gestor.iniciarBuclePrincipal();
	}
	private void iniciarBuclePrincipal() {
		enFuncionamiento = true;
		inicializar();
	}
	private void inicializar() {
		sd = new SuperficieDibujo(ancho , alto);
		ventana = new Ventana(titulo, sd);
		pantalla = new MenuPrincipalPantalla();
		control = new ControlMaestro(pantalla,ventana);
		ge = new GestorEstados();
		iniciarJuego();
	}
	private void iniciarJuego() {
		
		int fps = 0;
		int aps = 0;
		
		final int NS_POR_SEGUNDO = 1000000000;
		final byte APS_OBJETIVO = 60;
		final double NS_POR_ACTUALIZACION = NS_POR_SEGUNDO / APS_OBJETIVO;
		
		long referencia_actualizacion = System.nanoTime();
		long referenciaContador = System.nanoTime();
		
		double tiempoTranscurrido;
		double delta = 0;	

		while(enFuncionamiento) {
		
		final long inicioBucle= System.nanoTime();
		
		tiempoTranscurrido = inicioBucle - referencia_actualizacion;
		referencia_actualizacion = inicioBucle;
		delta += tiempoTranscurrido / NS_POR_ACTUALIZACION;
		while (delta >= 1) {
			actualizar();
			aps++;
			delta --;
			}
		dibujar();
		fps++;
		
		if (System.nanoTime() - referenciaContador > NS_POR_SEGUNDO) {	
			ventana.setTitle(titulo + "|| APS: "+ aps+" || FPS: "+ fps);
			fps = 0; aps= 0;
			referenciaContador = System.nanoTime();
			}
			
		}
		
	}
	private void dibujar() {
		sd.dibujar(ge);
	}
	private void actualizar() {
		if (primeraMano) {
			ge.actualizar();
			primeraMano = false;
			ge.cambiarEstadoActual(1);}
		ge.actualizar();
		sd.actualizar();
		
	}

}
