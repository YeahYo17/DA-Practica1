
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
    
    /*
    public static void ordenacionMonticulos(int[] v) {
        final int N = v.length;
        for(int nodo = N/2; nodo>=0; nodo--) hacerMonticulo(v, nodo, N-1);
        for(int nodo = N-1; nodo>=0; nodo--) {
            int tmp = v[0];
            v[0]    = v[nodo];
            v[nodo] = tmp;
            hacerMonticulo(v, 0, nodo-1);
        }
    }
 
    public static void hacerMonticulo(int[] v, int nodo, int fin) {
        int izq = 2*nodo+1;
        int der = izq+1;
        int may;
        if(izq>fin) return;
        if(der>fin) may=izq;
        else may= v[izq]>v[der]?izq:der;
        if(v[nodo] < v[may]) {
            int tmp = v[nodo];
            v[nodo] = v[may];
            v[may]  = tmp;
            hacerMonticulo(v, may, fin);
        }
    }
    */
    /**
    private static int total;

    private static void swap(int[] v, int a, int b)
    {
        int tmp = v[a];
        v[a] = v[b];
        v[b] = tmp;
    }

    private static void heapify(int[] v, int i)
    {
        int lft = i * 2;
        int rgt = lft + 1;
        int grt = i;

        if (lft <= total && v[lft] > v[grt]) grt = lft;
        if (rgt <= total && v[rgt] > v[grt]) grt = rgt;
        if (grt != i) {
            swap(v, i, grt);
            heapify(v, grt);
        }
    }

    public static void heapSort(int[] v){
    	int aux=0;
        total = v.length - 1;

        for (int i = total / 2; i >= 0; i--)
            heapify(v, i);

        for (int i = total; i > 0; i--) {
            aux = v[0];
            v[0] = v[i];
            v[i] = aux;
            swap(v, 0, i);
            total--;
            heapify(v, 0);
        }
    }
    **/
}
