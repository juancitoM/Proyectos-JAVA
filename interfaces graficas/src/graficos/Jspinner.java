package graficos;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Jspinner {

	public static void main(String[] args) {
		

	}

}


class marco_spinner extends JFrame{
	
	public marco_spinner(){
		
		setTitle("jspinner");
		
		setBounds(450, 100, 500, 450);
		
		add(new lamina_spinner());
		
		setVisible(true);
		
	}
}



class lamina_spinner extends JPanel{
	
	private JSpinner dateSpinner;
	
	
	public lamina_spinner(){
	
		
		
		
	}
	
	private class spinnerModel extends SpinnerDateModel{
		
		
		
		
	}
	
	
}