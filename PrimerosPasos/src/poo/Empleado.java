package poo;

import java.util.*;

public class Empleado {
	
	private String nombre;
	private double sueldo;
	private Date alta_contrato;
	private static int legajoSiguiente;
	private int legajo;
	
	
	public Empleado(String nom, double sue, int year, int mes, int dia){
		nombre = nom;
		sueldo = sue;
		GregorianCalendar Calendario = new GregorianCalendar(year,mes-1,dia);
		alta_contrato = Calendario.getTime();
		++legajoSiguiente;
		legajo = legajoSiguiente;
		
	}
	
	public Empleado (String nom){
		
		this(nom,12000,2000,01,01);
	}
	
	
	public String Devuelve_nombre(){
		
		return nombre + ", legajo: " + legajo;
	}
	
	public double Devuelve_sueldo(){
		
		return  sueldo;	
	}
	
	public Date Devuelve_fechaContrato(){
		
		return alta_contrato;
	}
	
	public void Aumenta_sueldo(double porcentaje){
		
		double aumento = (sueldo*porcentaje)/100;
		
		sueldo += aumento;	
	}

}

/*-------------------------- Subclase "Jefe" -----------------------------------------
 El modificador "final" declarado antes de la palabra "class" evita que se creen 
subclases que hereden de la clase. 
De la misma forma declarando un metodo de como "final" se evita que en otras clases
sobreescriban el metodo.
 */

class Jefe extends Empleado{															//La clase "Empleado" es la super clase o clase padre
																						//y la clase "Jefe" es una subclase y hereda las 
																					 	//propiedades y metodos de la clase Empleado	
	private double incentivo;
	
	
	public Jefe(String nom, double sue, int year, int mes, int dia){
		
		super(nom,sue,year,mes,dia);													//Llamada al constructor de la clase padre
	}
	
	public void establece_incentivo(double inc){
		
		incentivo =  inc;	
	}
	
	
	public double Devuelve_sueldo(){													//Crear un metodo con el mismo nombre que el heredado por
																						//la clase padre, sobreescribe el metodo reemplazandolo 		
																						//unicamente para esta sola clase		
		
		double sueldo_jefe = super.Devuelve_sueldo();									//Llamo al metodo de la clase padre y guardo el resultado en una variable
		return sueldo_jefe + incentivo;	
	}
	
}



