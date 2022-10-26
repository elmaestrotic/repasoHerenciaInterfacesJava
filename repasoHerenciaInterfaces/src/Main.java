public class Main {
    public static void main(String[] args) {
        Dracula instancia1 = new Dracula("Vladimir",600,190);

        instancia1.morder();//poder heredado de la clase Vampiro
        instancia1.chuparSangre();//poder heredado de la clase Vampiro
        instancia1.volar();//poder heredado de la interface Murcielago

        instancia1.comerFrutas();//poder opcional heredado de la interface Murcielago

        Murcielago.dormir();//poder mediante la invocación de la interface Murcielago

    }
}