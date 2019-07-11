package principal.entes;

import java.util.ArrayList;

import principal.maquinaEstados.estados.juego.GestorJuego;
import principal.maquinaEstados.estados.juego.GestorReparteCartas;

public class JugadorSimple extends Jugador{
	private String inicioTrama = "011111111110";
	private String finalTrama = "011111111110";
	private String codigo;
	
	public JugadorSimple(String nombreJugador, String estacionJugador,String codigo) {
		super(nombreJugador, estacionJugador);
		this.codigo = codigo;
	}

	@Override
	public String crearTramaParaRepartirCarta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verificarMensaje(String mensaje) {
		// TODO Auto-generated method stub
		boolean reenvio = false;
		System.out.println(mensaje.length());
		System.out.println("Mensaje recibido: "+ mensaje);
		String lectura = mensaje.substring(0, 12);
		System.out.println("Inicio de trama:  "+lectura);
		if (lectura.equals(inicioTrama)) {
			lectura = mensaje.substring(12, 14);
			System.out.println("Tpo de trama: "+lectura);
			if (lectura.equals("01")) {
				reenvio = tipoTrama01(mensaje);
			}
		}
		return reenvio;
	}
	public boolean tipoTrama01(String mensaje) {
		boolean reenvio = false;
		String lectura = mensaje.substring(14, 17);
		System.out.println("Emisor: "+ lectura);
		if (lectura.equals("001")) {
			lectura = mensaje.substring(17, 20);
			System.out.println("Receptor: "+lectura);
			if (lectura.equals(codigo)) {
				ArrayList<Carta> cartas = new ArrayList<Carta>();
				cartas.add(buscarCarta(mensaje.substring(20,24),mensaje.substring(24,26)));
				cartas.add(buscarCarta(mensaje.substring(26,30),mensaje.substring(30,32)));
				cartas.add(buscarCarta(mensaje.substring(32,36),mensaje.substring(36,38)));
				cartas.add(buscarCarta(mensaje.substring(38,42),mensaje.substring(42,44)));
				GestorJuego.lista = cartas;
				System.out.println("Trama final: "+ mensaje.substring(44, 56));
			}
			else {
				System.out.println("No es pa ti rotalo");
				reenvio = true;
				}
		}
		return reenvio;
	}
	public Carta buscarCarta(String numero,String pinta) {
		Carta carta = null;
		for(Carta c: GestorReparteCartas.mazoCartas) {
			if (  (c.getValorTrama().equals(numero)) && (c.getTipoTrama().equals(pinta)) ) {
				System.out.println(c.getTIPO()+","+c.getVALOR());
				carta = c;
			}
		}
		return carta;
	}

}
