package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MarcoConBotonos2 {

	public static void main(String[] args) {
		
		MarcoBotones2 miMarco = new MarcoBotones2();
		
		miMarco.setVisible(true);
		
	}

}

class MarcoBotones2 extends JFrame{
	
	public MarcoBotones2(){
		
		setTitle("Botones y eventos");
		
		setBounds(700, 300, 500, 300);
		
		LaminaBotones lamina =  new LaminaBotones();
		
		add(lamina);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}


class LaminaBotones2 extends JPanel{
	
	JButton BotonAzul = new JButton("Lamina azul");
	
	JButton BotonAmarillo = new JButton("Lamina amarilla");
	
	JButton BotonSys = new JButton("Lamina System color");
	
	public LaminaBotones2(){
		
		add(BotonAzul);
		
		add(BotonAmarillo);
		
		add(BotonSys);
		
		ColorFondo azul = new ColorFondo(Color.blue);
		
		ColorFondo amarillo = new ColorFondo(Color.yellow);
		
		ColorFondo sysColor = new ColorFondo(SystemColor.window);
		
		BotonAzul.addActionListener(azul);
		
		BotonAmarillo.addActionListener(amarillo);
		
		BotonSys.addActionListener(sysColor);
		
	}
	
	private class ColorFondo implements ActionListener{
		
		private Color colorDeFondo;
		
		public ColorFondo(Color c){
			
			colorDeFondo = c;
			
		}

		public void actionPerformed(ActionEvent e){
			
			setBackground(colorDeFondo);

		}
		
	}
	
}



