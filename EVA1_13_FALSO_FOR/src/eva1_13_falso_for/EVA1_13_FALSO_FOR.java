package eva1_13_falso_for;

public class EVA1_13_FALSO_FOR {

    public static void main(String[] args) {

        falsoFor(5); //5-4-3-2-1
        System.out.println("");
        falsoForUp(5, 1);//1-2-3-4-5
    }

    public static void falsoFor(int val) {//5-4-3-2-1
        System.out.print(val); //RESOLVER UN PROBLEMA
        if (val > 1)//DEBEMOS DETENER LA RECURSIVIDAD
        {
            System.out.print(" - "); //EVITAR QUE IMPRIMA EL GUION QUE SOBRA AL FINAL 
            falsoFor(val - 1);//LLAMARSE A SI MISMO
        }

    }

    public static void falsoForUp(int val, int ini) {//1-2-3-4-5
        System.out.print(ini); //RESOLVER UN PROBLEMA
        if (ini < val)//DEBEMOS DETENER LA RECURSIVIDAD
        {
            System.out.print(" - "); //EVITAR QUE IMPRIMA EL GUION QUE SOBRA AL FINAL 
            falsoForUp(val, ini + 1);//LLAMARSE A SI MISMO
        }
    }
}
