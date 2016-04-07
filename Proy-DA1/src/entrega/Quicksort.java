package entrega;

public class Quicksort {
	
	public static void quickSort(int[] v){
		quickSort(v, 0, v.length-1);
	}

	private static void quickSort(int[] v, int left, int right) {

		  int pivote = v[left]; 
                  int i=left; int j=right; 
		  int intercambiar;
		 
		  while( i < j ){   
         
		     while( v[i] <= pivote )
		    	 i++; 

		     while( v[j] > pivote ) 
		    	 j--;      
   
		     if ( i < j ) {                                            
		         intercambiar = v[i];                  
		         v[i] = v[j];
		         v[j]=intercambiar;
		     }

		   }

		   v[left] = v[j]; v[j] = pivote; 

		   if( left < j-1) quickSort(v, left, j-1);

		   if( j+1 < right) quickSort(v, j+1, right);
	}
	
}
