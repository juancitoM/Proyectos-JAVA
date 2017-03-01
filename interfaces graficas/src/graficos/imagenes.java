package graficos;



import java.awt.*;
import java.io.*;

import javax.swing.*;
import javax.imageio.*;

public class imagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marco_con_imagen marco1 = new marco_con_imagen();
		
	}
}	
	
class marco_con_imagen extends JFrame{
		
		
		public marco_con_imagen(){
			
			setTitle("Prueba de dibujo");
			
			//setBounds(750, 300, 1000, 1000);
			
			Toolkit Screen = Toolkit.getDefaultToolkit();
			
			Dimension ScreenSize = Screen.getScreenSize();
			
			setSize(ScreenSize.width, ScreenSize.height);
			
			setVisible(true);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			LaminaConImagen lamina = new LaminaConImagen();
			
			add(lamina);
			
			lamina.setBackground(SystemColor.window);
			
			setResizable(false);
		}
		
	}


class LaminaConImagen extends JPanel{
		
		private Image imagen;
		
		
		public void paintComponent(Graphics g){
			
			super.paintComponent(g);
			
			//File miImagen = new File("C:\\Users\\juan\\Desktop\\imagenes\\scarlett johansson.jpg");
			
			try{
			imagen = ImageIO.read(new File("C:\\Users\\juan\\Desktop\\imagenes\\scarlett johansson.jpg"));

			}
			catch(IOException e){
				System.out.println("No se pudo cargar la imagen");
			}
			
			int anchoImagen = imagen.getWidth(this);
			
			int altoImagen	= imagen.getHeight(this);
			
			g.drawImage(imagen, 0, 0, null);
			
			g.copyArea(0, 0, anchoImagen, altoImagen, anchoImagen , 0);
			
			
		}
		
	}	
	
	
	
	


