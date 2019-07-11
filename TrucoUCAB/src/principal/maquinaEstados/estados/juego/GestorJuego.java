package principal.maquinaEstados.estados.juego;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import principal.entes.Carta;
import principal.graficos.Ventana;
import principal.maquinaEstados.EstadoJuego;

public class GestorJuego implements EstadoJuego {
	public static ArrayList<Carta> lista;
	
	public GestorJuego() {
		lista = new ArrayList<Carta>();
	}
	
	
	@Override
	public void dibujar(Graphics g) {
		if (lista.size() >= 4) 
		{	
		BufferedImage imagen;
		imagen = lista.get(0).getImagen();
		ImageIcon img = new ImageIcon(imagen,lista.get(0).getTIPO()+","+lista.get(0).getVALOR());
		Ventana.BOTON_CARTA_CENTRO.setIcon(img);
		
		BufferedImage imagen1;
		imagen1 = lista.get(1).getImagen();
		ImageIcon img1 = new ImageIcon(imagen1,lista.get(1).getTIPO()+","+lista.get(1).getVALOR());
		Ventana.BOTON_CARTA_DERECHA.setIcon(img1);
		
		BufferedImage imagen2;
		imagen2 = lista.get(2).getImagen();
		ImageIcon img2 = new ImageIcon(imagen2,lista.get(2).getTIPO()+","+lista.get(2).getVALOR());
		Ventana.BOTON_CARTA_IZQUIERDA.setIcon(img2);
		
		BufferedImage imagen4;
		imagen4 = lista.get(3).getImagen();
		g.drawImage(imagen4, 257, 205, null);
		}
	}

	@Override
	public void actualizar() {
		
	}

} 
