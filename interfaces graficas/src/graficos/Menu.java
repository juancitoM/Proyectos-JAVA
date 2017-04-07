package graficos;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


public class Menu {

	public static void main(String[] args) {
		
		MarcoConMenu mimarco = new MarcoConMenu();
		
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}


class MarcoConMenu extends JFrame{
	
	public MarcoConMenu(){
		
		setTitle("Creacion de un menu");
		
		setBounds(450, 100, 500, 450);
		
		add(new laminaConMenu());
		
		setVisible(true);
		
	}
	
	
}

class laminaConMenu extends JPanel{
	
	private JMenuBar miBarra;
	private JMenu Archivo;
	private JMenu edicion;
	private JMenu herramientas;
	
	public laminaConMenu(){
		
		setLayout(new BorderLayout());
		
		miBarra = new JMenuBar();
		Archivo = new JMenu("Archivo");
		edicion = new JMenu("Edicion");
		herramientas = new JMenu("Herramientas");
		JMenu opciones = new JMenu("Opciones");
		
		
		JMenuItem guardar =  new JMenuItem("Guardar");
		JMenuItem guardarComo = new JMenuItem("Guardar como");		
		JMenuItem copiar = new JMenuItem("Copiar");
		JMenuItem pegar = new JMenuItem("pegar");
		JMenuItem cortar = new JMenuItem("cortar");		
		JMenuItem generales = new JMenuItem("generales");
		JMenuItem opcion1 = new JMenuItem("Opcion 1");
		JMenuItem opcion2 = new JMenuItem("Opcion 2");
		
		opciones.add(opcion1);
		opciones.add(opcion2);
		
		Archivo.add(guardar);
		Archivo.add(guardarComo);
		
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		edicion.addSeparator();
		edicion.add(opciones);
		
		herramientas.add(generales);
		
		miBarra.add(Archivo);
		miBarra.add(edicion);
		miBarra.add(herramientas);
		
		add(miBarra, BorderLayout.NORTH); 
		
	}
	
}