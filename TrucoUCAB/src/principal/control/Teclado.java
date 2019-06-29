package principal.control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Teclado implements KeyListener{
	
	private final static int NUMEROTECLAS = 256;
	private final boolean[] teclas = new boolean[NUMEROTECLAS];
	
	private boolean w;
	private boolean a;
	private boolean s;
	private boolean d;
	
	public void actualizar() {
		w = teclas[KeyEvent.VK_W];
		a = teclas[KeyEvent.VK_A];
		s = teclas[KeyEvent.VK_S];
		d = teclas[KeyEvent.VK_D];		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		teclas[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		teclas[e.getKeyCode()] = false;
		
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	public boolean isW() {
		return w;
	}

	public void setW(boolean w) {
		this.w = w;
	}

	public boolean isA() {
		return a;
	}

	public void setA(boolean a) {
		this.a = a;
	}

	public boolean isS() {
		return s;
	}

	public void setS(boolean s) {
		this.s = s;
	}

	public boolean isD() {
		return d;
	}

	public void setD(boolean d) {
		this.d = d;
	}

}
