package eva1_12_arreglos_multi;

public class EVA1_12_ARREGLOS_MULTI {

    public static void main(String[] args) {

        int[][] arreglo = new int[5][3];
        arreglo[0][0] = 100;
        System.out.println(arreglo.length);
        System.out.println(arreglo[0].length);
        System.out.println(arreglo[1].length);
        System.out.println(arreglo[2].length);
        System.out.println(arreglo[3].length);
        System.out.println(arreglo[4].length);

        //java.lang.NullPointerException = Se trata de leer una posicion que no existe
        //int[][] datos = new int[3][];
        //datos [0][0] = 100;
        
        int[][] datos = new int[3][];
        datos[0] = new int[10];
        datos[1] = new int[1];
        datos[2] = new int[5];

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print("[" + datos[i][j] + "]");
            }
            System.out.println("");
        }
    }
}


