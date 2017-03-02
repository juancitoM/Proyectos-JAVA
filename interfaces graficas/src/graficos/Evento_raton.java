package graficos;

import java.awt.event.*;
import javax.swing.*;

public class Evento_raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRaton ventana = new MarcoRaton();
		ventana.setBounds(100, 300, 500, 350);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoRaton extends JFrame{
	
	public MarcoRaton(){
		
		setVisible(true);		  
		addMouseListener(new EventoRaton());
	}

}

class EventoRaton extends MouseAdapter{
	
	public void mouseClicked(MouseEvent e){
		MarcoRaton ventana1 = new MarcoRaton();
		ventana1.setBounds(500, 300, 500, 350);
		ventana1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
	
}



