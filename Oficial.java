/**
 *Clase que simula un Oficial. Es clase hija de la clase Operador.
 *@author Alcantara Estrada Kevin Isaac
 *@version 1.0
 */

public class Oficial extends Operador{
/**
 *Método constructor con parámetros. Manda a llamar al método constructor de la clase padre.
 *@author Alcantara Estrada Kevin Isaac
 *@version 1.0
 *@param nombre Parámetro que representa el nombre del directivo.
 */
    public Oficial(String nombre){
	super(nombre);

    }
/**
 *Método constructor sin parámetros. Manda a llamar al método constructor de la clase padre.
 *@author Alcantara Estrada Kevin Isaac
 *@version 1.0
 */
    public Oficial(){
	super();
    }
/**
 *Método que devuelve un mensaje diciendo que el empleado trabaja.
 *@author Alcantara Estrada Kevin Isaac
 *@version 1.0
 *@return String
 */
   
    public String trabaja(){

	return "Trabajando duro";
    }
/**
 *Método que representa al objeto como cadena de Strings.
 *@author Alcantara Estrada Kevin Isaac
 *@version 1.0
 *@return String
 */
    @Override
  public String toString(){
	return "Oficial: "+this.nombre;
    }    
}
