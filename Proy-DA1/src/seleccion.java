
public class seleccion {
	
	public static int select(int[] v, int k){
		System.out.print("v: ");
		for(int i=0; i<v.length; i++)
			System.out.print(v[i] + " ");
		System.out.println();
		System.out.println("Entrada: v, k:" + k);
		return selectRec(v,0,v.length-1,k);
	}
	
	private static int selectRec(int[] v, int first, int last, int k){
		
		System.out.print("v: ");
		for(int i=0; i<v.length; i++)
			System.out.print(v[i] + " ");
		System.out.println();
		
		System.out.println("Entrada selectRec: v, first:" + first + " last:" + last + " k:" + k);
		
		if(last <= first){
			System.out.println("Res. de selectRec: " + v[first]);
			return v[first];
		}
		
		int p = ordenarPivote(v,first,last);
		System.out.println("P: " + p);
		int k1 = p - first + 1;
		System.out.println("K1: " + k1);
		
		if(k <= k1)
			return selectRec(v,first,p,k);
		else
			return selectRec(v,p+1,last,k-k1);
	}
	
	private static int ordenarPivote(int[] v, int first, int last){
		
		System.out.print("v: ");
		for(int i=0; i<v.length; i++)
			System.out.print(v[i] + " ");
		System.out.println();
		
		System.out.println("Entrada ordenarPivote: v, first:" + first + " last:" + last);
		
		int p=v[first]; int i = first-1; int j = last+1;
		System.out.println("1: Piv: " + p + " i: " + i + " j: " + j);
		while (true){
			do{i++;}while (v[i]<p);
			System.out.println("--- i: " + i);
			do{j--;}while (v[j]>p);
			System.out.println("--- j: " + j);
			if(i<j){
				int aux=v[i]; v[i]=v[j]; v[j]=aux;
			}else{
				System.out.println("Res. de ordenar: " + j);
				return j;
			}
		}
	}

	public static void main(String[] args){
		int[] v = {1,0,2,4,1,0,6,7,8};
		int[] v2 = {3,1,2,4,1,2,6,7,8};
		int[] v3 = {3,1,2,4,1,3,6,7,8};
		int[] v4 = {2,36,5,21,8,13,11,20,5,4,1};


		
		System.out.println("k-esimo(5�): " + select(v,5));
		
		System.out.print("v: ");
		for(int i=0; i<v.length; i++)
			System.out.print(v[i] + " ");
		
		System.out.println();		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
		
		System.out.println("k-esimo(5�): " + select(v2,5));
		
		System.out.print("v2: ");
		for(int i=0; i<v2.length; i++)
			System.out.print(v2[i] + " ");
		
		System.out.println();		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
		
		System.out.println("k-esimo(5�): " + select(v3,5));
		
		System.out.print("v3: ");
		for(int i=0; i<v3.length; i++)
			System.out.print(v3[i] + " ");
		
		System.out.println();		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
		
		System.out.println("k-esimo(8�): " + select(v4,8));
		
		System.out.print("v4: ");
		for(int i=0; i<v4.length; i++)
			System.out.print(v4[i] + " ");
		
	}
}
