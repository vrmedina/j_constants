
package constantesyestaticos;

public class Main {
    public static void main(String[] args) {
        //Se puede llamar la frase sin necesidad de crear un objeto
        System.out.println(Persona.frase);
        
        Persona persona1 = new Persona("Victor",24);//Iniciamos el objeto con el constructor
        Persona persona2 = new Persona("Raul",22);//Iniciamos el objeto con el constructor
      
        persona1.setEdad(14);//Cambiamos la edad con el setter de edad
        persona2.frase = "Cambiando la frase para todos los objetos.";
        
        persona1.MostrarDatos();
        System.out.println("Comprobando: "+persona1.frase);
        System.out.println("Comprobando: "+persona2.frase);
        
        //Se puede llamar un metodo estatico de esta manera
        System.out.println("La suma es "+Persona.Sumar(4, 2));
    }
}
