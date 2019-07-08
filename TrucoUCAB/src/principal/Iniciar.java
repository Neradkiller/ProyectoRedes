package principal;

import principal.maquinaEstados.estados.menuPrincipal.MenuPrincipalControlador;

public class Iniciar {

	public static void main(String[] args) {

		MenuPrincipalPantalla window = new MenuPrincipalPantalla();
		MenuPrincipalControlador control = new MenuPrincipalControlador(window);

	}

}
