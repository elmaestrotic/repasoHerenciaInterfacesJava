public class Vampiro {
    //atributos de la clase Vampiro
    private String nombre;
    private int edad;

    public Vampiro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Métodos
    public void morder() {
        System.out.println("Vampiro mordiendo");
    }

    public void chuparSangre() {
        System.out.println("Vampiro alimentándose");
    }


}
