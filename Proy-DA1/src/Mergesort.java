import java.util.*;

public class Mergesort {

	/*
	public static void main(String[] args){
		
		Random rnd = new Random();
		int num;
		int max = 1000000;
		long start, end;

		
		int[] a = new int[max];
		for(int i=0; i < max; i++){
			num = (int)(rnd.nextDouble() * 1000000);
			a[i] = num;
		}
		*/
		/*
		System.out.println();
		System.out.println("================================");
		System.out.println(" 1.Array (a):");
		for(int i=0; i < a.length; i++){
			System.out.println(a[i]);
		}*/
		
//		start = System.nanoTime();
	//	mergeSort(a);
		//end = System.nanoTime();
/*
		System.out.println();
		System.out.println("================================");
		System.out.println(" 2.Array (a):");
		for(int i=0; i < a.length; i++){
			System.out.println(a[i]);
		}
*/		
	/*
		System.out.println();
		System.out.println("================================");
		System.out.println("        TIEMPO -- " + ( end - start ) + " ns");
		System.out.println("================================");
*/
		/*
		int[] a = {2, 6, 3, 5, 1};

		mergeSort(a);
		
		System.out.println(" Array (a):");
		for(int i=0; i < a.length; i++){
			System.out.println(a[i]);
		}
		*/
//	}

	public static void mergeSort(int[ ] v){
		int[] aux = new int[v.length];
		mergeSort(v, aux,  0,  v.length-1);
	}


	private static void mergeSort(int[ ] a, int[ ] aux, int left, int right){
		if( left < right ){
			int center = (left + right) / 2;
			mergeSort(a, aux, left, center);
			mergeSort(a, aux, center + 1, right);
			juntar(a, aux, left, center, right);
		}
	}


    private static void juntar(int[ ] v, int[ ] aux, int first, int center, int last ){
    	int right = center+1;
        int j = first;
        int len = last - first + 1;

        while( first <= center && right <= last){
        	
            if(v[first] > v[right] ){
                aux[j] = v[right];
                right++;
            }else{
                aux[j] = v[first];
                first++;
            }
            j++;
        }
        
        while(first <= center){    // Copy rest of first half
            aux[j] = v[first];
            j++; first++;
        }
        
        while(last >= right){  // Copy rest of right half
            aux[j] = v[right];
        	j++; right++;
        }
        
        // Copy aux back
        for(int i = 0; i < len; i++, last--)
            v[last] = aux[last];
        
        center = right;

    }
	
}
