import javax.swing.*;
public class Entrada_de_datosII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario = JOptionPane.showInputDialog("Ingrese su nombre");
		
		String edad = JOptionPane.showInputDialog("Ingrese su edad");
		
		int edad_usuario = Integer.parseInt(edad);
		
		System.out.println("Hola " + nombre_usuario + ". Usted tendra " + (edad_usuario + 1) + " años el año que viene.");
		

	}

}
