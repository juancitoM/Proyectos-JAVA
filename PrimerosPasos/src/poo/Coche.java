package poo;

public class Coche {
	
	private int ruedas;						//Con el modificador de acceso						
	private int largo;						//"private" se evita que se acceda a la 			
	private int ancho;						//propiedad desde otro lugar que no sea la 
	private int motor;						//clase, pero si se puede acceder dentro de
	private int peso_chasis;						//la misma clase
	private int peso_total;
	private String color;
	private boolean asiento_cuero, climatizador;
	private int precio;
	
	public Coche(){
		
		ruedas = 4;
		largo = 2000;
		ancho = 200;
		motor = 1600;
		peso_chasis = 500;
		
	}
	
	public String devuelve_datosGenerales(){						//Metodo Getter, siempre devuelve 
																	//un valor de alguna propiedad
		return "El largo del coche es " + largo/1000 +
				"m. Cantidad de ruedas " + ruedas +
				". El ancho del coche es " + ancho +
				"cm. Tiene un motor de " + motor + "cc "+
				". El peso del chasis es de " + peso_chasis + "Kg"; 
	}
	
	public String devuelve_color(){
		return "El color del coche es " + color;
	}
	
	public void establece_color(String color_coche){						//Metodo Setter, no devuelve ningun valor
		color = color_coche;
		//color = "azul";
	}
	
	public void establece_asientos_cuero(String asientos_cuero){
		
		if(asientos_cuero.equalsIgnoreCase("si")){
			this.asiento_cuero = true;
		}else{
			this.asiento_cuero = false;
		}
		
	}
	
	public String devuelve_asientos(){
		if(asiento_cuero){
			return "El coche tiene asientos de cuero";
		}else{
			return "El coche no tiene asientos de cuero";
		}
	}
	
	public void establece_climatizador(String climatizador){
		
		if(climatizador.equalsIgnoreCase("si")){
			this.climatizador = true;
		}else{
			this.climatizador = false;
		}
	}
	
	public String devuelve_climatizador(){
		
		if(climatizador){
			return "El coche tiene climatizador";
		}else{
			return "El coche no tiene climatizador";
		}
	}
	
	public String devuelve_peso_total(){				//Metodo setter y getter al mismo tiempo (no es recomendable)
		
		peso_total += (peso_chasis + 1000 );
		if(asiento_cuero){
			peso_total += 50;
		}else{
			peso_total += 20;
		}
		
		if(climatizador){
			peso_total += 70;
		}
		return "El peso total del coche es " + peso_total;
	}
	
	public String devuelve_precio(){
		
		precio += 20000;
		if(asiento_cuero){
			precio += 40000;
		}else{
			peso_total += 20000;
		}
		
		if(climatizador){
			precio += 20000;
		}
		return "El precio total del coche es " + precio;
	
	}

}
