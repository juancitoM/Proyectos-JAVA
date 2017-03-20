package graficos;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;



public class CampoPassword {

	public static void main(String[] args) {
		
		marcoPassword login = new marcoPassword();
		
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class marcoPassword extends JFrame{
	
	public marcoPassword(){
		
		setTitle("Login");
		setBounds(500, 300, 500, 300);
		laminaContraseña login = new laminaContraseña();
		add(login);
		setVisible(true);
		setResizable(false);
		
	}	
	
}


class laminaContraseña extends JPanel{
	
	private JPanel laminaSuperior;
	private JLabel etiquetaUsuario, etiquetaContraseña;
	private JTextField  c_usuario;
	private JPasswordField c_contraseña;
	private JButton btnEnviar;
	
	
	public laminaContraseña(){
		
		setLayout(new BorderLayout());
		
		laminaSuperior = new JPanel();
		
		laminaSuperior.setLayout(new GridLayout(2,2));
		
		add(laminaSuperior, BorderLayout.NORTH);
		
		etiquetaUsuario = new JLabel("Usuario:");
		
		etiquetaContraseña = new JLabel("Contraseña:");
		
		c_usuario = new JTextField(15);
	
		c_contraseña = new JPasswordField(15);
		
		laminaSuperior.add(etiquetaUsuario);
		
		laminaSuperior.add(c_usuario);
		
		laminaSuperior.add(etiquetaContraseña);
		
		laminaSuperior.add(c_contraseña);
		
		btnEnviar = new JButton("Enviar");
		
		add(btnEnviar, BorderLayout.SOUTH);
		
		c_contraseña.getDocument().addDocumentListener(new compruebaPass());
		
	}
	
	private class compruebaPass implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
			char contraseña[];
			
			contraseña = c_contraseña.getPassword();
			
			
			
			if(contraseña.length < 8 || contraseña.length > 12){
				
				c_contraseña.setBackground(Color.red);
				
			}else{
				c_contraseña.setBackground(Color.white);
			}
			
			
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
			char contraseña[];
			
			contraseña = c_contraseña.getPassword();
			
			
			
			if(contraseña.length < 8 || contraseña.length > 12){
				 
				c_contraseña.setBackground(Color.red);
				
			}else{
				c_contraseña.setBackground(Color.white);
			}
		}
		
	}
		
}