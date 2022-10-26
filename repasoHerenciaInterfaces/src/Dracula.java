public class Dracula extends Vampiro implements Murcielago {
private int estatura;

    public Dracula(String nombre, int edad,int estatura) {
        super(nombre, edad);
        this.estatura = estatura;
    }

    @Override
    public void volar() {
        System.out.println("Volando con Ecolocalización");
    }


    @Override
    public void amamantar() {

    }
}
