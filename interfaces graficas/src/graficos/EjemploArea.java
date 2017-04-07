package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class EjemploArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marcoConArea miMarco = new marcoConArea();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
	}

}



class marcoConArea extends JFrame{
	
	public marcoConArea(){
		
		setTitle("Ejemplo Area de texto");
		setBounds(500, 300, 400, 300);	
		setLayout(new BorderLayout());
		add(new laminaBotones());
		
	}
	
	
}


class laminaBotones extends JPanel{
	
	
	private JButton btnInsertar, btnSaltoLinea;
	private JPanel laminaArea;
	private JTextArea AreaDeTexto = new JTextArea(30,30);
	public laminaBotones(){
		
		
		setLayout(new BorderLayout());
		
		laminaArea  = new JPanel();
		
		laminaArea.add(AreaDeTexto);
		
		
		btnInsertar = new JButton("Insertar");
		
		
		
		
	}
	 
	
}