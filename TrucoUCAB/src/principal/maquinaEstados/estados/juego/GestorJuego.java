package principal.maquinaEstados.estados.juego;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

import principal.graficos.Ventana;
import principal.maquinaEstados.EstadoJuego;

public class GestorJuego implements EstadoJuego {
	
	
	@Override
	public void dibujar(Graphics g) {

		BufferedImage imagen;
		imagen = GestorReparteCartas.manoJugador1.get(0).getImagen();
		ImageIcon img = new ImageIcon(imagen,GestorReparteCartas.manoJugador1.get(0).getTIPO()+","+GestorReparteCartas.manoJugador1.get(0).getVALOR());
		Ventana.BOTON_CARTA_CENTRO.setIcon(img);
		
		BufferedImage imagen1;
		imagen1 = GestorReparteCartas.manoJugador1.get(1).getImagen();
		ImageIcon img1 = new ImageIcon(imagen1,GestorReparteCartas.manoJugador1.get(1).getTIPO()+","+GestorReparteCartas.manoJugador1.get(1).getVALOR());
		Ventana.BOTON_CARTA_DERECHA.setIcon(img1);
		
		BufferedImage imagen2;
		imagen2 = GestorReparteCartas.manoJugador1.get(2).getImagen();
		ImageIcon img2 = new ImageIcon(imagen2,GestorReparteCartas.manoJugador1.get(2).getTIPO()+","+GestorReparteCartas.manoJugador1.get(2).getVALOR());
		Ventana.BOTON_CARTA_IZQUIERDA.setIcon(img2);
	}

	@Override
	public void actualizar() {
		
	}

} 
