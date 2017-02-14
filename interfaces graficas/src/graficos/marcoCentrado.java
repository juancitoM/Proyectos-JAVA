package graficos;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;


public class marcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		principalCentrado pantalla = new principalCentrado();
		
	}

}



class principalCentrado extends JFrame{

	private int altoPantalla;
	private int anchoPantalla;
	private Image miIcono;
	
	public principalCentrado(){
		
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		
		Dimension ScreenSize = pantalla.getScreenSize();
		
		altoPantalla = ScreenSize.height;
		
		anchoPantalla = ScreenSize.width;
		
		miIcono = pantalla.getImage("C:\\Users\\juan\\Desktop\\imagenes\\inicio.jpg");
		
		setVisible(true);
		
		setBounds(anchoPantalla/4,altoPantalla/4,anchoPantalla/2,altoPantalla/2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setIconImage(miIcono);
		
		Lamina miLamina = new Lamina();
		
		add(miLamina);
		
	}	
}



class Lamina extends JPanel{
	
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		g.drawString("Hola putos",100,100);
		
	}
	
}



