import  java.util.Random;
    import java.util.Scanner;

/**
 *Programa que sirve para ordenar un arreglo de números de menor a mayor usando distintos métodos.
 *@author Alcantara Estrada Kevin Isaac
 *@version 1.0
 */
public class Ordenamientos{
    
    private static int particion(int arreglo[], int izquierda, int derecha) {
        int pivote = arreglo[izquierda];

// Ciclo infinito
        while (true) {
            while (arreglo[izquierda] < pivote) {
                izquierda++;
            }
            while (arreglo[derecha] > pivote) {
                derecha--;
            }
            if (izquierda >= derecha) {
                return derecha;
            } else {//Nota: yo sé que el else no hace falta por el return de arriba, pero así el algoritmo es más claro
                int temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;
                izquierda++;
                derecha--;
            }
            // El while se repite hasta que izquierda >= derecha
        }
    }

    private static void quicksort(int arreglo[], int izquierda, int derecha) {
    if (izquierda < derecha) {
        int indiceParticion = particion(arreglo, izquierda, derecha);
        quicksort(arreglo, izquierda, indiceParticion);
        quicksort(arreglo, indiceParticion + 1, derecha);
    }
}


         /**
*Metodo que sirve pbara ordenar los elementos de un arreglo de menor a mayor usando el algoritmo buble sort.
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@param arreglo[] Parámetro que representa el arreglo de números enteros a ordenar
*/

    public static void bubblesort(int arreglo[]){
	//Se declaran variables que servirán para el método
	int i,num_aux;
	boolean cambiado;
	//Abrimos un ciclo while que, por la condición, se ejecutará de forma infinita
	while(true){
	    //Asignamos el valor de falso a la variable cambios
	    cambiado=false;
	    
	    for(i=1;i<arreglo.length;i++){
		if(arreglo[i]<arreglo[i-1]){
		    num_aux=arreglo[i];
		    arreglo[i]=arreglo[i-1];
		    arreglo[i-1]=num_aux;
		    cambiado=true;
		}

	    }
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
	//Menú para que el usuario seleccione el agoritmo a utilizar
		System.out.println("Elige qué método de ordenamineto desea utilizar \n1.Quick Sort \n2.Bubble Sort");
		resp=sc.nextInt();
		//Ciclo para generar los números aleatorios
	for(i=0; i<=y; i++){
		    A[i]= (int)(Math.random()*rango);
		    
		    
      	}
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
