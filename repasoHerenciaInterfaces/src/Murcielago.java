public interface Murcielago extends Mamifero{

    void volar();

    default void comerFrutas() {

        System.out.println("Soy vegano");
    }

    static void dormir(){
        System.out.println("Simulando que duerme...");
    }

}
