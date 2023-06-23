import java.util.Calendar;
import java.util.Date;

public class Usuario implements IAsesoria{

    protected String nombre;
    protected Date fechaNacimiento;
    protected int rut;

    public Usuario() {
    }

    public Usuario(String nombre, Date fechaNacimiento, int rut) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run='" + rut + '\'' +
                '}';
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Nombre Usuario: " + nombre);
        System.out.println("RUN: " + rut);
    }

    public void mostrarEdad() {
        int edad=  obtenerEdad();
         System.out.println("El usuario tiene "+ edad + " años");
     }

     public int obtenerEdad() {
         Calendar fechaNacimientoCal = Calendar.getInstance();
         fechaNacimientoCal.setTime(fechaNacimiento);

         Calendar fechaActual = Calendar.getInstance();

         int edad = fechaActual.get(Calendar.YEAR) - fechaNacimientoCal.get(Calendar.YEAR);

         // Verificar si aún no se ha cumplido el cumpleaños en el año actual
         if (fechaNacimientoCal.get(Calendar.MONTH) > fechaActual.get(Calendar.MONTH) ||
                 (fechaNacimientoCal.get(Calendar.MONTH) == fechaActual.get(Calendar.MONTH) &&
                         fechaNacimientoCal.get(Calendar.DAY_OF_MONTH) > fechaActual.get(Calendar.DAY_OF_MONTH))) {
             edad--;
         }

         return edad;
     }
}
