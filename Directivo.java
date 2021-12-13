/**
 *Clase que simula un Directivo. Es clase hija de la clase Empleado.
 *@author Alcantara Estrada Kevin Isaac
 *@version 1.0
 */

public class Directivo extends Empleado{
/**
 *Método constructor con parámetros. Manda a llamar al método constructor de la clase padre.
 *@author Alcantara Estrada Kevin Isaac
 *@version 1.0
 *@param nombre Parámetro que representa el nombre del directivo.
 */
    public Directivo(String nombre){
	super(nombre);

    }
/**
 *Método constructor sin parámetros. Manda a llamar al método constructor de la clase padre.
 *@author Alcantara Estrada Kevin Isaac
 *@version 1.0
 */
    public Directivo(){
	super();
    }

/**
 *Método que representa al objeto como cadena de Strings.
 *@author Alcantara Estrada Kevin Isaac
 *@version 1.0
 *@return String
 */
    @Override
  public String toString(){
	return "Directivo: "+this.nombre;
    }    
}
