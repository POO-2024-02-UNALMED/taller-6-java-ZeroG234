package vehiculos;
import java.util.ArrayList;

public class Pais{
    private String nombre;
    private int ventas;
    private static ArrayList<Pais> paises = new ArrayList<Pais>();

    public Pais(String nombre){
        this.nombre = nombre;
        paises.add(this);
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public int getVenta(){
        return ventas;
    }

    public void setVenta(int nuevaVentas){
        ventas = nuevaVentas;
    }

    public static ArrayList<Pais> getPaises(){
        return paises;
    }

    public static void setPaises(ArrayList<Pais> nuevosPaises){
        paises = nuevosPaises;
    }

    public static Pais paisMasVendedor(){
        int ventaMayor = 0;
        Pais vendedorMayor = null;

        for (Pais pais : paises) {
            if(ventaMayor < pais.ventas){
                ventaMayor = pais.ventas;
                vendedorMayor = pais;
            }
        }

        return vendedorMayor;
    }
}