package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class EjemploArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marcoArea miMarco = new marcoArea();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}



class marcoArea extends JFrame{
	
	public marcoArea(){
		
		setTitle("Ejemplo Area de texto");
		setBounds(500, 300, 400, 300);
		add(new laminaArea());
		setVisible(true);
		
		
	}
	
	
}


class laminaArea extends JPanel{
	
	public laminaArea(){
		
		JTextArea miarea = new JTextArea(8,20);
		
		JScrollPane laminaBarra = new JScrollPane(miarea);
		
		miarea.setLineWrap(true);
		
		add(laminaBarra);
		
	}
	
	
}