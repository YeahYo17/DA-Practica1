package entrega;

public class Selectionsort {

	public static void selectionSort(int[] v) {
	      int i, j, min, aux;
	      int max = v.length;
	      
	      for (i = 0; i < max - 1; i++){
	    	  
	            min = i;
	            for (j = i + 1; j < max; j++){
	                  if (v[j] < v[min]) min = j;
	            }
	            
	            if (min != i) {
	                aux = v[i]; v[i] = v[min]; v[min] = aux;
	            }
	      }
	}
	
}
