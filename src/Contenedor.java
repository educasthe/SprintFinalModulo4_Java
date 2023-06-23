import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Contenedor {
	
	private final List<Usuario> usuarios;
    private final List<Capacitacion> capacitaciones;

    public Contenedor() {
        usuarios = new ArrayList<>();
        capacitaciones = new ArrayList<>();
    }

    public void almacenarCliente(Cliente cliente) {
        usuarios.add(cliente);
    }

    public void almacenarProfesional(Profesional profesional) {
        usuarios.add(profesional);
    }

    public void almacenarAdministrativo(Administrativo administrativo) {
        usuarios.add(administrativo);
    }

    public void almacenarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }

    
    
    public void eliminarUsuario(int rut) {
    	boolean delete = false;
    	if (!usuarios.isEmpty()) {
	    	Iterator<Usuario> iterator = usuarios.iterator();
	        while (iterator.hasNext()) {
	            Usuario usuario = iterator.next();
	            if (usuario.getRut() == rut) {
	                iterator.remove();
	                delete = true;
	                System.out.println("Usuario eliminado: " + rut);
	            }
	        }
	        if(!delete) {
                System.out.println("Rut " + rut + " no encontrado en listado de usuarios");
	        }
        } else {
            System.out.println("ADVERTENCIA: No existen registros de usuarios para eliminar");
        }
    }
    
    

    public void listarUsuarios() {
    	if (!usuarios.isEmpty()) {
	    	for (Usuario usuario : usuarios) {
	    		System.out.println(usuario);
	    	}
        } else {
            System.out.println("ADVERTENCIA: No existen registros de usuarios");
         }

    }
    
    

    public void listarUsuariosPorTipo(String tipo) {
    	if (!usuarios.isEmpty()) {
	        for (Usuario usuario : usuarios) {
	            if (usuario instanceof Usuario) {
	                if (tipo.equalsIgnoreCase("cliente") && usuario instanceof Cliente) {
	                    System.out.println(usuario.toString());
	                } else if (tipo.equalsIgnoreCase("administrativo") && usuario instanceof Administrativo) {
	                    System.out.println(usuario.toString());
	                } else if (tipo.equalsIgnoreCase("profesional") && usuario instanceof Profesional) {
	                    System.out.println(usuario.toString());
	                }
	            }
	        }
        } else {
            System.out.println("ADVERTENCIA: No existen registros de usuarios");
        }
    }
    

    
    public void listarCapacitaciones() {
    	if (!capacitaciones.isEmpty()) {
        	for (Capacitacion capacitacion : capacitaciones) {
        		System.out.println(capacitacion);
        	}
         } else {
            System.out.println("No existen registros de capacitaciones");
         }

    }

}
