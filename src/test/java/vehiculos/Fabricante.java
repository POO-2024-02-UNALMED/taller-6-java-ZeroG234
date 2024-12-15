package vehiculos;

import java.util.ArrayList;

public class Fabricante{
    private String nombre;
    private Pais pais;
    private int ventas;
    private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();

    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
        fabricantes.add(this);
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public Pais getPais(){
        return pais;
    }

    public void setPais(Pais nuevoPais){
        pais = nuevoPais;
    }

    public int getVenta(){
        return ventas;
    }

    public void setVenta(int nuevaVentas){
        ventas = nuevaVentas;
    }

    public static ArrayList<Fabricante> getFabricantes(){
        return fabricantes;
    }

    public static void setFabricantes(ArrayList<Fabricante> nuevosFabricantes){
        fabricantes = nuevosFabricantes;
    }

    public static Fabricante fabricaMayorVentas(){
        int ventaMayor = 0;
        Fabricante vendedorMayor = null;

        for (Fabricante fabricante : fabricantes) {
            if(ventaMayor < fabricante.ventas){
                ventaMayor = fabricante.ventas;
                vendedorMayor = fabricante;
            }
        }

        return vendedorMayor;
    }
}