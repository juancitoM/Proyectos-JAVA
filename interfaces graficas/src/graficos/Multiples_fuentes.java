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
		
		AccionColor accionAmarillo = new AccionColor("Amarillo", null, Color.yellow);
		AccionColor accionAzul = new AccionColor("Azul", null, Color.blue);
		AccionColor accionRojo = new AccionColor("Rojo", null, Color.red);
		
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo amarillo");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo azul");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo rojo");
		
		ActionMap mapaAccion = getActionMap();
		mapaAccion.put("fondo amarillo", accionAmarillo);
		mapaAccion.put("fondo azul", accionAzul);
		mapaAccion.put("fondo rojo", accionRojo);
	}
	
	
	private class AccionColor extends AbstractAction{ 

		public  AccionColor(String nombre, Icon icono, Color color_boton){
			
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner el fondo de color " + nombre);
			putValue("color_de_fondo", color_boton);
			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			Color c = (Color)getValue("color_de_fondo");
			setBackground(c);
			System.out.println("Nombre: " + getValue(Action.NAME) + ". Descripcion: " + getValue(Action.SHORT_DESCRIPTION));
		}

	}
	
		
}

