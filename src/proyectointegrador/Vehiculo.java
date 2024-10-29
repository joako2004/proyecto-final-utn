package proyectointegrador;

abstract class Vehiculo { // declarar la clase de forma abstracta para poder crear metodos abstractos
    
    //declarar los atributos de la Super Clase Vehiculo
    String marca;
    String modelo;
    int anio;
    
    // constructor de la clase Vehiculo

    public Vehiculo(String marca, String modelo, int anio) {
        
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    
    }
    
    // declarar los metodos abstractos
    abstract void arrancar();    
    abstract void detener();
    abstract void mostrarInfo();

}
