package graficos;

import javax.swing.*;
import java.awt.event.*;

public class eventos_ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		marco_ventana miMarco = new marco_ventana();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class marco_ventana extends JFrame{
	
	public marco_ventana(){
		
		setTitle("Eventos de ventana");
		
		setBounds(300, 300, 500, 350);
		
		setVisible(true);
		
		addWindowListener(new M_ventana());
	}
	
	
}


class M_ventana implements WindowListener{
	
	public void windowActivated(WindowEvent e){}
	
	public void windowClosed(WindowEvent e){}
	
	public void	windowClosing(WindowEvent e){}
	
	public void windowDeactivated(WindowEvent e){}
	
	public void	windowDeiconified(WindowEvent e){}
	
	public void windowIconified(WindowEvent e){
		
		System.out.println("Ventana Cerrada");
	}
	
	public void windowOpened(WindowEvent e){}
	
}