package entrega;

public class Insertionsort {
	
	public static void insertionSort(int[] v) {
	      int j, aux;
	      
	      for (int i = 1; i < v.length; i++) {
	    	  
	            aux = v[i];
	            j = i;
	            while ( j >= 1 && aux < v[j-1]) {
	                  v[j] = v[j-1];
	                  j--;
	            }
	            
	            v[j] = aux;
	      }
	}
}
