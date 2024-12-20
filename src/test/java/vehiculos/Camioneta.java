package vehiculos;

public class Camioneta extends Vehiculo{
    private static int cantidadVehiculos;
    private boolean volco;

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso,
                     Fabricante fabricante, boolean volco){
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        Camioneta.cantidadVehiculos++;
    }

    public boolean isVolco(){
        return volco;
    }

    public void setVolco(boolean nuevoVolco){
        volco = nuevoVolco;
    }

    public static int getCantidadVehiculos(){
        return Camioneta.cantidadVehiculos;
    }

    public static void setCantidadVehiculos(int nuevaCantidadVehiculos){
        Camioneta.cantidadVehiculos = nuevaCantidadVehiculos;
    }
}