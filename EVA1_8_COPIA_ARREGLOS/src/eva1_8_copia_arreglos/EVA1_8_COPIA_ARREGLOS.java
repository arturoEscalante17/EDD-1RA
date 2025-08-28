package eva1_8_copia_arreglos;

public class EVA1_8_COPIA_ARREGLOS {
    //QUIERO UNA COPIA
    //CREAR UN ELEMENTO
    //COPIAR ELEMENTO POR ELEMENTO  

    public static void main(String[] args) {

        int[] arreglo = new int[10];
        llenar(arreglo);
        System.out.println("arreglo:");
        System.out.println("");
        imprimir(arreglo);
        //int[] copia = arreglo.clone();
        int[] copia = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i];
        }
        System.out.println("");
        System.out.println("copia del arreglo:");
        System.out.println("");
        imprimir(copia);

    }

    public static void llenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }

    }

    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
}
