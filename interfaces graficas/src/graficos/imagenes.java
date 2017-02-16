package graficos;



import java.awt.*;
import javax.swing.*;


public class imagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marco_con_imagen marco1 = new marco_con_imagen();
		
	}
}	
	
	class marco_con_imagen extends JFrame{
		
		
		public marco_con_imagen(){
			setTitle("Prueba de dibujo");
			
			setBounds(750, 300, 300, 200);
			
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			LaminaConImagen lamina = new LaminaConImagen();
			
			add(lamina);
			
			lamina.setBackground(SystemColor.window);
			
			setResizable(false);
		}
		
	}


class LaminaConImagen extends JPanel{
		
		
		public void paintComponent(Graphics g){
			
			super.paintComponent(g);
			
			
			
		}
		
	}	
	
	
	
	


