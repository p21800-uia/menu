package uia.com.agenda;

public class Recordatorio {

    String mensaje = "";


    public Recordatorio() {
    }

    public Recordatorio(String tipo, String fecha, String fechaRecordatorio, String nombre) {
        mensaje = "Usted tiene un "+tipo+" el día "+ fecha+" con "+ nombre;
    }
}
