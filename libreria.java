
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryzen
 */
public class libreria {
    
        public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.println("Proporciona el nombre: ");
        var nombre = consola.nextLine();

        System.out.println("Proporciona el id: ");
        var id = Integer.parseInt(consola.nextLine());

        System.out.println("Proporciona el precio: ");
        var precio = Double.parseDouble((consola.nextLine()));

        System.out.println(nombre + " " + "#" + id + "\n" + "Precio: " + "$" + precio);

        boolean envio = precio >= 50;
        if (envio) {
            System.out.println("Envio gratuito");
        } else {
            var pEnvio = precio * .11;
            System.out.println("Costo por envio adicional: " + "$" + pEnvio);
        }
    }

}

    

