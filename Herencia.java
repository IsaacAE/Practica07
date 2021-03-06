import java.util.Scanner;

/**
 *Clase que simula una empresa de trabajadores.
 *@author Alcantara Estrada Kevin Isaac
 *@version 1.0
 */
public class Herencia{

/**
 *Método main que presenta los trabajadores de la empresa.
 *@author Alcantara Estrada Kevin Isaac
 *@version 1.0
 *@param args
 */
    public static void main(String[] args){
	//Se crean los objetos de las distintas clases que serán utilizados en el programa
	Empleado empleado1 = new Empleado();
	Empleado empleado2 = new Empleado("Pancho Barraza");

	Operador operador1 = new Operador();
	Operador operador2 = new Operador("Valentin Elizalde");

	Directivo directivo1 = new Directivo();
	Directivo directivo2 = new Directivo("Juan Pablo");

	Oficial oficial1 = new Oficial();
	Oficial oficial2 = new Oficial("Julion Alvarez");

	Tecnico tecnico1 = new Tecnico();
	Tecnico tecnico2 = new Tecnico("Rick Sanchez");
	//Se crea un objeto de la clase Scanner para recibir datos del usuario a través de la terminal
	Scanner sc = new Scanner(System.in);
	//Se solicita al usuario que ingrese su nombre
	System.out.println("Bienvenido a tu nuevo trabajo, ¿cuál es tu nombre?\n");
	String name = sc.nextLine();
	//El objeto empleado1 modifica su atributo "nombre" por el valor dado por el usuario
	empleado1.setNombre(name);
	//Se verifica si el objeto empleado1 es igual a otro objeto de la misma clase 
	System.out.println("\nBienvenido " + empleado1.getNombre()+", revisaremos si tu nombre es igual al de alguno de nuestros otros empleados\n");
	//Según si los objetos son iguales se regresa un mensaje con el uso del if
	if(empleado1.equals(empleado2)){
	    System.out.println("Oh, vaya, tienes el mismo nombre que otro empleado, para fines prácticos ahora te diremos 'El novato'\n");
	}else{
	     System.out.println("No compartes nombre con algún otro empleado, todo bien\n");
	}
	//Se imprime en pantalla los trabajadores con los que estará el usuario
	 System.out.println("Trabajarás con las siguientes personas:\n");
	  System.out.println(empleado2.toString());
	   System.out.println(operador1.toString());
	    System.out.println(operador2.toString());
	     System.out.println(directivo1.toString());
	      System.out.println(directivo2.toString());
	       System.out.println(oficial1.toString()+" "+ oficial1.trabaja());
	      
	      System.out.println(oficial2.toString()+ " "+oficial2.trabaja());
	     
	       System.out.println(tecnico1.toString()+ " "+tecnico1.trabaja());
	      
	      System.out.println(tecnico2.toString()+" "+ tecnico2.trabaja());
	     
	      
	

       
    }

}
