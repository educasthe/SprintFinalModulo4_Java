import java.util.Date;

public class Administrativo extends Usuario{

   private String area;
   private String experienciaPrevia;

   public Administrativo() {
   }

   public Administrativo(String nombreUsuario, Date fechaNacimiento, int run) {
      super(nombreUsuario, fechaNacimiento, run);
   }

   public Administrativo(String area, String experienciaPrevia) {
      this.area = area;
      this.experienciaPrevia = experienciaPrevia;
   }

   public Administrativo(String nombreUsuario, Date fechaNacimiento, int run, String area, String experienciaPrevia) {
      super(nombreUsuario, fechaNacimiento, run);
      this.area = area;
      this.experienciaPrevia = experienciaPrevia;
   }

   public String getArea() {
      return area;
   }

   public void setArea(String area) {
      this.area = area;
   }

   public String getExperienciaPrevia() {
      return experienciaPrevia;
   }

   public void setExperienciaPrevia(String experienciaPrevia) {
      this.experienciaPrevia = experienciaPrevia;
   }

   @Override
   public String toString() {
      return "ADMINISTRATIVO {" + "area = " + area + ", experienciaPrevia = " + experienciaPrevia + ", nombreUsuario = " + nombre + ", fechaNacimiento = " + fechaNacimiento + ", run = " + rut + " }";
   }

   public void analizarUsuario() {
      super.analizarUsuario();
      System.out.println("Área: " + area);
      System.out.println("Experiencia previa: " + experienciaPrevia);
   }
}
