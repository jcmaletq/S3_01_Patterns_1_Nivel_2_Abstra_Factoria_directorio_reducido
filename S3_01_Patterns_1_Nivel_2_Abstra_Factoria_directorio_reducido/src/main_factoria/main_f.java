package main_factoria;
import persona.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Factorias.*;

public class main_f {

    protected static List<String> lista_pe = new ArrayList<>();
	private static Comun_Factoria main_f() {
		Comun_Factoria factoria = null;
		String pais = null;
			pais = JOptionPane.showInputDialog("introudce el pais de la direccion o 'n' para salir","España").toLowerCase();
			if (pais.contains("españa")){
				persona per = new persona("Español");
				per.listar_persona();
				factoria = new Comun_Factoria("sp");			
				lista_pe.add(per.toString());
				lista_pe.add(factoria.toString());
			}
			if (pais.contains("francia")){
				persona per = new persona("Frances");
				per.listar_persona();				
				factoria = new Comun_Factoria("fr");
				lista_pe.add(per.toString());
				lista_pe.add(factoria.toString());
			}	
			return factoria;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String otra = "";
		Comun_Factoria app = null;
		do {	
			app = main_f();
			otra = JOptionPane.showInputDialog("introudce S para otra o 'n' para salir","S").toLowerCase();
			if (app != null) {	app.listar();}
		} while (otra.equals("s"));
		System.out.println("listado directorio entero");
	    lista_pe.forEach((n) -> System.out.println(n));
	}

}

