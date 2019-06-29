package principal.graficos;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 5979421777239930009L;
	private String titulo;
	
	private ImageIcon icono;
	
	public Ventana(final String titulo, final SuperficieDibujo sd) {
		this.titulo = titulo;
		
		configurarVentana(sd);
	}
	
	private void configurarVentana(SuperficieDibujo sd) {
		setTitle(titulo);
		//setIconImage(icono.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new BorderLayout());
		add(sd, BorderLayout.CENTER);
		//setUndecorated(true);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
}
