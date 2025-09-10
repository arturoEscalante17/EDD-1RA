package eva1_17_numero_primo;

public class EVA1_17_NUMERO_PRIMO {

    public static void main(String[] args) {
        int val = 1973;

        System.out.println(val + " es primo? " + esPrimoIneficiente(val));
        System.out.println(val + " es primo? " + esPrimoEficiente(val));
    }

    public static boolean esPrimoIneficiente(int num) {
        boolean ineficiente = true;
        for (int i = 2; i < num; i++) {
            int residuo = num % i;//Si la division es exacta es primo
            if (residuo == 0) {
                ineficiente = false;
                break;
            }
        }
        return ineficiente;

    }

    public static boolean esPrimoEficiente(int num) {
        if (num <= 1) {
            return false;
        }
        boolean esPrimo = true;
        int limite = (int) Math.sqrt(num);
        for (int i = 2; i <= limite; i++) {
            // Se comprueba si 'num' es divisible por 'i'.
            if (num % i == 0) {
                // Si la división es exacta, 'num' no es primo.
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }
}
