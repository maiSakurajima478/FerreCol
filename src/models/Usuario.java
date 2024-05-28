package models;

import enums.Rol;

public class Usuario {
    private Integer id;
    private String correo;
    private String contrasenia;
    private String fecha_registro;
    private Rol rol;

    public Usuario (Integer id, String correo, String contrasenia, String fecha_registro, Rol rol ) {
        this.id = id;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.fecha_registro = fecha_registro;
        this.rol = rol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }    
}
