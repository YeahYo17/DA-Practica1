package entrega;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class MenoresM {
	
	/**		--- IMPORTANTE --- 
	
		Aqui hay que modificar la ruta y poner donde se tengan los archivos de prueba almacenados,
		Tambien ser� donde se guarden los archivos de salida.
	  
	 **/
	private static String ruta = "C:\\Users\\Kevin\\Dropbox\\Uni\\4� A�o\\DA\\Practicas\\Practica 1\\Proyectos Eclipse\\GitHub\\Proy-DA1\\src\\";

	/**
	 * Lee el fichero asociado al caso de prueba y devuelve en un vector su contenido,
	 * menos el primer elemento del fichero.
	 * 
	 * @param ruta -> Ruta donde se encuentra nuestro fichero que queremos leer.
	 * @return -> Vector con todos los elementos del fichero excepto el primero (elementos del vector + num. menores).
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
	
	/**
	 * NOTA: Error de comprension. Este metodo no aparece en la Memoria entregada en papel,
	 * me d� cuenta una vez ya entregada la memoria, que la salida se podr�a
	 * estar pidiendo en un fichero de texto, como el de la entrada y hice este metodo. 
	 * 
	 * Crea un archivo de texto con los 'm' menores numeros del fichero de prueba que hayamos utilizado. 
	 * 
	 * @param v -> Vector que se va a imprimir en el fichero
	 * @param m -> Los 'm' menores elementos del array 'v'
	 * @param alg -> Nombre del algoritmo que se va utilizar.
	 */
	public static void crearSalida(int[] v, int m, String alg) throws IOException{
		String nombreFich = alg+ "-" +m+ "Menores.txt";
	    File archivo = new File(ruta + nombreFich);
	    BufferedWriter bw;
	    bw = new BufferedWriter(new FileWriter(archivo));
	    	    
	    for(int i=0; i<m; i++){
	    	bw.write(String.valueOf(v[i]));
	    	bw.newLine();
	    }
	    bw.close();
	    
	    System.out.println(" --- Se ha creado el archivo correctamente. ---");
	}
	
	/**
	 * Realiza el MergeSort a un array, y lo imprime por pantalla o en un fichero,
	 * segun el parametro imp.
	 * 
	 * @param v -> Vector que se va a ordenar mediante MergeSort
	 * @param m -> Los 'm' numeros menores de 'v' que se van a imprimir.
	 * @param imp -> Metodo de impresion, '1' se escribe en fichero, en otro caso por pantalla.
	 */
	public static void ImpMergeSort(int[] v, int m, int imp) throws IOException{
		
		Mergesort.mergeSort(v);
		
		// Como se ha comentado en la NOTA del procedimiento de crearSalida,
		// esta parte no estaba anteriormente en la Memoria entregada en papel,
		// debido a un error de comprensi�n, pido disculpas.
		if(imp == 1)
			crearSalida(v,m,"MergeSort");		
		else{
			for(int i=0; i < m; i++){
				System.out.println(v[i]);
			}
		}
	}
	
	/**
	 * Realiza el InsertionSort a un array, y lo imprime por pantalla o en un fichero,
	 * segun el parametro imp.
	 * 
	 * @param v -> Vector que se va a ordenar mediante MergeSort
	 * @param m -> Los 'm' numeros menores de 'v' que se van a imprimir.
	 * @param imp -> Metodo de impresion, '1' se escribe en fichero, en otro caso por pantalla.
	 */
	public static void ImpInsertionSort(int[] v, int m, int imp) throws IOException{
				
		Insertionsort.insertionSort(v);
		
		// Como se ha comentado en la NOTA del procedimiento de crearSalida,
		// esta parte no estaba anteriormente en la Memoria entregada en papel,
		// debido a un error de comprensi�n, pido disculpas.
		if(imp == 1)
			crearSalida(v,m,"InsertionSort");
		else{
			for(int i=0; i < m; i++){
				System.out.println(v[i]);
			}
		}
	}
	
	/**
	 * Realiza el QuickSort a un array, y lo imprime por pantalla o en un fichero,
	 * segun el parametro imp.
	 * 
	 * @param v -> Vector que se va a ordenar mediante MergeSort
	 * @param m -> Los 'm' numeros menores de 'v' que se van a imprimir.
	 * @param imp -> Metodo de impresion, '1' se escribe en fichero, en otro caso por pantalla.
	 */
	public static void ImpQuickSort(int[] v, int m, int imp) throws IOException{
		
		Quicksort.quickSort(v);
		
		// Como se ha comentado en la NOTA del procedimiento de crearSalida,
		// esta parte no estaba anteriormente en la Memoria entregada en papel,
		// debido a un error de comprensi�n, pido disculpas.
		if(imp == 1)
			crearSalida(v,m,"QuickSort");
		else{
			for(int i=0; i < m; i++){
				System.out.println(v[i]);
			}
		}
	}
	
	/**
	 * Realiza el SelectionSort a un array, y lo imprime por pantalla o en un fichero,
	 * segun el parametro imp.
	 * 
	 * @param v -> Vector que se va a ordenar mediante MergeSort
	 * @param m -> Los 'm' numeros menores de 'v' que se van a imprimir.
	 * @param imp -> Metodo de impresion, '1' se escribe en fichero, en otro caso por pantalla.
	 */
	public static void ImpSelectionSort(int[] v, int m, int imp) throws IOException{
		
		Selectionsort.selectionSort(v);
		
		// Como se ha comentado en la NOTA del procedimiento de crearSalida,
		// esta parte no estaba anteriormente en la Memoria entregada en papel,
		// debido a un error de comprensi�n, pido disculpas.
		if (imp == 1)
			crearSalida(v,m,"SelectionSort");
		else{
			for(int i=0; i < m; i++){
				System.out.println(v[i]);
			}
		}
	}
	
	/**
	 * Realiza el HeapSort a un array, y lo imprime por pantalla o en un fichero,
	 * segun el parametro imp.
	 * 
	 * @param v -> Vector que se va a ordenar mediante MergeSort
	 * @param m -> Los 'm' numeros menores de 'v' que se van a imprimir.
	 * @param imp -> Metodo de impresion, '1' se escribe en fichero, en otro caso por pantalla.
	 */
	public static void ImpHeapSort(int[] v, int m, int imp) throws IOException{
		
		Heapsort.heapSort(v);

		// Como se ha comentado en la NOTA del procedimiento de crearSalida,
		// esta parte no estaba anteriormente en la Memoria entregada en papel,
		// debido a un error de comprensi�n, pido disculpas.
		if ( imp == 1)
			crearSalida(v,m,"HeapSort");
		else{
			for(int i=0; i < m; i++){
				System.out.println(v[i]);
			}
		}
	}
	
	/**
	 * Realiza el Select K-esimo a un array, y lo imprime por pantalla o en un fichero,
	 * segun el parametro imp.
	 * 
	 * @param v -> Vector que se va a ordenar mediante MergeSort
	 * @param m -> Los 'm' numeros menores de 'v' que se van a imprimir.
	 * @param imp -> Metodo de impresion, '1' se escribe en fichero, en otro caso por pantalla.
	 */
	public static void ImpSelectKesimo(int[] v, int m, int imp) throws IOException{
				
		Selectkesimo.selectKesimo(v,m);
		
		// Como se ha comentado en la NOTA del procedimiento de crearSalida,
		// esta parte no estaba anteriormente en la Memoria entregada en papel,
		// debido a un error de comprensi�n, pido disculpas.
		if( imp == 1)
			crearSalida(v,m,"SelectKesimo");
		else{
			for(int i=0; i < m; i++){
				System.out.println(v[i]);
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		Scanner scan = new Scanner(System.in);
		boolean salir = false;
		int menores = 0;
		
		System.out.print("** Introduce el nombre del fichero de pruebas a ejecutar (nombre con extension): ");
		String fichero = scan.next();
		System.out.println();
		
		String rutaFich = ruta + fichero;

		int imp;
		do{
			System.out.println("** Quieres imprimir los elementos en un archivo de texto?\n"
							 + "** - 1. Si\n"
							 + "** - 2. No");
			System.out.println("** -------------------");
			System.out.print("Introduce Numero (1,2) --> ");
			imp = Integer.parseInt(scan.next());
		System.out.println();
		}while( imp != 1 && imp != 2 );

		
		int[] aux = leerPrueba(rutaFich);
		menores = aux[aux.length-1];
		int[] v = new int[aux.length-1];

		for(int i=0; i<v.length; i++)
			v[i] = aux[i];
		
		System.out.println("** Introduce el algoritmo de 'Imprimir Menores' que quieres utilizar: \n"
						 + "** - 1. Selection Sort\n"
						 + "** - 2. Insertion Sort\n"
						 + "** - 3. Merge Sort\n"
						 + "** - 4. Quick Sort\n"
						 + "** - 5. Heap Sort\n"
						 + "** - 6. Select K-esimo\n"
						 + "** -------------------");
		System.out.print("Introduce Numero (1,2,3,4,5,6) --> ");
		int alg = Integer.parseInt(scan.next());
		System.out.println();
		
		while( salir == false){
			switch(alg){
			
			case 1: 
				ImpSelectionSort(v,menores,imp);
				salir = true;
				break;
			case 2:
				ImpInsertionSort(v,menores,imp);
				salir = true;
				break;
			case 3:
				ImpMergeSort(v,menores,imp);
				salir = true;
				break;
			case 4:
				ImpQuickSort(v,menores,imp);
				salir = true;
				break;
			case 5:
				ImpHeapSort(v,menores,imp);
				salir = true;
				break;
			case 6:
				ImpSelectKesimo(v,menores,imp);
				salir = true;
				break;
			default:
				System.out.println("   --------------------------------------------------");
				System.out.println("   --- ERROR - Opcion incorrecta, vuelva a elegir ---");
				System.out.println("   --------------------------------------------------");
				System.out.println();
				System.out.println("** Introduce el algoritmo de 'Imprimir Menores' que quieres utilizar: \n"
								 + "** - 1. Selection Sort\n"
								 + "** - 2. Insertion Sort\n"
								 + "** - 3. Merge Sort\n"
								 + "** - 4. Quick Sort\n"
								 + "** - 5. Heap Sort\n"
								 + "** - 6. Select K-esimo\n"
								 + "** -------------------");
				System.out.print("Introduce Numero (1,2,3,4,5,6) --> ");
				alg = Integer.parseInt(scan.next());	
				System.out.println();
				salir = false;
				break;
			}
		}

	}
	
}
