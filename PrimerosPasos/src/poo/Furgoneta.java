
/*----------------------------HERENCIA--------------------------*/



package poo;

public class Furgoneta extends Coche {				//La clase "Furgoneta" hereda las propiedades 				
													//y los metodos de la clase "Coche" que pasa a
													//convertirse en una superclase	
	private int capacidad_carga;
	private int plazas_extra;
	
	
	public Furgoneta (int plazas_extra, int capacidad_carga){
		
		super();									//llama al constructor de la superclase
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
		
	}
	
	public String dimeDatosFurgoneta(){
		
		return "La capacidad de carga es: " + capacidad_carga + " y las plazas son: " + plazas_extra;
	}
	
	
}
