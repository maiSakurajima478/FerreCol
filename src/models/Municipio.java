package models;

public class Municipio {
    private Integer id;
    private String nombre;
    private Departamento departamento;

    public Municipio(Integer id, String nombre, Departamento departamento) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
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

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    
}
