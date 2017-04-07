package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class comoBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mainFrame marco = new mainFrame();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}


class mainFrame extends JFrame{
	
	public mainFrame(){
		
		setTitle("Combo Box");
		setBounds(300, 200, 500, 450);
		laminaCombo milamina = new laminaCombo();
		add(milamina);
		setVisible(true);
		
		
	}
	
	
}


class laminaCombo extends JPanel{
	
	private JLabel texto;
	
	private JComboBox desplegable;
	
	private JPanel lamina2;
	
	public laminaCombo(){
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("Hola maricas");
		
		texto.setFont(new Font("serif", Font.PLAIN, 18));
		
		add(texto, BorderLayout.CENTER);
		
		desplegable = new JComboBox();
		
		lamina2 = new JPanel();
		
		desplegable.addActionListener(new evento_combo());
		
		desplegable.setEditable(true);
		
		desplegable.addItem("serif");
		
		desplegable.addItem("SansSerif");
		
		desplegable.addItem("Monospaced");
		
		desplegable.addItem("Dialog");
		
		lamina2.add(desplegable);
		
		add(lamina2, BorderLayout.NORTH);
		
		
	}
	
	class evento_combo implements ActionListener{

		
		public void actionPerformed(ActionEvent arg0) {
			
			texto.setFont(new Font((String)desplegable.getSelectedItem(), Font.PLAIN, 18));
			
			
		}
		
		
		
	}
	
	
	
}