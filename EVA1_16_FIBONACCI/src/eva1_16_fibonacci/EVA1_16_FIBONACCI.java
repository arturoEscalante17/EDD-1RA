package eva1_16_fibonacci;

public class EVA1_16_FIBONACCI {

    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            System.out.print(fibonacci(i) + "-");
        }
    }

    public static int fibonacci(int posi) {
        if (posi == 0) {
            return 1;
        } else if (posi == 1) {
            return 1;
        } else {
            return fibonacci(posi - 1) + fibonacci(posi - 2);
        }

    }

}
