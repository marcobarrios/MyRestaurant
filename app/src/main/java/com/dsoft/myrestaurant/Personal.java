package com.dsoft.myrestaurant;

/**
 * Created by Marco Barrios on 03/11/2014.
 */
public class Personal {

    private int idPersonal;
    private String nombrePersonal;

    public Personal(int idPersonal, String nombrePersonal) {
        this.idPersonal = idPersonal;
        this.nombrePersonal = nombrePersonal;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getNombrePersonal() {
        return nombrePersonal;
    }

    public void setNombrePersonal(String nombrePersonal) {
        this.nombrePersonal = nombrePersonal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personal personal = (Personal) o;

        if (idPersonal != personal.idPersonal) return false;
        if (!nombrePersonal.equals(personal.nombrePersonal)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPersonal;
        result = 31 * result + nombrePersonal.hashCode();
        return result;
    }
}
