package eva1_3_heap;

public class EVA1_3_HEAP {

    public static void main(String[] args) {
        int x = 5;
        Prueba prueba1 = new Prueba(); //REFERENCIA A DIRECCIONES EN LOS OBJETOS EN MEMORIA
        Prueba prueba2 = new Prueba(); //REFERENCIA A DIRECCIONES EN LOS OBJETOS EN MEMORIA
        System.out.println("x = " + x);
        System.out.println("prueba 1 = " + prueba1);
        System.out.println("prueba 2 = " + prueba2);
        System.out.println("prueba.valor = " + prueba1.valor);
        System.out.println("prueba.valor = " + prueba2.valor);
        prueba1 = null; //ROMPEMOS EL ENLACE (DIRECCION) ENTRE VARIABLE Y MEMORIA
        prueba2 = null; //ROMPEMOS EL ENLACE (DIRECCION) ENTRE VARIABLE Y MEMORIA
    }

}

class Prueba {

    int valor = 100;
}
