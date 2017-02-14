package graficos;
import java.awt.*;
import javax.swing.*;


public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marco_con_dibujos screen = new marco_con_dibujos();  
		
	}

}





class marco_con_dibujos extends JFrame{
	
	
	public marco_con_dibujos(){
		setTitle("Prueba de dibujo");
		
		setSize(400, 400);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LaminaConFiguras lamina = new LaminaConFiguras();
		
		add(lamina);
		
	}
	
}


class LaminaConFiguras extends JPanel{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		//g.drawRect(50, 50, 200, 200);
		g.drawRoundRect(50, 50, 100, 50, 30, 30);
	}
	
}