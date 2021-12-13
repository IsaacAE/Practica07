/**
*Clase que simula un empleado.
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*/

public class Empleado{
    //Atributo que representa el nombre del empleado
    protected String nombre;

    /**
*Metodo constructor sin parametros que permite crear un objeto de la clase empleado con valores predeterminados en sus atributos.
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*/
    public Empleado(){
	
	nombre="Alan Brito";
    }
 /**
*Metodo constructor con parametros que permite crear un objeto de la clase empleado dándole valor a sus atributos.
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@param nombre parámetro que representa el nombre del empleado
*/
    public Empleado(String nombre){
	this.nombre=nombre;

    }

     /**
*Metodo que sirve para obtener el valor del atributo "nombre" de un objeto de la clase empleado.
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@return String
*/
    public String getNombre(){
	return this.nombre;
    }

         /**
*Metodo que sirve para modificar el valor del atributo "nombre" de un objeto de la clase empleado.
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@param nombre parámetro que representa el nombre del empleado
*/

    public void setNombre(String nombre){
	this.nombre=nombre;
    }

    
     /**
*Metodo que muestra el objeto en cadena.
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@return String
*/

   @Override
    public String toString(){
	return "Empleado: "+this.nombre;
    }

         /**
*Metodo que sirve para comparar dos objetos de la clase y determinar si son iguales.
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@param x parámetro que representa un objeto de la clase empleado.
*@return boolean 
*/

    public boolean equals(Object x){
	Empleado y = (Empleado) x;
	boolean igual=true;
	igual=igual && this.nombre.equals(y.getNombre());
	return igual;
    }

}
