package models;

public class Comentario {
    private Integer id;
    private String contenido;
    private String fecha_creacion;
    private Publicacion publicacion;
    private Usuario usuario;

    public Comentario (Integer id, String contenido, String fecha_creacion, Publicacion publicacion, Usuario usuario) {
        this.id = id;
        this.contenido = contenido;
        this.fecha_creacion = fecha_creacion;
        this.publicacion = publicacion;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
