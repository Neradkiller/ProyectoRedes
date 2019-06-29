package principal.mapas;

import principal.herramientas.CargadorRecursos;
import principal.sprites.Sprite;

public class Mapa {
	private String contenido;
	
	private int ancho;
	private int alto;
	
	private Sprite[] sprites;

	public Mapa(final String ruta) {
		
		this.contenido = CargadorRecursos.leerArchivosTexto(ruta);
		
		String[] partes = contenido.split("\\*");
		
		ancho = Integer.parseInt(partes[0]);
		alto = Integer.parseInt(partes[1]);
		
		
	}
}
