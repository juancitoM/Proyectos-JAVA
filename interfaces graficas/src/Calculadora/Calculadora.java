package Calculadora;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		
		MarcoCalculadora vtna_principal = new MarcoCalculadora();		
		vtna_principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vtna_principal.setVisible(true);
		

	}

}


class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora(){
		
		setTitle("Calculadora");
		setResizable(false);
		setBounds(500, 300, 450, 300);		
		LaminaCalculadora milamina = new LaminaCalculadora();		
		add(milamina);		
		//pack();
	}
	
	
}

class LaminaCalculadora extends JPanel{
	
	private JPanel milamina2 = new JPanel();
	private JPanel milamina3 = new JPanel();
	private JButton pantalla;
	private boolean principio;
	private double total;
	private String ultimaOperacion;
	
	public LaminaCalculadora(){
		
		principio = true;
		ultimaOperacion = "=";
		setLayout(new BorderLayout());		
		pantalla = new JButton("0");		
		pantalla.setEnabled(false);		
		add(pantalla, BorderLayout.NORTH);		
		milamina2.setLayout(new GridLayout(3,5,5,0));	
		milamina3.setLayout(new GridLayout(1,0,10,0));
		add(milamina2,BorderLayout.CENTER);
		add(milamina3,BorderLayout.SOUTH);
		
		BotonPulsado boton0 = new BotonPulsado("0");
		BotonPulsado boton1 = new BotonPulsado("1");
		BotonPulsado boton2 = new BotonPulsado("2");
		BotonPulsado boton3 = new BotonPulsado("3");
		BotonPulsado boton4 = new BotonPulsado("4");
		BotonPulsado boton5 = new BotonPulsado("5");
		BotonPulsado boton6 = new BotonPulsado("6");
		BotonPulsado boton7 = new BotonPulsado("7");
		BotonPulsado boton8 = new BotonPulsado("8");
		BotonPulsado boton9 = new BotonPulsado("9");
		operacion multiplica = new operacion("*");
		operacion divide = new operacion("/");
		operacion resta = new operacion("-");
		operacion suma = new operacion("+");
		operacion igual = new operacion("=");
		BotonPulsado punto = new BotonPulsado(".");
		
		ponerboton(boton7,milamina2);
		ponerboton(boton8,milamina2);
		ponerboton(boton9,milamina2);
		ponerboton(multiplica,milamina2);
		ponerboton(boton4,milamina2);
		ponerboton(boton5,milamina2);
		ponerboton(boton6,milamina2);
		ponerboton(divide,milamina2);
		ponerboton(boton1,milamina2);
		ponerboton(boton2,milamina2);
		ponerboton(boton3,milamina2);
		ponerboton(suma,milamina2);
		ponerboton(boton0,milamina3);
		ponerboton(punto,milamina3);
		ponerboton(igual,milamina3);
		ponerboton(resta,milamina3);
		
		InputMap mapaDeEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		mapaDeEntrada.put(KeyStroke.getKeyStroke("1"), "boton 1");
		mapaDeEntrada.put(KeyStroke.getKeyStroke("2"), "boton 2");
		mapaDeEntrada.put(KeyStroke.getKeyStroke("3"), "boton 3");
		mapaDeEntrada.put(KeyStroke.getKeyStroke("4"), "boton 4");
		mapaDeEntrada.put(KeyStroke.getKeyStroke("5"), "boton 5");
		mapaDeEntrada.put(KeyStroke.getKeyStroke("6"), "boton 6");
		mapaDeEntrada.put(KeyStroke.getKeyStroke("7"), "boton 7");
		mapaDeEntrada.put(KeyStroke.getKeyStroke("8"), "boton 8");
		mapaDeEntrada.put(KeyStroke.getKeyStroke("9"), "boton 9");
		mapaDeEntrada.put(KeyStroke.getKeyStroke("/"), "boton /");
		mapaDeEntrada.put(KeyStroke.getKeyStroke("*"), "boton *");
		mapaDeEntrada.put(KeyStroke.getKeyStroke("+"), "boton +");
		mapaDeEntrada.put(KeyStroke.getKeyStroke("-"), "boton -");
		mapaDeEntrada.put(KeyStroke.getKeyStroke("."), "boton .");
		mapaDeEntrada.put(KeyStroke.getKeyStroke("="), "boton =");
		mapaDeEntrada.put(KeyStroke.getKeyStroke("0"), "boton 0");
		
		ActionMap accion = getActionMap();
		accion.put("boton 1", boton1);
		accion.put("boton 2", boton2);
		accion.put("boton 3", boton3);
		accion.put("boton 4", boton4);
		accion.put("boton 5", boton5);
		accion.put("boton 6", boton6);
		accion.put("boton 7", boton7);
		accion.put("boton 8", boton8);
		accion.put("boton 9", boton9);
		accion.put("boton 0", boton0);
		accion.put("boton /", divide);
		accion.put("boton *", multiplica);
		accion.put("boton +", suma);
		accion.put("boton -", resta);
		accion.put("boton =", igual);
		accion.put("boton .", punto);
				
	}	
	
	
	private void ponerboton( AbstractAction a, JPanel l){
		
		JButton btn = new JButton(a);		
		//milamina2.add(btn);
		l.add(btn);
	}
	
	private class BotonPulsado extends AbstractAction{
		
		public BotonPulsado(String numero){
			
			putValue(Action.NAME, numero);		
			
		}
				
		public void actionPerformed(ActionEvent e) {
		
			String s = (String) getValue(Action.NAME);
			if(principio){
				pantalla.setText("");
				principio = !principio;
			}
			pantalla.setText(pantalla.getText() + s);
			
			
		}

	}
	
	private class operacion extends AbstractAction{
		
		
		public operacion(String n){
			
			putValue(Action.NAME,n);	
		}

		
		public void actionPerformed(ActionEvent e) {
			
			String operacion = (String) getValue(Action.NAME);
			System.out.println(operacion);
			calcular(Double.parseDouble(pantalla.getText()));
			ultimaOperacion = operacion;
			
			principio =  true;
		}
		
		private void calcular(double x){
			
			switch (ultimaOperacion){
			
			case"+":
				total += x;
				break;
			
			case"-":
				total -= x;
				break;
			
			case"/":
				total /= x;
				break;	
			
			case"*":
				total *= x;
				break;	
				
			case"=":
				total = x;
				break;	
			default:
				break;				
			}
			pantalla.setText(String.valueOf(total));
		}
		 
		
	}
	
	
}
