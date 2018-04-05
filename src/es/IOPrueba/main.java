package es.IOPrueba;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileWriter file = null;
		PrintWriter pw = null;
		
		String nombreFichero = "fichero.txt";
		
		System.out.println("Escribiendo en el fichero");
		
		try {
			
			//el true se puede añadir para que cuando pintemos en el fichero, si hay datos que no machaque no que haya sino que lo añada
			
			file = new FileWriter (nombreFichero,true);
			pw = new PrintWriter (file);
			
			pw.println("Escribe aquí");
			pw.close();
			
		} catch (IOException e) {
			System.out.println("Ha habido un error");
			e.printStackTrace();
			pw.close();
		}
		
		System.out.println("Escritura terminada");
		
	}

}
