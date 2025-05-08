import java.util.Scanner;

public class Cadena{
    public static void main(String[] args){
        String nombre;
        String apellido;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe tu Nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Escribe tu Apellido: ");
        String nombre = entrada.nextLine();
        System.out.println("Tu nombre es: "+ nombre +" "+ apellido);
    }
}