package principal.entes;

public class JugadorServidor extends Jugador{

	private int AC_pts;
	private int BD_pts;
	private String inicioTrama = "011111111110";
	private String finalTrama = "011111111110";
	private String codigoA = "001";
	private String codigoB = "010";
	private String codigoC = "011";
	private String codigoD = "100";
	
	public JugadorServidor(String nombreJugador, String estacionJugador) {
		super(nombreJugador, estacionJugador);
	}
	@Override
	public String crearTramaParaRepartirCarta(Carta carta,Carta carta2,Carta carta3,Carta vira,String destino) {
		String texto = inicioTrama;
		System.out.println("Lo manda desde aqui");
		texto = texto + "01";
		texto = texto + codigoA;
		texto = texto + destino;
		texto = texto + carta.getValorTrama();
		texto = texto + carta.getTipoTrama();
		
		texto = texto + carta2.getValorTrama();
		texto = texto + carta2.getTipoTrama();
		
		texto = texto + carta3.getValorTrama();
		texto = texto + carta3.getTipoTrama();
		
		texto = texto + vira.getValorTrama();
		System.out.println(vira.getValorTrama());
		texto = texto + vira.getTipoTrama();
		System.out.println(vira.getTipoTrama());
		
		
		texto = texto + finalTrama;
		System.out.println(texto);
		
		return texto;		
	}
	@Override
	public String crearTramaParaRepartirCarta() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void verificarMensaje(String mensaje) {
		// TODO Auto-generated method stub
		
	}
}
