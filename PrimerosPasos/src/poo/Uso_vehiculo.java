package poo;
//import javax.swing.*;

public class Uso_vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		Coche micoche = new Coche(); 								// Instanciar una clase, crear un objeto
		
		micoche.establece_color(JOptionPane.showInputDialog("Ingrese el color deseado"));
		
		System.out.println(micoche.devuelve_color());
		
		micoche.establece_asientos_cuero(JOptionPane.showInputDialog("¿Desea asientos de cuero?"));
		
		System.out.println(micoche.devuelve_asientos());
		
		micoche.establece_climatizador(JOptionPane.showInputDialog("¿Desea asientos de climatizador?"));
	
		System.out.println(micoche.devuelve_climatizador());
		
		System.out.println(micoche.devuelve_peso_total());
	
		System.out.println(micoche.devuelve_precio());		
	*/
		
		
		Coche miCoche = new Coche();
		
		miCoche.establece_color("Blanco");
		
		Furgoneta miFurgoneta = new Furgoneta(4,580);
		
		miFurgoneta.establece_color("Gris");
		
		miFurgoneta.establece_asientos_cuero("Si");
	
		miFurgoneta.establece_climatizador("Si");
	
		System.out.println(miCoche.devuelve_datosGenerales());
		
		System.out.println(miFurgoneta.dimeDatosFurgoneta());
		
		
		
	
	}
	
	
	
	
	

}
