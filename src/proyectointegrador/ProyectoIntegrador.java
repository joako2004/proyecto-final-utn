package proyectointegrador;

import java.util.Scanner;

public class ProyectoIntegrador {

    public static void main(String[] args) {

        // Definir el tamaño del "garage" usando un vector
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos vehículos desea almacenar en su garage?");
        int cantidad_vehiculos = scanner.nextInt();
        scanner.nextLine(); // limpiar el buffer después de nextInt()

        Vehiculo vector[] = new Vehiculo[cantidad_vehiculos]; // Crear un vector basado en la cantidad ingresada

        for (int i = 0; i < cantidad_vehiculos; i++) {

            System.out.println("¿Qué vehículo deseas almacenar en tu garage? ¿auto o moto?");
            String tipo = scanner.nextLine().toLowerCase(); // Captura la entrada del usuario

            if (tipo.equals("auto")) {

                System.out.println("Ingrese la marca del auto:");
                String marca = scanner.nextLine();

                System.out.println("Ingrese el modelo del auto:");
                String modelo = scanner.nextLine();

                System.out.println("Ingrese el año del auto:");
                int anio = scanner.nextInt();
                scanner.nextLine(); // limpiar el buffer tras nextInt()

                System.out.println("Ingrese el número de puertas del auto:");
                int num_puertas = scanner.nextInt();
                scanner.nextLine(); // limpiar el buffer tras nextInt()

                vector[i] = new Coche(num_puertas, marca, modelo, anio); // Agregar el auto al vector

            } else if (tipo.equals("moto")) {

                System.out.println("Ingrese el tipo de la moto:");
                String tipo_moto = scanner.nextLine();

                System.out.println("Ingrese la marca de la moto:");
                String marca = scanner.nextLine();

                System.out.println("Ingrese el modelo de la moto:");
                String modelo = scanner.nextLine();

                System.out.println("Ingrese el año de la moto:");
                int anio = scanner.nextInt();
                scanner.nextLine(); // limpiar el buffer tras nextInt()

                vector[i] = new Moto(tipo_moto, marca, modelo, anio); // Agregar la moto al vector

            } else {
                System.out.println("Opción incorrecta, intenta de nuevo.");
                i--; // restar 1 al índice para repetir la entrada en caso de error
            }
        }
        
        System.out.println("Vehículos agregados correctamente.");
        
        // recorrer el vector y usar las funcionalidades de los vehiculos
        
        System.out.println("vehiculos en su garage: ");
        
        for (int i = 0; i < cantidad_vehiculos; i++) {
            
            vector[i].mostrarInfo();
            
            if (vector[i] instanceof Coche) {
                
                System.out.println("¿deseas arrancar el coche?");
                String opcion = scanner.nextLine().toLowerCase();
                
                if (opcion.equals("si")){
                    vector[i].arrancar();
                    vector[i].detener();
                } 
                
            } else if (vector[i] instanceof Moto){
                
                System.out.println("¿deseas arrancar la moto?");
                String opcion = scanner.nextLine().toLowerCase();
                
                if (opcion.equals("si")){
                    vector[i].arrancar();
                    vector[i].detener();
                } 
                
            }
            
        }
        scanner.close(); // Cerrar el Scanner para liberar recursos
    
    }
    
}
