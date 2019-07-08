package principal.maquinaEstados.estados.menuPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import principal.MenuPrincipalPantalla;
import principal.redes.ListaPuertos;
import principal.redes.Puerto;

public class MenuPrincipalControlador implements ActionListener{
	public static MenuPrincipalPantalla pantalla;
	Puerto puerto;
	
	
	public MenuPrincipalControlador(MenuPrincipalPantalla pantalla) {
		this.pantalla = pantalla;
		ListaPuertos puertos = new ListaPuertos();
		String[] portNames = puertos.puertos();
		for(int i = 0; i < portNames.length; i++){
			this.pantalla.getListaPuertos().addItem(portNames[i]);
	    	}
		this.pantalla.getBotonEnviar().addActionListener(this);
		this.pantalla.getEnviarMensaje().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (pantalla.getBotonEnviar() == e.getSource()) {
			puerto = new Puerto((String) this.pantalla.getListaPuertos().getSelectedItem());
			pantalla.getBotonEnviar().setEnabled(false);
		}
		else if (pantalla.getEnviarMensaje() == e.getSource()) {
			puerto.enviarMensaje(this.pantalla.getMensajePrueba().getText());
		}
		
	}


}
