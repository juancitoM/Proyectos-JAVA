package graficos;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Multiples_fuentes {

	public static void main(String[] args) {
		
		ventanaPrincipal vtna1 = new ventanaPrincipal();
		
		
	}

}

class ventanaPrincipal extends JFrame{
	
	
	public  ventanaPrincipal(){
		
		setTitle("Multiples Fuentes");
		setBounds(300, 350, 600, 300);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new lamina_botones());
	
	}

}

class lamina_botones extends JPanel{
	
	
	
	public lamina_botones(){
		
		AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/imagenes/btn_amarillo.png"), Color.yellow);
		AccionColor accionAzul = new AccionColor("Azul", null, Color.blue);
		AccionColor accionRojo = new AccionColor("Rojo", null, Color.red);
		
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
	}
	
	
	private class AccionColor extends AbstractAction{

		public  AccionColor(String nombre, Icon icono, Color color_boton){
			
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner el fondo de color " + nombre);
			putValue("color_de_fondo", color_boton);
			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			Color c = (Color)getValue("Color_de_fondo");
			setBackground(c);
		}

	}
	
		
}

