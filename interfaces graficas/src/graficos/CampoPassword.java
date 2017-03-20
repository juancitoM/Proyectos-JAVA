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
		laminaContrase�a login = new laminaContrase�a();
		add(login);
		setVisible(true);
		setResizable(false);
		
	}	
	
}


class laminaContrase�a extends JPanel{
	
	private JPanel laminaSuperior;
	private JLabel etiquetaUsuario, etiquetaContrase�a;
	private JTextField  c_usuario;
	private JPasswordField c_contrase�a;
	private JButton btnEnviar;
	
	
	public laminaContrase�a(){
		
		setLayout(new BorderLayout());
		
		laminaSuperior = new JPanel();
		
		laminaSuperior.setLayout(new GridLayout(2,2));
		
		add(laminaSuperior, BorderLayout.NORTH);
		
		etiquetaUsuario = new JLabel("Usuario:");
		
		etiquetaContrase�a = new JLabel("Contrase�a:");
		
		c_usuario = new JTextField(15);
	
		c_contrase�a = new JPasswordField(15);
		
		laminaSuperior.add(etiquetaUsuario);
		
		laminaSuperior.add(c_usuario);
		
		laminaSuperior.add(etiquetaContrase�a);
		
		laminaSuperior.add(c_contrase�a);
		
		btnEnviar = new JButton("Enviar");
		
		add(btnEnviar, BorderLayout.SOUTH);
		
		c_contrase�a.getDocument().addDocumentListener(new compruebaPass());
		
	}
	
	private class compruebaPass implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
			char contrase�a[];
			
			contrase�a = c_contrase�a.getPassword();
			
			
			
			if(contrase�a.length < 8 || contrase�a.length > 12){
				
				c_contrase�a.setBackground(Color.red);
				
			}else{
				c_contrase�a.setBackground(Color.white);
			}
			
			
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
			char contrase�a[];
			
			contrase�a = c_contrase�a.getPassword();
			
			
			
			if(contrase�a.length < 8 || contrase�a.length > 12){
				 
				c_contrase�a.setBackground(Color.red);
				
			}else{
				c_contrase�a.setBackground(Color.white);
			}
		}
		
	}
		
}