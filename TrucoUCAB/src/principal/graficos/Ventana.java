package principal.graficos;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import principal.Constantes;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 5979421777239930009L;
	private String titulo;
	
	//Botones de carta
	public static final JButton BOTON_CARTA_CENTRO = new JButton();
	public static final JButton BOTON_CARTA_DERECHA = new JButton();
	public static final JButton BOTON_CARTA_IZQUIERDA = new JButton();
	//Botones de cartas
	
	
	//Botones de Jugada
	
	//Botones de Jugada
	
	public Ventana(final String titulo, final SuperficieDibujo sd) {
		this.titulo = titulo;
		
		BOTON_CARTA_CENTRO.setBounds(Constantes.ANCHO_PANTALLA/2, Constantes.ALTO_PANTALLA - Constantes.ALTO_CARTA - 20, Constantes.LADO_CARTA, Constantes.ALTO_CARTA);
		this.add(BOTON_CARTA_CENTRO);
		//BOTON_CARTA_CENTRO.setEnabled(false);
		
		BOTON_CARTA_DERECHA.setBounds(Constantes.ANCHO_PANTALLA/2 + Constantes.LADO_CARTA + 15, Constantes.ALTO_PANTALLA - Constantes.ALTO_CARTA - 20, Constantes.LADO_CARTA, Constantes.ALTO_CARTA);
		this.add(BOTON_CARTA_DERECHA);
		//BOTON_CARTA_DERECHA.setEnabled(false);
		
		BOTON_CARTA_IZQUIERDA.setBounds(Constantes.ANCHO_PANTALLA/2 - Constantes.LADO_CARTA - 15, Constantes.ALTO_PANTALLA - Constantes.ALTO_CARTA - 20, Constantes.LADO_CARTA, Constantes.ALTO_CARTA);
		this.add(BOTON_CARTA_IZQUIERDA);
		//BOTON_CARTA_IZQUIERDA.setEnabled(false);
		
		
		
		configurarVentana(sd);
	}
	
	private void configurarVentana(SuperficieDibujo sd) {
		setTitle(titulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new BorderLayout());
		add(sd, BorderLayout.CENTER);
		setUndecorated(true);
		pack();
		setLocationRelativeTo(null);
		setVisible(false);
		
	}
}
