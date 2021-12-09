public class Directivo extends Empleado{

    public Directivo(String nombre){
	super(nombre);

    }

    public Directivo(){
	super();
    }


  public String toString(){
	return "Directivo: "+this.nombre;
    }    
}
