package principal.maquinaEstados.estados.menuPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import principal.MenuPrincipalPantalla;
import principal.entes.Carta;
import principal.entes.Jugador;
import principal.entes.JugadorServidor;
import principal.entes.JugadorSimple;
import principal.graficos.Ventana;
import principal.maquinaEstados.estados.juego.GestorJuego;
import principal.maquinaEstados.estados.juego.GestorReparteCartas;
import principal.redes.ListaPuertos;
import principal.redes.Puerto;

public class ControlMaestro implements ActionListener{
	public static MenuPrincipalPantalla pantalla;
	public static Ventana ventana;
	public static Jugador jugador;
	public static Puerto puerto;
	
	
	@SuppressWarnings("unchecked")
	public ControlMaestro(MenuPrincipalPantalla pantalla,Ventana ventana) {
		this.pantalla = pantalla;
		this.ventana = ventana;
		
		ListaPuertos puertos = new ListaPuertos();
		String[] portNames = puertos.puertos();
		for(int i = 0; i < portNames.length; i++){
			pantalla.getListaPuertos().addItem(portNames[i]);
	    	}
		
		this.pantalla.getBotonEnviar().addActionListener(this);
		this.pantalla.getEnviarMensaje().addActionListener(this);
		this.pantalla.getIniciarJuego().addActionListener(this);
		
		//Botones de Carta
		this.ventana.BOTON_CARTA_CENTRO.addActionListener(this);
		this.ventana.BOTON_CARTA_DERECHA.addActionListener(this);
		this.ventana.BOTON_CARTA_IZQUIERDA.addActionListener(this);
		//Botones de Carta
				
		//Botones de Accion
		//Botones de Accion
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (pantalla.getBotonEnviar() == e.getSource()) {
			puerto = new Puerto((String) this.pantalla.getListaPuertos().getSelectedItem());
			pantalla.getBotonEnviar().setEnabled(false);
		}
		else if (pantalla.getEnviarMensaje() == e.getSource()) {
			puerto.enviarMensaje(this.pantalla.getMensajePrueba().getText());
		}
		else if (pantalla.getIniciarJuego() == e.getSource()) {
			this.ventana.setVisible(true);
			if (this.pantalla.getListaEstacion().getSelectedItem() == "A") {
	
				jugador = new JugadorServidor(pantalla.getNombreEdit().getText(),"A");
				Carta vira = GestorReparteCartas.vira;
				GestorJuego.lista = GestorReparteCartas.manoJugadorA;
				
				GestorJuego.lista.add(vira);
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				puerto.enviarMensaje(jugador.crearTramaParaRepartirCarta(GestorReparteCartas.manoJugadorB.get(0),GestorReparteCartas.manoJugadorB.get(1),GestorReparteCartas.manoJugadorB.get(2),vira,"010"));
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				puerto.enviarMensaje(jugador.crearTramaParaRepartirCarta(GestorReparteCartas.manoJugadorC.get(0),GestorReparteCartas.manoJugadorC.get(1),GestorReparteCartas.manoJugadorC.get(2),vira,"011"));
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				puerto.enviarMensaje(jugador.crearTramaParaRepartirCarta(GestorReparteCartas.manoJugadorD.get(0),GestorReparteCartas.manoJugadorD.get(1),GestorReparteCartas.manoJugadorD.get(2),vira,"100"));
			}
			else {
				if (this.pantalla.getListaEstacion().getSelectedItem() == "B") {
					jugador = new JugadorSimple(pantalla.getNombreEdit().getText(),"B","010");
				}
				if (this.pantalla.getListaEstacion().getSelectedItem() == "C") {
					jugador = new JugadorSimple(pantalla.getNombreEdit().getText(),"C","011");
				}
				if (this.pantalla.getListaEstacion().getSelectedItem() == "D") {
					jugador = new JugadorSimple(pantalla.getNombreEdit().getText(),"D","100");
				}
	
			}
			//GestorPrincipal gestor = new GestorPrincipal(Constantes.NOMBRE_JUEGO,Constantes.ANCHO_PANTALLA,Constantes.ALTO_PANTALLA);
		}
		else if (ventana.BOTON_CARTA_CENTRO == e.getSource()) {
			System.out.println("CENTRO");
			System.out.println(this.ventana.BOTON_CARTA_CENTRO.getIcon());
		}
		else if (ventana.BOTON_CARTA_DERECHA == e.getSource()) {
			System.out.println("DERECHA");
			System.out.println(this.ventana.BOTON_CARTA_DERECHA.getIcon());
		}
		else if (ventana.BOTON_CARTA_IZQUIERDA == e.getSource()) {
			System.out.println("IZQUIERDA");
			System.out.println(this.ventana.BOTON_CARTA_IZQUIERDA.getIcon());
		}
		
	}


}
