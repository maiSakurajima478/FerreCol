package models;

public class Publicacion {
    private Integer id;
    private String titulo;
    private String contenido;
    private String url_archivo;
    private String fecha_creacion;
    private Usuario usuario;
    private EstacionTren estacion_tren;

    public Publicacion(Integer id, String titulo, String contenido, String url_archivo, String fecha_creacion, Usuario usuario, EstacionTren estacion_tren) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.url_archivo = url_archivo;
        this.fecha_creacion = fecha_creacion;
        this.usuario = usuario;
        this.estacion_tren = estacion_tren;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getUrl_archivo() {
        return url_archivo;
    }

    public void setUrl_archivo(String url_archivo) {
        this.url_archivo = url_archivo;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public EstacionTren getEstacion_tren() {
        return estacion_tren;
    }

    public void setEstacion_tren(EstacionTren estacion_tren) {
        this.estacion_tren = estacion_tren;
    }
}
