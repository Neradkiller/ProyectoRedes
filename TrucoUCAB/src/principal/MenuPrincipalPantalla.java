package principal;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MenuPrincipalPantalla {

	private JFrame vista;
	private JTextField nombreEdit;
	private JTextField mensajePrueba;
	private JButton botonEnviar;
	JButton enviarMensaje;
	private JTextField mensajeRecibido;
	private JComboBox listaPuertos;
	private JButton iniciarJuego;
	private JComboBox listaEstacion;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public MenuPrincipalPantalla() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		vista = new JFrame();
		vista.setBounds(100, 100, 837, 485);
		vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vista.getContentPane().setLayout(null);
		vista.setTitle("TrucoUCAB");
		
		JLabel label1 = new JLabel("Seleccione su estacion:");
		label1.setBounds(44, 56, 136, 32);
		vista.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("Seleccione un puerto:");
		label2.setBounds(44, 137, 136, 32);
		vista.getContentPane().add(label2);
		
		JLabel label3 = new JLabel("Indique su nombre:");
		label3.setBounds(44, 220, 136, 32);
		vista.getContentPane().add(label3);
		
		nombreEdit = new JTextField();
		nombreEdit.setBounds(190, 223, 262, 26);
		vista.getContentPane().add(nombreEdit);
		nombreEdit.setColumns(10);
		
		listaPuertos = new JComboBox();
		listaPuertos.setBounds(190, 143, 262, 20);
		vista.getContentPane().add(listaPuertos);
		
		listaEstacion = new JComboBox();
		listaEstacion.setBounds(190, 62, 262, 20);
		listaEstacion.addItem("A");
		listaEstacion.addItem("B");
		listaEstacion.addItem("C");
		listaEstacion.addItem("D");
		vista.getContentPane().add(listaEstacion);
		
		mensajePrueba = new JTextField();
		mensajePrueba.setBounds(190, 343, 262, 20);
		vista.getContentPane().add(mensajePrueba);
		mensajePrueba.setColumns(10);
		
		botonEnviar = new JButton("Habilitar Puerto");
		botonEnviar.setBounds(591, 142, 178, 23);
		vista.getContentPane().add(botonEnviar);
		
		mensajeRecibido = new JTextField();
		mensajeRecibido.setEditable(false);
		mensajeRecibido.setBounds(190, 374, 262, 20);
		vista.getContentPane().add(mensajeRecibido);
		mensajeRecibido.setColumns(10);
		
		enviarMensaje = new JButton("Enviar Mensaje");
		enviarMensaje.setBounds(591, 360, 178, 23);
		vista.getContentPane().add(enviarMensaje);
		
		iniciarJuego = new JButton("Iniciar Juego");
		iniciarJuego.setBounds(591, 412, 178, 23);
		vista.getContentPane().add(iniciarJuego);
		vista.setVisible(true);
	}
	public JFrame getVista() {
		return vista;
	}
	public void setVista(JFrame vista) {
		this.vista = vista;
	}
	public JTextField getNombreEdit() {
		return nombreEdit;
	}
	public void setNombreEdit(JTextField nombreEdit) {
		this.nombreEdit = nombreEdit;
	}
	public JTextField getMensajePrueba() {
		return mensajePrueba;
	}
	public void setMensajePrueba(JTextField mensajePrueba) {
		this.mensajePrueba = mensajePrueba;
	}
	public JButton getBotonEnviar() {
		return botonEnviar;
	}
	public void setBotonEnviar(JButton botonEnviar) {
		this.botonEnviar = botonEnviar;
	}
	public JTextField getMensajeRecibido() {
		return mensajeRecibido;
	}
	public void setMensajeRecibido(JTextField mensajeRecibido) {
		this.mensajeRecibido = mensajeRecibido;
	}
	public JComboBox getListaPuertos() {
		return listaPuertos;
	}
	public void setListaPuertos(JComboBox listaPuertos) {
		this.listaPuertos = listaPuertos;
	}
	public JButton getEnviarMensaje() {
		return enviarMensaje;
	}
	public void setEnviarMensaje(JButton enviarMensaje) {
		this.enviarMensaje = enviarMensaje;
	}
	public JButton getIniciarJuego() {
		return iniciarJuego;
	}
	public void setIniciarJuego(JButton iniciarJuego) {
		this.iniciarJuego = iniciarJuego;
	}
	public JComboBox getListaEstacion() {
		return listaEstacion;
	}
	public void setListaEstacion(JComboBox listaEstacion) {
		this.listaEstacion = listaEstacion;
	}
}
