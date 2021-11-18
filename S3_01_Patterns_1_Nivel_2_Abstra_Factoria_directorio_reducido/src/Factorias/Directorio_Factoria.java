package Factorias;
import direccion.*;

import telefono.*;
public interface Directorio_Factoria {
	  
	Int_Telefonos crear_telefono(String pais);
	Int_Direccion crear_direccion(String pais);	
}
