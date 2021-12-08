import  java.util.Random;
    import java.util.Scanner;


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
    
public static void main(String[] args){

     
    int i,x,b,y;
   

    Scanner sc = new Scanner(System.in);
	System.out.println("Escribe el número de elementos aleatorios que deseas ordenar");
	x = sc.nextInt();
	b=x;
	 int A[] = new int[x];
	y=x-1;
		for(i=0; i<=y; i++){
		    A[i]= (int)(Math.random()*100000);
		    //	System.out.println(A[i]+ " ");
		    
      	}

		quicksort(A,0,y);

		for(i=0;i<=y;i++){
		    System.out.print(A[i]+" ");
		}


    

}
}
