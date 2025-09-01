package eva1_10_arreglos_objetos;

public class EVA1_10_ARREGLOS_OBJETOS {

    public static void main(String[] args) {
        Ejemplo[] arreglo = new Ejemplo[2];
        System.out.println(arreglo);
        arreglo[0] = new Ejemplo();
        System.out.println(arreglo);
        arreglo[1] = new Ejemplo();
        System.out.println(arreglo[1]);
        System.out.println(arreglo[1].val);
    }

    static class Ejemplo {

        int val = 100;
    }
}
