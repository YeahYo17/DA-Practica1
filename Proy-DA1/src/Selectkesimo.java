
public class Selectkesimo {
	
	public static int selectKesimo(int[] v, int m){
		int max = v.length-1;
		
		return selectKesimo(v, 0, max, m);
	}
	
	private static int selectKesimo(int[] v, int first, int last, int m){
		int piv, pmayor;
		
		if(last <= first){
			return v[first];
		}
		
		piv = sort(v,first,last); pmayor = piv - first + 1;
		if(m <= pmayor) return selectKesimo(v, first, piv, m);
		else return selectKesimo(v, piv+1, last, m-pmayor);
	}
	
	private static int sort(int[] v, int first, int last){
		
		int p=v[first]; int i = first-1; int j = last+1;
		int aux;
		
		while (true){
			
			do{ i++; } while ( v[i] < p );
			do{ j--; } while ( v[j] > p );
			
			if( i < j ){
				aux=v[i]; v[i]=v[j]; v[j]=aux;
			}else return j;
		}
	}

}
