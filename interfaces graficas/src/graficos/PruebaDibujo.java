package graficos;
import java.awt.*;
import java.awt.geom.*;

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
		
		lamina.setBackground(SystemColor.window);
		
		setResizable(false);
	}
	
}


class LaminaConFiguras extends JPanel{
	
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		//g.drawRect(50, 50, 200, 200);
		//g.drawRoundRect(50, 50, 100, 50, 30, 30);
		
		Graphics2D g2 = (Graphics2D)g;
		
		Rectangle2D boton1 = new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.setPaint(Color.RED);
		
		g2.draw(boton1); 
		
		g2.fill(boton1);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		 
		elipse.setFrame(boton1);
		
		g2.setPaint(new Color(0,140,255).brighter());

		g2.draw(elipse);
				
		g2.fill(elipse); 
		
	}
	
}