package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CuadroDeTexto {

	public static void main(String[] args) {
		Form vtnaPrincipal = new Form();
				
		vtnaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class Form extends JFrame{
	
	public Form(){
		setTitle("Cuadros de texto");
		setBounds(400, 300, 500, 300);
		laminaTexto milamina = new laminaTexto();
		add(milamina);
		setVisible(true);
	}
}


class laminaTexto extends JPanel{
	
	private JTextField campo1;
	private JLabel texto, resultado;
	private JButton btnComprobar;
	private JPanel lamina2;
	
	public laminaTexto(){
		
		setLayout(new BorderLayout());
		
		lamina2 = new JPanel();
		
		lamina2.setLayout(new FlowLayout());
		
		resultado = new JLabel("",JLabel.CENTER);
		
		texto = new JLabel("Email:");
		
		lamina2.add(texto);
		
		campo1 = new JTextField(20);
		
		lamina2.add(campo1);
		
		btnComprobar = new JButton("Comprobar");
		
		btnComprobar.addActionListener(oyenteBoton);
		
		lamina2.add(btnComprobar);
					
		add(lamina2, BorderLayout.NORTH);
		
		add(resultado, BorderLayout.CENTER);
	}
	
	ActionListener oyenteBoton = new ActionListener(){

		
		public void actionPerformed(ActionEvent e) {
			
			int correcto = 0;
			String email = campo1.getText().trim();
			
			for(int i = 0;i < email.length(); i++){
				
				if(email.charAt(i) == '@'){
					correcto++;
				}

			}
			
			if(correcto != 1){
				resultado.setText("Incorrecto");
			}else{
				resultado.setText("Correcto");	
			}	
		}
		
	};
	
	
}