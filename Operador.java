/**
 *Clase que simula un Operador. Es clase hija de la clase Empleado.
 *@author Alcantara Estrada Kevin Isaac
 *@version 1.0
 */
public class Operador extends Empleado{
/**
 *Método constructor con parámetros. Manda a llamar al método constructor de la clase padre.
 *@author Alcantara Estrada Kevin Isaac
 *@version 1.0
 *@param nombre Parámetro que representa el nombre del directivo.
 */
    public Operador(String nombre){
	super(nombre);

    }
/**
 *Método constructor sin parámetros. Manda a llamar al método constructor de la clase padre.
 *@author Alcantara Estrada Kevin Isaac
 *@version 1.0
 */
    public Operador(){
	super();
    }

/**
 *Método que genera una representación en cadena del objeto.
 *@author Alcantara Estrada Kevin Isaac
 *@version 1.0
 *@return String
 */
    @Override
  public String toString(){
	return "Operador: "+this.nombre;
    }    
}
