package eva1_15_mcd;

public class EVA1_15_MCD {

    public static void main(String[] args) {
        int resultado = MCD(48, 180);
        System.out.println(" El MCD de 180 y 48  es: " + resultado);

    }

    public static int MCD(int dividendo, int divisor) {
        while (divisor != 0) {
            int residuo = dividendo % divisor;
            dividendo = divisor;
            divisor = residuo;
        }
        return dividendo;
    }
}
