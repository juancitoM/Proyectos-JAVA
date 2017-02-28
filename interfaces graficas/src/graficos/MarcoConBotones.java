package graficos;

import javax.swing.*;

public class MarcoConBotones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoBotones miMarco = new MarcoBotones();
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}



class MarcoBotones extends JFrame{
	
	public MarcoBotones(){
		
		setTitle("Botones y eventos");
		
		setBounds(700, 300, 500, 300);
		
		LaminaBotones lamina =  new LaminaBotones();
		
		add(lamina);
	}
	
}


class LaminaBotones extends JPanel{
	
	
	
	
}