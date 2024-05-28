package models;

public class Zona {
    private Integer id;
    private String nombre;
    private Municipio municipio;

    public Zona(Integer id, String nombre, Municipio municipio) {
        this.id = id;
        this.nombre = nombre;
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

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

}
