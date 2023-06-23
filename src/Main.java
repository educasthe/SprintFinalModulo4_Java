import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main extends Validacion{
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	Contenedor contenedor = new Contenedor();
    	
    	System.out.println("*** SPRINT FINAL MODULO 4 - GRUPO 7 ***");
    	   	
    	int opcion = 0;    	
    	while (opcion != 9) {
    		
    		System.out.println("\n----- MENU PRINCIPAL -----");
            System.out.println("1. Almacenar cliente");
            System.out.println("2. Almacenar profesional");
            System.out.println("3. Almacenar administrativo");
            System.out.println("4. Almacenar capacitacion");
            System.out.println("5. Eliminar usuario");
            System.out.println("6. Listar usuarios");
            System.out.println("7. Listar usuarios por tipo");
            System.out.println("8. Listar capacitaciones");
            System.out.println("9. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
    		
    		
    		switch (opcion) {

    		case 1:      

    			System.out.print("Ingrese el nombre del cliente: ");
    		    String nombreCliente = validarDato(scanner.nextLine(), 5, 30); 
    			System.out.print("Ingrese el apellido del cliente: ");
    		    String apellidoCliente = validarDato(scanner.nextLine(), 5, 30); 
    		    System.out.print("Ingrese el RUT del cliente sin digito verificador ni guion: ");
    		    int runCliente = validarRut(scanner.nextInt());
    		    scanner.nextLine();
    		    System.out.print("Ingrese fecha de nacimiento del cliente (DD/MM/AAAA): ");
    		    String fechaNacimiento = scanner.nextLine();
    		    while(!validarFecha(fechaNacimiento)) {
        		    System.out.print("ADVERTENCIA: Ingrese formato de fecha correcto (DD/MM/AAAA): ");
        		    fechaNacimiento = scanner.nextLine();
    		    }
    		    System.out.print("Ingrese el telefono del cliente: ");
    		    String telefono = datoObligatorio(scanner.nextLine());
    		    System.out.print("Ingrese la AFP del cliente: ");
    		    String afp = validarDato(scanner.nextLine(), 4, 30);
    		    System.out.print("Ingrese el Sistema de salud del cliente (1 para fonasa y 2 para Isapre): ");
    		    int sistSalud = scanner.nextInt();
    		    scanner.nextLine();
    		    System.out.print("Ingrese la direccion del cliente: ");
    		    String direccion = validarDato(scanner.nextLine(), 0, 70);
    		    System.out.print("Ingrese la comuna del cliente: ");
    		    String comuna = validarDato(scanner.nextLine(), 0, 50);
    	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    	            Date fechaNacimientoS;    	             
    	             try {
    	              	fechaNacimientoS = dateFormat.parse(fechaNacimiento);
    	            } catch (ParseException e) {
    	                 System.out.println("Error al parsear la fecha de ingreso. Asegurate de ingresarla en el formato correcto (DD/MM/AAAA).");
    	               break;
    	             }
    	        Cliente cliente = new Cliente (nombreCliente, fechaNacimientoS, runCliente,  apellidoCliente, telefono, afp,  sistSalud,  direccion,  comuna);		        
    		    contenedor.almacenarCliente(cliente);
    		    System.out.println("Cliente almacenado exitosamente.");
    		    break;
    		    
    		case 2:    			
    			System.out.println("Ingrese los datos del profesional:");
                System.out.print("Nombre y apellido: ");
                String nombreProfesional = validarDato(scanner.nextLine(), 5, 30);
                System.out.print("Ingrese fecha de nacimiento del cliente (DD/MM/AAAA): ");
    		    String fechaNacimientoProfesional = scanner.nextLine();
    		    while(!validarFecha(fechaNacimientoProfesional)) {
        		    System.out.print("ADVERTENCIA: Ingrese formato de fecha correcto (DD/MM/AAAA): ");
        		    fechaNacimientoProfesional = scanner.nextLine();
    		    }

                System.out.print("RUT: ");
                int runProfesional = validarRut(scanner.nextInt());
                scanner.nextLine();
                System.out.print("Titulo: ");
                String tituloProfesional = validarDato(scanner.nextLine(), 10, 50);
                System.out.print("Fecha de ingreso (DD/MM/AAAA): ");
                String fechaIngresoProfesional = scanner.nextLine();                
                dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date fechaIngresoProfesionalS;
                Date fechaNacimientoProfesionalS;
                try {
                    fechaIngresoProfesionalS = dateFormat.parse(fechaIngresoProfesional);
                } catch (ParseException e) {
                    System.out.println("Error al parsear la fecha de ingreso. Asegurate de ingresarla en el formato correcto (DD/MM/AAAA).");
                    break;
                }
                try {
                    fechaNacimientoProfesionalS = dateFormat.parse(fechaNacimientoProfesional);
                } catch (ParseException e) {
                    System.out.println("Error al parsear la fecha de ingreso. Asegurate de ingresarla en el formato correcto (DD/MM/AAAA).");
                    break;
                }

                Profesional profesional = new Profesional(nombreProfesional, fechaNacimientoProfesionalS, runProfesional,
                        tituloProfesional, fechaIngresoProfesionalS);

                contenedor.almacenarProfesional(profesional);
                System.out.println("Profesional almacenado exitosamente.");
                break;
    			
    		case 3:
    			System.out.println("Ingrese los datos del administrativo:");
                System.out.print("Nombre y apellido: ");
                String nombreAdministrativo = validarDato(scanner.nextLine(), 10, 50);
                System.out.print("Ingrese fecha de nacimiento del cliente (DD/MM/AAAA): ");
    		    String fechaNacimientoAdministrativo = scanner.nextLine();
    		    while(!validarFecha(fechaNacimientoAdministrativo)) {
        		    System.out.print("ADVERTENCIA: Ingrese formato de fecha correcto (DD/MM/AAAA): ");
        		    fechaNacimientoAdministrativo = scanner.nextLine();
    		    }

                System.out.print("RUN: ");
                int runAdministrativo = validarRut(scanner.nextInt());
                scanner.nextLine();
                System.out.print("Area: ");
                String areaAdministrativo = validarDato(scanner.nextLine(), 5, 20);
                System.out.print("Experiencia previa: ");
                String experienciaAdministrativo = validarDato(scanner.nextLine(), 0, 100);
                dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date fechaNacimientoAdministrativoS;
                try {
                    fechaNacimientoAdministrativoS = dateFormat.parse(fechaNacimientoAdministrativo);
                } catch (ParseException e) {
                    System.out.println("Error al parsear la fecha de ingreso. Asegurate de ingresarla en el formato correcto (DD/MM/AAAA).");
                    break;
                }

                Administrativo administrativo = new Administrativo(nombreAdministrativo, fechaNacimientoAdministrativoS,
                        runAdministrativo, areaAdministrativo, experienciaAdministrativo);

                contenedor.almacenarAdministrativo(administrativo);
                System.out.println("Administrativo almacenado exitosamente.");
                break;		 	

    		case 4:
    			System.out.println("Ingrese los datos de la capacitacion:");
                System.out.print("Identificador: ");
                int identificadorCapacitacion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer de entrada
                System.out.print("RUT cliente: ");
                int rutClienteCapacitacion = validarRut(scanner.nextInt());
                scanner.nextLine();
                System.out.print("Dia (lunes a domingo): ");
                String diaCapacitacion = scanner.nextLine();
                System.out.print("Hora (HH:MM): ");
                String horaCapacitacion = scanner.nextLine();
    		    while(!validarHora(horaCapacitacion)) {
        		    System.out.print("ADVERTENCIA: Ingrese formato de hora (HH:MM): ");
        		    horaCapacitacion = scanner.nextLine();
    		    }
                System.out.print("Lugar: ");
                String lugarCapacitacion = validarDato(scanner.nextLine(), 10, 50);
                System.out.print("Duracion: ");
                String duracionCapacitacion = validarDato(scanner.nextLine(), 0, 70);
                System.out.print("Cantidad de asistentes: ");
                int cantidadAsistentesCapacitacion = validarAsistentes(scanner.nextInt());
                scanner.nextLine(); 
                Capacitacion capacitacion = new Capacitacion(identificadorCapacitacion, rutClienteCapacitacion,
                        diaCapacitacion, horaCapacitacion, lugarCapacitacion, duracionCapacitacion, cantidadAsistentesCapacitacion);

                contenedor.almacenarCapacitacion(capacitacion);
                System.out.println("Capacitacion almacenada exitosamente.");
                break;  
                
                
    		case 5:
    			System.out.print("Ingrese el RUT del usuario a eliminar: ");
                int runUsuarioEliminar = scanner.nextInt();
                scanner.nextLine();
                contenedor.eliminarUsuario(runUsuarioEliminar);
                break;
                
                
    		case 6:
    			contenedor.listarUsuarios();
    			break;
    			
    			
    		case 7:
    			System.out.print("Ingrese el tipo de usuario (cliente, administrativo o profesional): ");
                String tipoUsuario = scanner.nextLine();
                contenedor.listarUsuariosPorTipo(tipoUsuario);
                break;
                
                
    		case 8:
    			contenedor.listarCapacitaciones();
    			break;
    			
    			
    		case 9:
    			System.out.println("Ha finalizado la sesion");
    			break;   			
    		}    		
    	}
    	
    	scanner.close();    	
    	
    	
    	
    	
    	
    	
    	

    }
}
