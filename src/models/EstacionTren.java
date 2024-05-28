package models;

public class EstacionTren {
    private Integer id;
    private String nombre;
    private String ubicacion;
    private Zona zona;

    public EstacionTren(Integer id, String nombre, String ubicacion, Zona zona) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zona = zona;
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

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
}
