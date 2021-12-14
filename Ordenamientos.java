import  java.util.Random;
    import java.util.Scanner;

/**
 *Programa que sirve para ordenar un arreglo de números de menor a mayor usando distintos métodos.
 *@author Alcantara Estrada Kevin Isaac
 *@version 3.0
 */
public class Ordenamientos{
    //Variable global auxiliar para intercambiar la posición entre elementos de un arreglo
    static int num_aux;

    /**
 *Método que ordena un arreglo de números enteros aplicando el algoritmo 
 *@author Alcantara Estrada Kevin Isaac
 *@version 1.0
 *@param array Es el arreglo a ordenar
 *@param inicio Indice del primer elemento del arreglo
 *@param ultimo Indice del ultimo elemento del arreglo
 */    
public static void quicksort(int[] array,int inicio,int ultimo){
    //Declaramos variables auxiliares
    int indice_izq,indice_der,pivote;
    //Caso base de nuestra recursión
     if(inicio>ultimo){
            return;
	    }
     //Asignación de valores a nuestras variables auxiliares
        indice_izq=inicio;
        indice_der=ultimo;
	//Primero se hará el ordenamiento tomando como base el valor de la variable pivote, que será el valor del primer elemento del arreglo
        pivote = array[inicio];
	//El ciclo se realizará hasta que nuestras variables auxiliares sen encuentre
        while (indice_der>indice_izq) {
                         // Buscamos un valor que sea menor que nuestro pivote desde el último elemento de nuestro arreglo y hacia la izquierda
            while (indice_izq<indice_der&&pivote<=array[indice_der]) {
                indice_der--;
            }
                         //Partiendo desde el primer elemento de nuestro arreglo, buscamos un elemento que sea mayor que el valor de nuestro pivote y seguimos la búsqueda hacia la derecha
            while (pivote>=array[indice_izq]&&indice_izq<indice_der) {
                indice_izq++;
            }
            // Una vez que hemos encontrado los elementos que buscábamos, si el elemento que buscamos desde la izquierda esta a la derecha del que buscamos por la derecha, intercambiamos los valores de dichos elementos en el arreglo
            if (indice_izq<indice_der) {
                num_aux = array[indice_der];
                array[indice_der] = array[indice_izq];
                array[indice_izq] = num_aux;
            }
 
        }
                 // Finalmente, al encontrarse nuestros indices auxiliares, intercambiamos el valor nuestro pivote (el valor del primer elemento del arreglo) por el valor del elemento del arreglo en el cual se encontraron nuestros indices auxiliares
         array[inicio] = array[indice_izq];
         array[indice_izq] = pivote;
	 //NOTA: de esta manera ya tenemos el pivote ubicado en el lugar que le corresponde en el arreglo y, a su derecha, los elementos mayores a este y, a su izquierda, los valores menores a esta


	 //COMENZAMOS LAS LLAMADAS RECURSIVAS

	   //Ordenamos los números que están a la izquierda de nuestro pivote 
        quicksort(array, inicio, indice_der-1);
                 //Ordenamos los números que están a la derecha de nuestro pivote
        quicksort(array, indice_der+1, ultimo);
    }


         /**
*Metodo que sirve pbara ordenar los elementos de un arreglo de menor a mayor usando el algoritmo buble sort.
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@param arreglo[] Parámetro que representa el arreglo de números enteros a ordenar
*/

    public static void bubblesort(int arreglo[]){
	//Se declaran variables que servirán para el método
	int i;
	boolean cambiado;
	//Abrimos un ciclo while que, por la condición, se ejecutará de forma infinita, para que el ordenamiento se realice para cada uno de los elementos del arreglo
		while(true){
	    //Asignamos el valor de falso a la variable cambios
	 cambiado=false;
	//Este for hace que el número de mayor valor del arreglo quede en la última posición
	    for(i=1;i<arreglo.length;i++){
		//Si el número de la izquierda es mayor al de la derecha, intercambian lugares
		if(arreglo[i]<arreglo[i-1]){
		    num_aux=arreglo[i];
		    arreglo[i]=arreglo[i-1];
		    arreglo[i-1]=num_aux;
		    //Si no se realizan más cambios quiere decir que el arreglo ya está ordenado y cambiado se quedará como false
		    cambiado=true;
		}

	    }
	    //Si no se han realizado cambios entonces el arreglo está ordenado y con esta instrucción se rompe el ciclo para que no se ejecute infinitamente
	      if(cambiado==false){
	    	break;
	     }
	    	}
    }


         /**
*Metodo main que sirve para probar los dos algoritmos de ordenamiento.
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@param args
*/

public static void main(String[] args){

    //Se declaran variables auxiliares para el buen funcionamiento del programa.
    int resp,rango,i,x,b,y;
   
    //Creación de un objeto de la clase Scanner para recibir datos por consola
    Scanner sc = new Scanner(System.in);

    //Se solicita el numero de elementos aleatorios que quiere ordenar el usuario
	System.out.println("Escribe el número de elementos aleatorios que deseas ordenar");
	x = sc.nextInt();
	b=x;
	//Se crea un arreglo de enteros para guardar dichos numeros aleatorios
	 int A[] = new int[x];
	y=x-1;
	
	//Se solicita al usuario que indique desde 0 hasta que rango quiere que sea el valor de los elementos a ordenar
			System.out.println("Escribe el máximo para el rango de números enteros en el cuál quieres que se generen números aleatorios");
			
	rango = sc.nextInt();
		for(i=0; i<=y; i++){
		    A[i]= (int)(Math.random()*rango);
		    
		    
      	}
	       

	//Menú para que el usuario seleccione el agoritmo a utilizar
		System.out.println("Elige qué método de ordenamineto desea utilizar \n1.Quick Sort \n2.Bubble Sort");
		resp=sc.nextInt();
		//Ciclo para generar los números aleatorios

	//Estrcutura de control para usar los distintos algoritmos de ordenamientos según sea el caso
		switch(resp){

		case 1:
		    quicksort(A,0,y);
		    //Bucle para imprimir los números en pantalla
		for(i=0;i<=y;i++){
		    System.out.print(A[i]+" ");
		}
		break;

	       	case 2:
		    bubblesort(A);
		    //Bucle para imprimir los números en pantalla
		for(i=0;i<=y;i++){
		    System.out.print(A[i]+" ");
		}
		break;

		default: System.out.println("Esa no es una opción válida");
		    break;
		}


    

}
}
