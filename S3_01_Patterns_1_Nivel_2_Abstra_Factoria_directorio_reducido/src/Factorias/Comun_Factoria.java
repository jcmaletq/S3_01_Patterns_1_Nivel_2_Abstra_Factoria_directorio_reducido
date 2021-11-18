package Factorias;
import direccion.*;
import telefono.*;

public class Comun_Factoria implements Directorio_Factoria{
	private Int_Telefonos telefono;
    private Int_Direccion direccion;
	  
	public Comun_Factoria (String pais) {
		telefono = crear_telefono(pais);
		direccion = crear_direccion(pais);
	}

	@Override
	public Int_Telefonos crear_telefono (String pais) {
		// TODO Auto-generated method stub
		Int_Telefonos result = null;
		if (pais.equals("sp")) { result = new Sp_Telef();}
		else if (pais.equals("fr")) { result = new Fr_Telef();}
     return result;
	}
	@Override
	public Int_Direccion crear_direccion(String pais) {
		// TODO Auto-generated method stub
		Int_Direccion result = null;
		if (pais.equals("sp")) { result = new Sp_Direc();}
		else if (pais.equals("fr")) { result = new Fr_Direc();}
     return result;
	}

	@Override
	public String toString() {
return  this.telefono.toString() + " " +this.direccion.toString();
	}
		
	public void listar() {
		 telefono.listar_telefono();
		 direccion.listar_direccion();
	 }	
	

}
