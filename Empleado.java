public class Empleado{

    protected String nombre;

    public Empleado(){
	
	nombre="Alan Brito";
    }

    public Empleado(String nombre){
	this.nombre=nombre;

    }

    public String getNombre(){
	return this.nombre;
    }

    public void setNombre(String nombre){
	this.nombre=nombre;
    }

    public String toString(){
	return "Empleado: "+this.nombre;
    }

    public boolean equals(Object x){
	Empleado y = (Empleado) x;
	boolean igual=true;
	igual=igual && this.nombre.equals(y.getNombre());
	return igual;
    }

}
