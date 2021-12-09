public class Operador extends Empleado{

    public Operador(String nombre){
	super(nombre);

    }

    public Operador(){
	super();
    }


  public String toString(){
	return "Operador: "+this.nombre;
    }    
}
