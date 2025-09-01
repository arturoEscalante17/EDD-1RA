package eva1_11_arreglo_objetos;

class Persona {

    private String nombre;
    private String apellido;

    //METODOS Y GET SET
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}

public class EVA1_11_ARREGLO_OBJETOS {

    public static void main(String[] args) {

        // Arreglo original de 5 personas
        Persona[] personas = new Persona[5];
        personas[0] = new Persona("Jon", "Snow");
        personas[1] = new Persona("Daenerys", "Targaryen");
        personas[2] = new Persona("Eddard", "Stark");
        personas[3] = new Persona("Arya", "Stark");
        personas[4] = new Persona("Tyrion", "Lannister");

        // Arreglo copia
        Persona[] copia = new Persona[personas.length];

        for (int i = 0; i < personas.length; i++) {
            copia[i] = personas[i];
        }

        // Mostrar arreglo og
        System.out.println("Arreglo original:");
        System.out.println(personas);
        System.out.println("");
        for (Persona p : personas) {
            System.out.print("[" + p.getNombre() + " " + p.getApellido() + "] ");
        }
        //Mostrar arreglo copy
        System.out.println("\n\nArreglo copia:");
        System.out.println(copia);
        System.out.println("");
        for (Persona p : copia) {
            System.out.print("[" + p.getNombre() + " " + p.getApellido() + "] ");
        }

    }
}
