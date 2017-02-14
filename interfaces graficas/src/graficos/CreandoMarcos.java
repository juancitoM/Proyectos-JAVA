package graficos;

import javax.swing.*;
public class CreandoMarcos {

	public static void main(String args[]){
		
		miMarco Principal = new miMarco();
		

		
	}
}


class miMarco extends JFrame{
	
	public miMarco(){
		
		//setSize(700,500);
		setVisible(true);
		setBounds(300,100,700,500);
		setResizable(false);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		setTitle("Mi ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}