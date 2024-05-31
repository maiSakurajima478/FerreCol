package models;

public class EstacionTren {
    private Integer id;
    private String nombre;
    private String ubicacion;
    private Municipio municipio;

    public EstacionTren(Integer id, String nombre, String ubicacion, Municipio municipio) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.municipio = municipio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
}
