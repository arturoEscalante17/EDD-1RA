package eva1_5_paso_referencia;

/**
 *
 * @author Art
 */
public class EVA1_5_PASO_REFERENCIA {

    public static void main(String[] args) {
        // TODO code application logic here
        Foo objeto = new Foo();
        process(objeto); //TAMBIEN ENVIAMOS UNA COPIA PERO DE LA DIRECCION DEL OBJETO
        System.out.println("objeto.valor = " + objeto.valor);
    }

    public static void process(Foo obj) {
        obj.valor = 9999;
    }

}

class Foo {

    int valor = 0;
}
