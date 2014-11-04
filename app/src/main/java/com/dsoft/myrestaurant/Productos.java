package com.dsoft.myrestaurant;

/**
 * Created by Marco Barrios on 03/11/2014.
 */
public class Productos {

    private int idProducto;
    private String nombreProducto;

    public Productos(int idProducto, String nombreProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
    }

    //<editor-fold desc="GETTERS">
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }
    //</editor-fold>

    //<editor-fold desc="SETTERS">
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    //</editor-fold>

    //<editor-fold desc="EQUALS Y HASHCODE">
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Productos productos = (Productos) o;

        if (idProducto != productos.idProducto) return false;
        if (!nombreProducto.equals(productos.nombreProducto)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProducto;
        result = 31 * result + nombreProducto.hashCode();
        return result;
    }
    //</editor-fold>
}
