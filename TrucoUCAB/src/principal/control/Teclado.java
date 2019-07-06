package principal.control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Teclado implements KeyListener{
	public Tecla teclaArriba = new Tecla();
	public Tecla teclaAbajo = new Tecla();
	public Tecla teclaIzquierda = new Tecla();
	public Tecla teclaDerecha = new Tecla();
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_W:
			teclaArriba.teclaPulsada();
			break;
		case KeyEvent.VK_S:
			teclaAbajo.teclaPulsada();
			break;
		case KeyEvent.VK_A:
			teclaIzquierda.teclaPulsada();
			break;
		case KeyEvent.VK_D:
			teclaDerecha.teclaPulsada();
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_W:
			teclaArriba.teclaLiberada();
			break;
		case KeyEvent.VK_S:
			teclaAbajo.teclaLiberada();
			break;
		case KeyEvent.VK_A:
			teclaIzquierda.teclaLiberada();
			break;
		case KeyEvent.VK_D:
			teclaDerecha.teclaLiberada();
			break;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
	
		
	}
	
}
