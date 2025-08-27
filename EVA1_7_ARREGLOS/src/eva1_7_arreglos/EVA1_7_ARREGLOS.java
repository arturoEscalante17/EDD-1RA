package eva1_7_arreglos;

public class EVA1_7_ARREGLOS {
//CARACTERISTICAS DE LOS ARREGLOS:
// ACCESO ALEATORIO: ACCESO A CUALQUIER POSICION SABIENDO LA DIRECCION
//SON INMUTABLES:NO PODEMOS CAMBIAR EL TAMANO UNA VEZ CREADO EL ARREGLO
//ALMACENAMIENTO SECUENCIAL:

    public static void main(String[] args) {

        int[] arreglo = new int[3];
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        System.out.println(arreglo);
        imprimir(arreglo);
        arreglo = new int[2];
        System.out.println(arreglo);
        imprimir(arreglo);
    }

    public static void imprimir(int[] datos) {
        for (int i = 0; i < datos.length; i++) {
            System.out.println("[" + datos[i] + "]");
        }
        System.out.println("");
    }
}
