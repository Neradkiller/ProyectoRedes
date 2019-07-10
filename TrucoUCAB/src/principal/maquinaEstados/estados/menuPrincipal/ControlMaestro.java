package principal.maquinaEstados.estados.menuPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import principal.MenuPrincipalPantalla;
import principal.entes.Jugador;
import principal.graficos.Ventana;
import principal.redes.ListaPuertos;
import principal.redes.Puerto;

public class ControlMaestro implements ActionListener{
	public static MenuPrincipalPantalla pantalla;
	public static Ventana ventana;
	private Jugador jugador;
	Puerto puerto;
	
	
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
				System.out.println("Comienza");
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
