package principal.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import principal.graficos.Ventana;

public class ControlAcciones implements ActionListener {
	Ventana ventana;
	
	public ControlAcciones(Ventana ventana) {
		this.ventana = ventana;
		
		//Botones de Carta
		this.ventana.BOTON_CARTA_CENTRO.addActionListener(this);
		this.ventana.BOTON_CARTA_DERECHA.addActionListener(this);
		this.ventana.BOTON_CARTA_IZQUIERDA.addActionListener(this);
		//Botones de Carta
		
		//Botones de Accion
		//Botones de Accion
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (ventana.BOTON_CARTA_CENTRO == e.getSource()) {
			System.out.println("CENTRO");
			System.out.println(this.ventana.BOTON_CARTA_CENTRO.getIcon());
		}
		if (ventana.BOTON_CARTA_DERECHA == e.getSource()) {
			System.out.println("DERECHA");
			System.out.println(this.ventana.BOTON_CARTA_DERECHA.getIcon());
		}
		if (ventana.BOTON_CARTA_IZQUIERDA == e.getSource()) {
			System.out.println("IZQUIERDA");
			System.out.println(this.ventana.BOTON_CARTA_IZQUIERDA.getIcon());
		}
		
	}
	}
