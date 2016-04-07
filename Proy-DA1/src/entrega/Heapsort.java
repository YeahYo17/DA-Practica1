package entrega;

public class Heapsort {
	
    public static void heapSort(int[] v) {
        int max = v.length;
        int aux = 0;
        
        for(int i = max / 2; i >= 0; i--) 
        	makeHeap(v, i, max-1);
        
        for(int i = max-1; i >= 0; i--) {
            aux = v[0]; v[0] = v[i]; v[i] = aux;
            makeHeap(v, 0, i-1);
        }
    }
 
    public static void makeHeap(int[] v, int i, int last) {
        int left = 2*i+1;
        int right = left+1;
        int j,aux;
        
        if(left > last) 
        	return;
        
        if( right > last) 
        	j = left;
        else{
        	if (v[left] > v[right])
            	j = left;
        	else
            	j = right;
        }
        
        if(v[i] < v[j]) {
            aux = v[i]; v[i] = v[j]; v[j] = aux;
            makeHeap(v, j, last);
        }
    }
    
}
