package graficos;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Botones_ventana{

	public static void main(String[] args) {
		
		ventana V_principal = new ventana(100, 300, 500, 350);
	
		V_principal.setTitle("btn_ventana Principal");
		
		V_principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}


class ventana extends JFrame {
	
	
	
	public ventana(int x, int y, int width, int height){
		
		setVisible(true);
		setBounds(x, y, width, height);		
		add(new boton());
		
	}
}

class ventana_gen extends JFrame{

	public ventana_gen(){
		
		
		setBounds(700, 300, 500, 350);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
}

class lamina_img extends JPanel{
	
	private Image imagen;
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		
		try{
			imagen = ImageIO.read(new File("C:\\Users\\juan\\Desktop\\the beatles.jpg"));
		}
		catch(IOException e){
			System.out.println("No se pudo cargar la imagen");
		}
		
		g.drawImage(imagen, 0, 0, null);
		
	}	
}

class boton extends JPanel{ //implements ActionListener {
	
	JButton btn_ventana, btn_ventana2;
	Object source;
	ventana_gen ventana = new ventana_gen();
	public boton(){
		
		btn_ventana =  new JButton("abrir ventana");
		btn_ventana2 = new JButton("cerrar ventana");
		
		add(btn_ventana);
		add(btn_ventana2);
		
		//Boton_btn_ventana.addActionListener(new button_clicked());
		//btn_ventana.addActionListener(this);
		btn_ventana.addMouseListener(new EventoRaton());
		btn_ventana2.addMouseListener(new EventoRaton());
		
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//			source = e.getSource();
//			if (source == btn_ventana){
//				btn_ventana_gen btn_ventana = new btn_ventana_gen();
//				btn_ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//				btn_ventana.add(new lamina_img());
//				
//			}
//	}
	
	private class EventoRaton extends MouseAdapter{
		
		public void mouseClicked(MouseEvent e){
			source = e.getSource();
			if (source == btn_ventana){
				ventana.setVisible(true);
				ventana.add(new lamina_img());
			}else if(source == btn_ventana2) ventana.dispose();
		}
		

		
	}
		
//---------------------Formas de colocar un escuchador o listener-----------------
	
//	private class button_clicked implements ActionListener{
//		
//		Object source;
//	
//		public void actionPerformed(ActionEvent e){
//			source = e.getSource();
//			
//			if (source == Boton_btn_ventana){
//				btn_ventana_gen btn_ventana = new btn_ventana_gen();
//				btn_ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//			}
//		}
//	}	
//	ActionListener escuchadorbtn_ventana = new ActionListener(){
//		
//		Object source;
//		
//		public void actionPerformed(ActionEvent evt){
//			
//			source = evt.getSource();
//			if (source == btn_ventana){
//				btn_ventana_gen btn_ventana = new btn_ventana_gen();
//				btn_ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//				btn_ventana.add(new lamina_img());
//				
//			}
//		}
//		
//	};

}


	
	



