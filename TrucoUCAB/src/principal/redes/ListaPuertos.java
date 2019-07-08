package principal.redes;

import jssc.SerialPortList;

public class ListaPuertos {

	public String[] puertos() {
		  String[] portNames = SerialPortList.getPortNames();
	      return portNames;	
	}
}
