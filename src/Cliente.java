import java.util.Date;

public class Cliente extends Usuario {


    private String apellidos;
    private String telefono;
    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;


    public Cliente() {
    }



    public Cliente(String nombreUsuario, Date fechaNacimiento, int run, String apellidos, String telefono, String afp, int sistemaSalud, String direcci, String comuna) {
        super(nombreUsuario, fechaNacimiento, run);

        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direcci;
        this.comuna = comuna;
    }


    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public int getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(int sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }


    @Override
    public String toString() {
        return  "CLIENTE { Nombre = " + nombre + ", apellidos = " + apellidos +  ", telefono = " + telefono + ", AFP = " + afp +  ", sistemaSalud = " + sistemaSalud + ", direccion = " + direccion  + ", comuna = " + comuna  + ", fechaNacimiento = " + fechaNacimiento + ", rut = " + rut + "}";
    }

    public String obtenerNombre() {
        return nombre + " " + apellidos;
    }

    public void obtenerSistemaSalud() {
        if (sistemaSalud == 1) {
            System.out.println("Sistema de salud: Fonasa");
        } else if (sistemaSalud == 2) {
            System.out.println("Sistema de salud: Isapre");
        }
    }

    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Dirección: " + direccion);
        System.out.println("Comuna: " + comuna);
    }
}
