
public class Insertionsort {

	/*
	public void insertionSort(int[] v){
		int j;

		for(int i=1; i < v.length; i++){
			int temp = v[i];
			
			for(j=i-1; j>=0 && temp < v[i]; j--){
				v[j+1] = v[j];
			}
			v[j+1] = temp;
		}
	}
	*/
	
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
