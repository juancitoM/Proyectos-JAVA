package graficos;

import javax.swing.*;
import java.awt.event.*;

public class Botones_ventana{

	public static void main(String[] args) {
		
		Ventana V_principal = new Ventana(300, 300, 500, 350);
	
		V_principal.setTitle("Ventana Principal");
		
		V_principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}


class Ventana extends JFrame {
	

	
	public Ventana(int x, int y, int width, int height){
		
		setVisible(true);
		
		setBounds(x, y, width, height);
		
		lamina_boton boton = new lamina_boton("Abrir ventana");
		
		add(boton);
		
	}

}

class Ventana_con_imagen extends JFrame{
	//aca va una ventana con una imagen

}


class lamina_boton extends JPanel{
	
	private JButton boton;
	
	private boolean boton_apretado;
	
	public lamina_boton(String s){
		
		add(boton = new JButton(s));
		
		boton.addActionListener(new button_clicked());
	}
	
	private class button_clicked implements ActionListener{
		
		
		public void actionPerformed(ActionEvent e){
			
			Ventana ventana2 = new Ventana(900, 300, 500, 350);
			
			ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
	}
	
	
}


