import java.util.Date;

public class Accidente {
   private int identificadorAccidente;
   private String rutCliente;
   private Date dia;
   private String hora;
   private String lugar;
   private String comentarios;

   public Accidente() {
   }

   public Accidente(int identificadorAccidente, String rutCliente, Date dia, String hora, String lugar, String comentarios) {
      this.identificadorAccidente = identificadorAccidente;
      this.rutCliente = rutCliente;
      this.dia = dia;
      this.hora = hora;
      this.lugar = lugar;
      this.comentarios = comentarios;
   }

   public int getIdentificadorAccidente() {
      return identificadorAccidente;
   }

   public void setIdentificadorAccidente(int identificadorAccidente) {
      this.identificadorAccidente = identificadorAccidente;
   }

   public String getRutCliente() {
      return rutCliente;
   }

   public void setRutCliente(String rutCliente) {
      this.rutCliente = rutCliente;
   }

   public Date getDia() {
      return dia;
   }

   public void setDia(Date dia) {
      this.dia = dia;
   }

   public String getHora() {
      return hora;
   }

   public void setHora(String hora) {
      this.hora = hora;
   }

   public String getLugar() {
      return lugar;
   }

   public void setLugar(String lugar) {
      this.lugar = lugar;
   }

   public String getComentarios() {
      return comentarios;
   }

   public void setComentarios(String comentarios) {
      this.comentarios = comentarios;
   }

   @Override
   public String toString() {
      return "Accidente{" +
              "identificadorAccidente=" + identificadorAccidente +
              ", rutCliente='" + rutCliente + '\'' +
              ", dia='" + dia + '\'' +
              ", hora='" + hora + '\'' +
              ", lugar='" + lugar + '\'' +
              ", comentarios='" + comentarios + '\'' +
              '}';
   }
}
