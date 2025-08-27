package eva6_1_paso_referencia;

public class EVA1_6_PASO_REFERENCIA {

    public static void main(String[] args) {
        int[] arreglo = new int[10];
        llenar(arreglo);
        imprimir(arreglo);
        System.out.println("");
        
        int[] arreglo2 = new int[50];
        llenar(arreglo2);
        imprimir(arreglo2);
        
        int[] arreglo3 = new int[100];
        llenar(arreglo3);
        imprimir(arreglo3);

    }
//LLENAR USA PASO POR REFERENCIA

    public static void llenar(int[] datos) {
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 100);
        }
    }
//IMPRIMIR USA PASO POR REFERENCIA TAMBIEN PERO NO MODIFICA EL ARREGLO, SOLO LEE

    public static void imprimir(int[] datos) {
        for (int i = 0; i < datos.length; i++) {
            System.out.println("[" + datos[i] + "]");
        }
        System.out.println("");
    }
}
//CARACTERISTICAS DE LOS ARREGLOS:
// ACCESO ALEATORIO: ACCESO A CUALQUIER POSICION SABIENDO LA DIRECCION
//SON INMUTABLES:NO PODEMOS CAMBIAR EL TAMANO UNA VEZ CREADO EL ARREGLO
//ALMACENAMIENTO SECUENCIAL: