package constantesyestaticos;

public class Persona {
    private final String nombre;//Esta es una constante
    private int edad;
    //Miembro estatico de una clase
    public static String frase = "Hola soy estatico, soy miembro de la clase, no del objeto.";
    
    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void MostrarDatos() {
        System.out.println("El nombre es "+nombre);
        System.out.println("La edad es "+edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int Sumar(int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }
    
}
