import java.text.SimpleDateFormat;
import java.util.Date;

public class Profesional extends Usuario{

    private String titulo;
    private Date fechaIngreso;

    public Profesional() {
    }

    public Profesional(String titulo, Date fechaIngreso) {
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public Profesional(String nombreUsuario, Date fechaNacimiento, int run, String titulo, Date fechaIngreso) {
        super(nombreUsuario, fechaNacimiento, run);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "PROFESIONAL {" +
                "titulo = " + titulo + ", fechaIngreso = " + fechaIngreso + ", nombreUsuario = " + nombre +", fechaNacimiento = " + fechaNacimiento + ", rut = " + rut +" }";
    }

    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de ingreso: " + formatDate(fechaIngreso));
    }

    private String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }
}
