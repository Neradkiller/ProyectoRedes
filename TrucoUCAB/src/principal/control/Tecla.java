package principal.control;

public class Tecla {

	private boolean pulsada = false;
	private long ultima_pulsacion = System.nanoTime();
	
	public void teclaPulsada() {
		pulsada = true;
		ultima_pulsacion = System.nanoTime();
	}
	
	public void teclaLiberada() {
		pulsada = false;
	}

	public boolean isPulsada() {
		return pulsada;
	}

	public void setPulsada(boolean pulsada) {
		this.pulsada = pulsada;
	}

	public long getUltima_pulsacion() {
		return ultima_pulsacion;
	}

	public void setUltima_pulsacion(long ultima_pulsacion) {
		this.ultima_pulsacion = ultima_pulsacion;
	}
}


