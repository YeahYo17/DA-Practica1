import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class MenoresM {

	public static void Tiempo(long l){
		
		System.out.println();
		System.out.println("================================");
		System.out.println("     TIEMPO -- " + l + " ns");
		System.out.println("================================");
		System.out.println();

	}
	

	/**
	 * Entrada:
	 * @param ruta -> Ruta donde se encuentra nuestro fichero que queremos leer.
	 * @return -> Vector con todos los elementos del fichero excepto el primero (elemntos del vector + menores).
	 */
	public static int[] leerPrueba(String ruta) throws IOException{
		int texto; int max;
		int i=0;
				
		FileReader fr = new FileReader(ruta);
		BufferedReader br = new BufferedReader(fr);
		
		max = Integer.parseInt(br.readLine());
		int[] vecElements = new int[max+1];
		while( i < max+1 ){
			texto = Integer.parseInt(br.readLine());
			vecElements[i] = texto;
			i++;
		}
		br.close();
		
		return vecElements;
	}
	
	public static int[] mezclar(int[] v){
		int semilla; int aux;
		int max= v.length-1;
		
		for (int i=max; i >= 0; i--){ 
		  semilla = (int)Math.floor(i*Math.random()); 
		  aux = v[i]; 
		  v[i] = v[semilla]; 
		  v[semilla] = aux; 
		}
		
		return v;
	}
	
	public static void ImpMergeSort(int[] v, int num){
		
		System.out.println("MergeSort");

		Mergesort.mergeSort(v);
		
		for(int i=0; i < num; i++){
			System.out.println(v[i]);
		}
	}
	
	public static void ImpInsertionSort(int[] v, int num){
		
		System.out.println("InsertionSort");
		
		Insertionsort.insertionSort(v);
		
		for(int i=0; i < num; i++){
			System.out.println(v[i]);
		}
	}
	
	public static void ImpQuickSort(int[] v, int num){
		System.out.println("QuickSort");
		
		Quicksort.quickSort(v);
		
		for(int i=0; i < num; i++){
			System.out.println(v[i]);
		}
	}
	
	public static void ImpSelectionSort(int[] v, int num){
		System.out.println("SelectionSort");
		
		Selectionsort.selectionSort(v);
		
		for(int i=0; i < num; i++){
			System.out.println(v[i]);
		}
	}
	
	public static void ImpHeapSort(int[] v, int num){
		System.out.println("HeapSort");
		
		Heapsort.heapSort(v);
		//Heapsort.ordenacionMonticulos(v);

		for(int i=0; i < num; i++){
			System.out.println(v[i]);
		}
	}
	
	public static void ImpSelectKesimo(int[] v, int num){
		
		System.out.println("SelectK-esimo");
		
		Selectkesimo.selectKesimo(v,num);
		
		for(int i=0; i < num; i++){
			System.out.println(v[i]);
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		Scanner scan = new Scanner(System.in);
		
		boolean salir = false;
		int menores = 0;
		long start, end;
		
		System.out.print("** Introduce el numero de elementos: ");
		/**
		System.out.println("** Introduce el numero de elementos: ");
		System.out.println("** - 10");
		System.out.println("** - 100");
		System.out.println("** - 1000");
		System.out.println("** - 10000");
		System.out.println("** - 100000");
		System.out.println("** - 1000000");
		System.out.println("** -------------------");
		System.out.print("Introduce Numero --> ");
		**/
		int num = Integer.parseInt(scan.next());
		System.out.println();

		String fichero = "Prueba" + num;
		String ruta = "C:\\Users\\Kevin\\Dropbox\\Uni\\4� A�o\\DA\\Practicas\\Practica 1\\Proyectos Eclipse\\Proy-DA1\\src\\" + fichero + ".txt";
		
		int[] aux = leerPrueba(ruta);
		menores = aux[aux.length-1];
		int[] v = new int[aux.length-1];

		for(int i=0; i<v.length; i++)
			v[i] = aux[i];
		
		System.out.println("** Introduce el algoritmo de 'Imprimir Menores' que quieres utilizar: ");
		System.out.println("** - 1. Selection Sort");
		System.out.println("** - 2. Insertion Sort");
		System.out.println("** - 3. Merge Sort");
		System.out.println("** - 4. Quick Sort");
		System.out.println("** - 5. Heap Sort");
		System.out.println("** - 6. Select K-esimo");
		System.out.println("** -------------------");
		System.out.print("Introduce Numero (1,2,3,4,5,6) --> ");
		int alg = Integer.parseInt(scan.next());
		System.out.println();
		
		while( salir == false){
			switch(alg){
			
			case 1: 
				start = System.nanoTime();
				ImpSelectionSort(v,menores);
				end = System.nanoTime();
				
				Tiempo(end-start);
				mezclar(v);
				salir = true;
				break;
			case 2:
				start = System.nanoTime();
				ImpInsertionSort(v,menores);
				end = System.nanoTime();
				
				Tiempo(end-start);
				mezclar(v);
				salir = true;
				break;
			case 3:
				start = System.nanoTime();
				ImpMergeSort(v,menores);
				end = System.nanoTime();
				
				Tiempo(end-start);
				mezclar(v);
				salir = true;
				break;
			case 4:
				start = System.nanoTime();
				ImpQuickSort(v,menores);
				end = System.nanoTime();
				
				Tiempo(end-start);
				mezclar(v);
				salir = true;
				break;
			case 5:
				start = System.nanoTime();
				ImpHeapSort(v,menores);
				end = System.nanoTime();
				
				Tiempo(end-start);
				mezclar(v);
				salir = true;
				break;
			case 6:
				start = System.nanoTime();
				ImpSelectKesimo(v,menores);
				end = System.nanoTime();
				
				Tiempo(end-start);
				mezclar(v);
				salir = true;
				break;
			default:
				System.out.println("   --------------------------------------------------");
				System.out.println("   --- ERROR - Opcion incorrecta, vuelva a elegir ---");
				System.out.println("   --------------------------------------------------");
				System.out.println();
				System.out.println("** Introduce el algoritmo de 'Imprimir Menores' que quieres utilizar: ");
				System.out.println("** - 1. Selection Sort");
				System.out.println("** - 2. Insertion Sort");
				System.out.println("** - 3. Merge Sort");
				System.out.println("** - 4. Quick Sort");
				System.out.println("** - 5. Heap Sort");
				System.out.println("** - 6. Select K-esimo");
				System.out.println("** -------------------");
				System.out.print("Introduce Numero (1,2,3,4,5,6) --> ");
				alg = Integer.parseInt(scan.next());	
				System.out.println();
				salir = false;
				break;
			}
		}

	}
	
}
