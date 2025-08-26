package eva1_4_paso_valor;

public class EVA1_4_PASO_VALOR {

    public static void main(String[] args) { //SIEMPRE QUE MANDAS UN VALOR A UNA FUNCION LE MANDAS UNA COPIA 
        int someValue = 7;
        process(someValue);
        System.out.println(someValue);
    }

    public static void process(int value) {
        value = 10;
    }
}
