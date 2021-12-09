public class Oficial extends Operador{

    public Oficial(String nombre){
	super(nombre);

    }

    public Oficial(){
	super();
    }

    public String trabaja(){

	return "Trabajando duro";
    }

  public String toString(){
	return "Oficial: "+this.nombre;
    }    
}
