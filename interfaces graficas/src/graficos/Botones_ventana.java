package graficos;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Botones_ventana{

	public static void main(String[] args) {
		
		Ventana V_principal = new Ventana(100, 300, 500, 350);
	
		V_principal.setTitle("Ventana Principal");
		
		V_principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}


class Ventana extends JFrame {
	
	
	
	public Ventana(int x, int y, int width, int height){
		
		setVisible(true);
		
		setBounds(x, y, width, height);
		
		add(new boton());
		
	}

}

class Ventana_gen extends JFrame{

	public Ventana_gen(){
		
		setVisible(true);
		setBounds(700, 300, 500, 350);
		setResizable(false);
		add(new lamina_img());
		
	}

}

class lamina_img extends JPanel{
	
	private Image imagen;
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		
		try{
			imagen = ImageIO.read(new File("C:\\Users\\EA6259\\Desktop\\the beatles.jpg"));
		}
		catch(IOException e){
			System.out.println("No se pudo cargar la imagen");
		}
		
		g.drawImage(imagen, 0, 0, null);
		
	}
	
}

class boton extends JPanel{
	
	JButton Boton_ventana;
	
	public boton(){
		
		Boton_ventana =  new JButton("abrir ventana");
		
		add(Boton_ventana);
		
		Boton_ventana.addActionListener(new button_clicked());
	}
	
	private class button_clicked implements ActionListener{
		
		Object source;
	
		public void actionPerformed(ActionEvent e){
			source = e.getSource();
			
			if (source == Boton_ventana){
				Ventana_gen ventana = new Ventana_gen();
				ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		}
	}
}

	

	
	



