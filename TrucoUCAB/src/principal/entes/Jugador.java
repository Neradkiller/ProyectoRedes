package principal.entes;

public abstract class Jugador {

	private String nombreJugador;
	private String estacionJugador;
	
	public Jugador(String nombreJugador,String estacionJugador) {
		this.nombreJugador = nombreJugador;
		this.estacionJugador = estacionJugador;
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public String getEstacionJugador() {
		return estacionJugador;
	}

	public void setEstacionJugador(String estacionJugador) {
		this.estacionJugador = estacionJugador;
	}

	public abstract String crearTramaParaRepartirCarta();

	public String crearTramaParaRepartirCarta(Carta carta,Carta carta2,Carta carta3,Carta vira, String destino) {
		// TODO Auto-generated method stub
		return null;
	}
	public abstract boolean verificarMensaje(String mensaje);
}
