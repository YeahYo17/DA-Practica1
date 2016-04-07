import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CrearPruebas {

	public static int[] crearArray(int max){
		
		Random rnd = new Random();

		int[] a = new int[max];
		for(int i=0; i < max; i++)
			a[i] = (int)(rnd.nextDouble() * max);
		
		return a;
	}
	
	public static void main(String[] args) throws IOException{
		
		String ruta = "C:\\Users\\Kevin\\Dropbox\\Uni\\4º Año\\DA\\Practicas\\Practica 1\\Proyectos Eclipse\\Proy-DA1\\src\\";
		int[] v;
		int max = 1000000;
		
	    File archivo = new File(ruta + "Prueba" +max+ ".txt");
	    BufferedWriter bw;
	    bw = new BufferedWriter(new FileWriter(archivo));
	    
	    v = crearArray(max);
	    
	    for(int i=0; i<v.length; i++){
	    	bw.write(String.valueOf(v[i]));
	    	bw.newLine();
	    }
	    
	    bw.close();

	    System.out.println("        --- DONE! --- ");
	}
}
