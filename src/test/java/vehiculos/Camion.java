package vehiculos;

public class Camion extends Vehiculo{
    private static int cantidadVehiculos;
    private int ejes;

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes){
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        Camion.cantidadVehiculos++;
    }

    public int getEjes(){
        return ejes;
    }

    public void setEjes(int nuevosEjes){
        ejes = nuevosEjes;
    }

    public static int getCantidadVehiculos(){
        return Camion.cantidadVehiculos;
    }

    public static void setCantidadVehiculos(int nuevaCantidadVehiculos){
        Camion.cantidadVehiculos = nuevaCantidadVehiculos;
    }
}