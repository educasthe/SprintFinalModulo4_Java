import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Validacion {
	
	// VALIDAR FORMATO DE FECHAS
	public static boolean validarFecha(String fecha) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false); // Desactiva el modo permisivo

        try {
            df.parse(fecha);
            return true; // La fecha es válida
        } catch (ParseException e) {
            return false; // La fecha es inválida
        }
    }
		

	
		// VALIDAR DATO OBLIGATORIO
	public static String datoObligatorio(String texto) {
		 Scanner scan = new Scanner(System.in);
		while  (texto == "" ){
			System.out.println("ADVERTENCIA: dato obligatorio");			
			texto = scan.nextLine();
		}		
		return texto;
	}
	
	
	
	// VALIDAR RUT
	public static int validarRut(int num) {
		 Scanner scan = new Scanner(System.in);
		while  (num <= 0 || num > 99999999 ){
			System.out.println("ADVERTENCIA: RUT debe ser un numero entero menor a 99.999.999");			
			num = scan.nextInt();
		}		
		return num;
	}
	
	
	
	//VALIDAR RANGO DE EDAD
	public static int validarEdad(int num) {
		 Scanner scan = new Scanner(System.in);
		while  (num < 0 || num > 150 ){
			System.out.println("ADVERTENCIA: la edad debe estar definida entre 0 y 150");			
			num = scan.nextInt();
		}		
		return num;
	}
	
	
	
	// VALIDAR CANTIDAD DE ASISTENTES
	public static int validarAsistentes(int texto) {
		 Scanner scan = new Scanner(System.in);
		while  (!(texto >= 0) || !(texto <= 1000)){
			System.out.println("ADVERTENCIA: la cantidad debe ser menor que 1000");			
			texto = scan.nextInt();
		}		
		return texto;
	}
	
	
	// USADO PARA VALIDAR LONGITUD DE DATOS
	public static String validarDato(String texto, int min, int max) {
		 Scanner scan = new Scanner(System.in);
		while  (texto == "" || texto.length() < min || texto.length() > max){
			if (texto == "") {
				System.out.println("ADVERTENCIA: dato obligatorio");				
			} else if (texto.length() < min) {
				System.out.println("ADVERTENCIA: el texto debe tener al menos "+ String.valueOf(min) +" caracteres");				
			} else {
				System.out.println("ADVERTENCIA: el texto debe tener maximo "+ String.valueOf(max) +" caracteres");				
			}			
			texto = scan.nextLine();
		}		
		return texto;
	}
	
	
	
	public static boolean validarHora(String hora) {
        String formatoHora = "HH:mm";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(formatoHora);
            sdf.setLenient(false);
            sdf.parse(hora);
            return true; // La hora es válida
        } catch (ParseException e) {
            return false; // La hora es inválida
        }
    }
	
		
	

}
