package eva1_9_captura;

import java.util.Scanner;

public class EVA1_9_CAPTURA {

    public static void main(String[] args) {
        String nombre;
        int edad;
        double promedio;
        
        Scanner input =new Scanner (System.in);//CREA EL SCANNER
        
        System.out.println("Introduzca su nombre completo:");//CAPTURA DE DATOS
        nombre = input.nextLine();//CAPTURA EL TEXTO(nextline())
        
        System.out.println("Introduce tu edad");
        edad = input.nextInt();
        
        System.out.println("Captura tu promedio de preparatoria");
        promedio = input.nextDouble();
        
        System.out.println("El nombre es:");
        System.out.println(nombre);
        
        System.out.println("Edad es::");
        System.out.println(edad);
        
        System.out.println("El promedio es:");
        System.out.println(promedio);
        
        
    }
    
}
