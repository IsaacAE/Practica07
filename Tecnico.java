public class Tecnico extends Operador{

    public Tecnico(String nombre){
	super(nombre);

    }

    public Tecnico(){
	super();
    }

    public String trabaja(){

	return "Durando en el trabajo";
    }

  public String toString(){
	return "Tecnico: "+this.nombre;
    }    
}
