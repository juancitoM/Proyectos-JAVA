package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CheckBox {

	public static void main(String[] args) {

		MarcoCheck miMarco = new MarcoCheck();
	
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
	}

}


class MarcoCheck extends JFrame{
	
	public MarcoCheck(){
		
		setBounds(400, 100, 500, 450);
		
		setTitle("CheckBox"); 
		
		laminaCheck lamina = new laminaCheck();
		
		add(lamina);
		
		setVisible(true);
		
	}
	
	
	
}


class laminaCheck extends JPanel{
	
	private JLabel texto;
	
	private JCheckBox check1, check2;
	
	private JPanel laminaTexto, laminaChecks;
	
	public laminaCheck(){
		
		setLayout(new BorderLayout());
		
		Font miLetra = new Font("serif", Font.PLAIN, 24);
		
		texto = new JLabel("Hola Maricas");
		
		texto.setFont(miLetra);
		
		laminaTexto = new JPanel();
		
		laminaTexto.add(texto);
		
		add(laminaTexto,BorderLayout.NORTH);
		
		check1 =  new JCheckBox("Negrita");
		
		check2 = new JCheckBox("Cursiva");
		
		check1.addActionListener(ManejaChecks);
		
		check2.addActionListener(ManejaChecks);
		
		laminaChecks = new JPanel();
		
		laminaChecks.add(check1);
		
		laminaChecks.add(check2);
		
		add(laminaChecks, BorderLayout.SOUTH);
		
		
	}
	
	
	ActionListener ManejaChecks = new ActionListener(){

		
		public void actionPerformed(ActionEvent e) {
			
			int tipo = 0;
			
			if (check1.isSelected()) tipo += Font.BOLD;
			
			if (check2.isSelected()) tipo += Font.ITALIC;
			
			texto.setFont(new Font ("serif", tipo, 24));
			
		}
		
	};
	
	
}