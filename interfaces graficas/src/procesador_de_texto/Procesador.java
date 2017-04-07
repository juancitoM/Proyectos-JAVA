package procesador_de_texto;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class Procesador {

	public static void main(String[] args) {
		
		MenuProcesador miMarco = new MenuProcesador();
		 
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MenuProcesador extends JFrame{
	
	
	
	public MenuProcesador(){
		
		Toolkit pantalla = Toolkit.getDefaultToolkit();	
		Dimension ScreenSize = pantalla.getScreenSize();
		setTitle("Procesador de texto");
		//setBounds(0, 0, (int)ScreenSize.getHeight(), (int)ScreenSize.getWidth());
		setSize(ScreenSize);
		setResizable(false);
		add(new LaminaProcesador());
		setVisible(true);
	
	}
	
}


class LaminaProcesador extends JPanel{
	
	private JPanel LaminaMenu;
	private JMenuBar miBarra;
	private JMenu fuente, estilo, tama�o;
	private Font letras;
	private JMenuItem arial, courier, verdana, negrita, cursiva;
	private JMenuItem tama�o8, tama�o10, tama�o12, tama�o16, tama�o20,tama�o24;
	private JTextPane areaTexto;
	
	
	public LaminaProcesador(){
		
		 setLayout(new BorderLayout());
		
		 LaminaMenu = new JPanel();
		 
		 areaTexto = new JTextPane();
		 add(areaTexto);
//----------------------------------------------------------------------------------------		 
		 miBarra = new JMenuBar();
		 
		 fuente = new JMenu("Fuente");
		 estilo = new JMenu("Estilo");
		 tama�o = new JMenu("Tama�o");
		 
		 
		 configura_menu("Arial", "fuente", "Arial", 9, 10);
		 configura_menu("Courier", "fuente", "Courier", 9, 10);
		 configura_menu("Verdana", "fuente", "Verdana", 9, 10);
		 
		 
		 configura_menu("Negrita", "estilo", "", Font.BOLD, 1);
		 configura_menu("Cursiva", "estilo", "", Font.ITALIC, 1);
		 
		 
		 configura_menu("8", "tama�o", "", 9, 8);
		 configura_menu("10", "tama�o", "", 9,10);
		 configura_menu("12", "tama�o", "", 9,12);
		 configura_menu("16", "tama�o", "", 9,16);
		 configura_menu("20", "tama�o", "", 9,20);
		 configura_menu("24", "tama�o", "", 9, 24);
		 
		 

		 miBarra.add(fuente);
		 miBarra.add(estilo);
		 miBarra.add(tama�o);
//----------------------------------------------------------------------------------------		 

		 LaminaMenu.add(miBarra); 
		 add(LaminaMenu, BorderLayout.NORTH);
		 
	}
	
	public void configura_menu(String rotulo, String menu, String letra, int stilo, int tam){
		
		JMenuItem elemMenu = new JMenuItem(rotulo);
				
		switch (menu){
		
		case "fuente":
				fuente.add(elemMenu);
				break;
				
		case "estilo":
				estilo.add(elemMenu);
				break;
		
		case "tama�o":
				tama�o.add(elemMenu);
				break;
		}	
		
		
		elemMenu.addActionListener(new gestiona_evento(rotulo, letra, stilo, tam));
		
	}
	private class gestiona_evento implements ActionListener{
		
		String tipo_texto, menu;
		int estilo_letra, tam_letra;
		
		gestiona_evento(String elemento, String texto2, int estilo2, int tamagno_letra){
			
			tipo_texto = texto2; 
			estilo_letra = estilo2;
			tam_letra = tamagno_letra;
			menu = elemento;
			
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			letras = areaTexto.getFont();
			
			if (menu ==  "Arial" || menu == "Courier" || menu == "Verdana"){
				estilo_letra = letras.getStyle();
				tam_letra = letras.	getSize();
				
			}else if(menu == "Cursiva" || menu == "Negrita"){
				
				if (letras.getStyle() == 1 || letras.getStyle() ==  2){
					estilo_letra = 3;
				}
				
				tipo_texto =  letras.getFontName();
				tam_letra = letras.getSize();
			
			}else{
				tipo_texto =  letras.getFontName();
				estilo_letra = letras.getStyle();
			}
			
			areaTexto.setFont(new Font(tipo_texto, estilo_letra, tam_letra));
			
		}
		
		
	}
	
}