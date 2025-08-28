package eva1_9_tamano;

public class EVA1_9_TAMANO {

    public static void main(String[] args) {

        //ARREGLO DE TAMANO 10
        int[] arreglo = new int[10];
        llenar(arreglo);
        System.out.println("Arreglo:");
        imprimir(arreglo);

        //HACER UNA COPIA DEL ARREGLO
        //int[] copia = arreglo.clone();
        int[] copia = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i];
        }
        System.out.println("");
        System.out.println("Copia del arreglo:");
        imprimir(copia);

        //HACER MAS PEQUENO EL ARREGLO
        // Calcular el punto medio
        int mitad = arreglo.length / 2;

        // Copiar primera mitad
        int[] primeraMitad = new int[mitad];
        for (int i = 0; i < mitad; i++) {
            primeraMitad[i] = arreglo[i];
        }
        System.out.println("");
        System.out.println("Arreglo menos la primera mitad:");
        imprimir(primeraMitad);
        System.out.println("");

        // Copiar segunda mitad
        int[] segundaMitad = new int[mitad];
        for (int i = 0; i < mitad; i++) {
            segundaMitad[i] = arreglo[mitad + i];
        }
        System.out.println("Arreglo menos la segunda mitad:");
        imprimir(segundaMitad);
        System.out.println("");

        //HACER MAS GRANDE EL ARREGLO
        // Crear un nuevo arreglo con 4 extra
        int[] arregloXL = new int[arreglo.length + 4];

        // Copiar arreglo original a arregloXL
        for (int i = 0; i < arreglo.length; i++) {
            arregloXL[i] = arreglo[i];
        }

        System.out.println("ArregloXL:");
        imprimir(arregloXL);
    }

    //METODOS:
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
