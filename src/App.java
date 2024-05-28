import enums.Rol;
import models.Comentario;
import models.EstacionTren;
import models.Municipio;
import models.Publicacion;
import models.Usuario;
import models.Zona;
import models.Departamento;

public class App {
    public static void main(String[] args) throws Exception {

        Departamento departamento_1 = new Departamento(1, "Boyaca");
        Municipio municipio_1 = new Municipio(1, "Example Municipio", departamento_1);
        Zona zona_1 = new Zona(1, "Example Zona", municipio_1);
        EstacionTren estacion_1 = new EstacionTren(1, "Example Name", "Example Ubicacion", zona_1);

        Usuario user_1 = new Usuario(1, "fundation01@gmail.com", "example123", "2023-12-04", Rol.FUNDACION);

        Usuario user_2 = new Usuario(2, "user01@gmail.com", "example145", "2024-01-05", Rol.USUARIO);

        Publicacion publicacion_1 = new Publicacion(1, "Example Titulo", "Example Contenido", "https://drive.google.com/publicaciones/example.jpg", "2023-12-12", user_1, estacion_1);

        Comentario comentario_1 = new Comentario(1, "Example content", "2024-02-02", publicacion_1, user_2);

        System.out.println("\n\t\t==== Mostrando Publicacion =====");
        System.out.println("Titulo: "+ publicacion_1.getTitulo());
        System.out.println("Contenido: "+publicacion_1.getContenido());
        System.out.println("Archivo: "+publicacion_1.getUrl_archivo());
        System.out.println("Posteado: "+publicacion_1.getFecha_creacion());
        System.out.println("Usuario: "+publicacion_1.getUsuario().getCorreo());
        System.out.println("Estacion: "+publicacion_1.getEstacion_tren().getNombre());
        System.out.println("Zona: "+publicacion_1.getEstacion_tren().getZona().getNombre());
        System.out.println("Municipio: "+publicacion_1.getEstacion_tren().getZona().getMunicipio().getNombre());
        System.out.println("Departamento: "+publicacion_1.getEstacion_tren().getZona().getMunicipio().getDepartamento().getNombre());

        System.out.println("\n\t\t==== Mostrando Comentarios Publicacion  =====");
        if(comentario_1.getPublicacion().getId() == publicacion_1.getId()){
            System.out.println("Contenido: "+comentario_1.getContenido());
            System.out.println("Usuario: "+comentario_1.getUsuario().getCorreo());
            System.out.println("Posteado: "+comentario_1.getFecha_creacion());
        }

    }
}
