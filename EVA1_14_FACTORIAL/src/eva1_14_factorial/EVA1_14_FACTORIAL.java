package eva1_14_factorial;

public class EVA1_14_FACTORIAL {

    public static void main(String[] args) {

        factorial(5);
        System.out.println("El factorial de 5 es " + factorial(5));
    }

    public static int factorial(int val) {
        if (val == 0) {
            return 1;
        } else {
            return val * factorial(val - 1);
        }
    }
}
