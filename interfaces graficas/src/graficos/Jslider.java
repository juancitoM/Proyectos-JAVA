package graficos;


import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Jslider {

	public static void main(String[] args) {

		marco_slider miMarco = new marco_slider();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}



class marco_slider extends JFrame{
	
	public marco_slider(){
		
		setTitle("JSlider");
		
		setBounds(450, 100, 500, 450);
		
		add(new lamina_slider());
		
		setVisible(true);
		
	}
	
}

class lamina_slider extends JPanel{
	
	private JSlider control;
	private JLabel texto;
	private JPanel laminaSlider;
	
	public lamina_slider(){
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("Hola maricas");
		
		add(texto, BorderLayout.CENTER);
		
		
		control = new JSlider(8,50,12);
		
		control.setMajorTickSpacing(14);
		
		control.setMinorTickSpacing(2);
		
		control.setPaintTicks(true);
		
		control.setPaintLabels(true);
		
		control.setFont(new Font("serif", Font.ITALIC, 10));
		
		control.addChangeListener(new slider_listener());  
		
		laminaSlider = new JPanel();
		
		laminaSlider.add(control);
		
		add(laminaSlider, BorderLayout.NORTH);
		
		
	}
	
	private class slider_listener implements ChangeListener{

		
		public void stateChanged(ChangeEvent arg0) {
			
			texto.setFont(new Font("serif", Font.BOLD, control.getValue()));
			
		}
		
		
		
	}
	
	
}