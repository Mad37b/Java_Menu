import java.util.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;

public class Fichero {

	String salidaFichero;

	// Crear fichero
	static final String ruta =("/");
	File ficheroMenu = new File(ruta);
	Scanner fichero = new Scanner(ficheroMenu);
	public void crearFichero(String cliente) {
		FileWriter fichero;

		try {
			fichero = new FileWriter("clientes.VDA", true);

			fichero.write(cliente);
			fichero.close();
		} catch (Exception ex) {

			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
	}
	
	
	private void leerFichero(String cliente) {
		
		try {
			while(fichero.hasNextLine()) {
				
				String linea = fichero.nextLine()
;				
			}
			
		}catch(Exception e) {
			System.out.println("Error 1 = No se ha podido leer el archivo ");
			e.printStackTrace();
		}
	}
	
	

}
