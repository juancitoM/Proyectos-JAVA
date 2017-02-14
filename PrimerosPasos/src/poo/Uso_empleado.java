package poo;

public class Uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Jefe jefe_sistemas = new Jefe("Juan",35000,2017,5,26);
		
		jefe_sistemas.establece_incentivo(10000);
		
		Empleado misEmpleados[] = new Empleado[3];
		
		
		misEmpleados[0] = new Empleado("Jorge",2000,2016,3,12);
		
		misEmpleados[1] = jefe_sistemas;															//Polimorfismo, principio de 
																									//sustitucion. Se puede utlizar un 		
		misEmpleados[2] = new Jefe("Carlos",60000,2005,5,22);										//objeto de una subclase siempre que 
																									//el programa espere un objeto de la superclase
																									//Utilizar la regla de "Es un..."
		Jefe jefe_operaciones = (Jefe)misEmpleados[2];
		
		jefe_operaciones.establece_incentivo(12000);

		for(Empleado e:misEmpleados){
			e.Aumenta_sueldo(15);
		}
		
		
		for(Empleado e: misEmpleados){
			System.out.println("Nombre: " + e.Devuelve_nombre() 
								+ " sueldo " + e.Devuelve_sueldo()
								+ " Fecha de alta " + e.Devuelve_fechaContrato());
		}
		
		
	}

}
