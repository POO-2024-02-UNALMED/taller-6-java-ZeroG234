package vehiculos;

public class Vehiculo{
    String placa;
    int puertas;
    int velocidadMaxima;
    String nombre;
    int precio;
    int peso;
    String traccion;
    Fabricante fabricante;
    static int cantidadVehiculos;

    public Vehiculo(){
        Vehiculo.cantidadVehiculos++;
    }

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
                    String traccion, Fabricante fabricante){
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;

        Vehiculo.cantidadVehiculos++;

        // Contabilizar las ventas por pais
        int ventasPais = fabricante.getPais().getVenta();
        fabricante.getPais().setVenta(++ventasPais);
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String nuevaPlaca){
        placa = nuevaPlaca;
    }

    public int getPuertas(){
        return puertas;
    }

    public void setPuertas(int nuevasPuertas){
        puertas = nuevasPuertas;
    }

    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int nuevaVelocidadMaxima){
        velocidadMaxima = nuevaVelocidadMaxima;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public int getPrecio(){
        return precio;
    }

    public void setPrecio(int nuevoPrecio){
        precio = nuevoPrecio;
    }

    public int getPeso(){
        return peso;
    }
 
    public void setPeso(int nuevoPeso){
        peso = nuevoPeso;
    }

    public String getTraccion(){
        return traccion;
    }

    public void setTraccion(String nuevTraccion){
        traccion = nuevTraccion;
    }

    public Fabricante getFabricante(){
        return fabricante;
    }

    public void setFabricante(Fabricante nuevoFabricante){
        fabricante = nuevoFabricante;
    }

    public static int getCantidadVehiculos(){
        return Vehiculo.cantidadVehiculos;
    }

    public static void setCantidadVehiculos(int nuevaCantidadVehiculos){
        Vehiculo.cantidadVehiculos = nuevaCantidadVehiculos;
    }

    public String vehiculosPorTipo(){
        return "Automoviles: " + Automovil.getCantidadVehiculos() + "\n" +
               "Camionetas: " + Camioneta.getCantidadVehiculos() + "\n" +
               "Camiones: " + Camion.getCantidadVehiculos();
    }
}