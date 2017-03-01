package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MarcoConBotones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoBotones miMarco = new MarcoBotones();
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}



class MarcoBotones extends JFrame{
	
	public MarcoBotones(){
		
		setTitle("Botones y eventos");
		
		setBounds(700, 300, 500, 300);
		
		LaminaBotones lamina =  new LaminaBotones();
		
		add(lamina);
	}
	
}


class LaminaBotones extends JPanel implements ActionListener{
	
	JButton BotonAzul = new JButton("Lamina azul");
	
	JButton BotonAmarillo = new JButton("Lamina amarilla");
	
	JButton BotonSys = new JButton("Lamina System color");
	
	public LaminaBotones(){
		
		add(BotonAzul);
		
		add(BotonAmarillo);
		
		add(BotonSys);
		
		BotonAzul.addActionListener(this);
		
		BotonAmarillo.addActionListener(this);
		
		BotonSys.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e){
		
		Object botonPulsado = e.getSource();
		
		if (botonPulsado == BotonAzul){
			setBackground(Color.blue);
		}else if (botonPulsado == BotonAmarillo){
			setBackground(Color.yellow);
		}else{
			setBackground(SystemColor.window);
		}
	
			
		
		
	}
	
}