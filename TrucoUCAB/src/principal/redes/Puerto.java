package principal.redes;
import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;
import principal.maquinaEstados.estados.menuPrincipal.ControlMaestro;
 
public class Puerto {
 
    static SerialPort serialPort;
 
    public Puerto(String puerto) {
    	serialPort = new SerialPort(puerto);
    	try {
    	    serialPort.openPort();

    	    serialPort.setParams(SerialPort.BAUDRATE_9600,
    	                         SerialPort.DATABITS_8,
    	                         SerialPort.STOPBITS_1,
    	                         SerialPort.PARITY_NONE);

    	    serialPort.setFlowControlMode(SerialPort.FLOWCONTROL_RTSCTS_IN | 
    	                                  SerialPort.FLOWCONTROL_RTSCTS_OUT);

    	    serialPort.addEventListener(new SerialPortReader(), SerialPort.MASK_RXCHAR);
    	}
    	catch (SerialPortException ex) {
    	    System.out.println("There are an error on writing string to port т: " + ex);
    	}
    }
    public void enviarMensaje(String mensaje) {
    	 try {
    	     serialPort.writeString(mensaje);
    	    }
    	    catch (SerialPortException ex) {
    	        System.out.println(ex);
    	    }
    }
 
    private static class SerialPortReader implements SerialPortEventListener {
    	public static String cadena = "";
        @Override
        public void serialEvent(SerialPortEvent event) {
            if(event.isRXCHAR() && event.getEventValue() > 0) {
                try {
                	System.out.println(serialPort.getPortName());
                    String receivedData = serialPort.readString(event.getEventValue());
                    cadena = cadena + receivedData;
                    if (cadena.length() == 56) {
                    	if (ControlMaestro.jugador.verificarMensaje(cadena)) {
                    		ControlMaestro.puerto.enviarMensaje(cadena);
                    		cadena = "";
                    		System.out.println("Reenvia");
                    	}
                    System.out.println("Received response: " + receivedData);
                    ControlMaestro.pantalla.getMensajeRecibido().setText(receivedData);
                }
                    }
                catch (SerialPortException ex) {
                    System.out.println("Error in receiving string from COM-port: " + ex);
                }
            }
        }
}
    }
