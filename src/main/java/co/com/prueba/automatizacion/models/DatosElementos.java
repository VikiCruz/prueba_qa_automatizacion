package co.com.prueba.automatizacion.models;


public class DatosElementos {

    private String NombreCancion;

    public DatosElementos(String nombreCancion) {
        NombreCancion = nombreCancion;
    }

    public String getNombreCancion() {
        return NombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        NombreCancion = nombreCancion;
    }
}
