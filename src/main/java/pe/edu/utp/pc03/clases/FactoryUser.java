
package pe.edu.utp.pc03.clases;

public class FactoryUser {
    public static User crearUsuario(String tipo, int id, String nombre, String email,String telefono){
        switch (tipo.toLowerCase()) {
            case "estudiante":
                return new Alumno(id, nombre, email,telefono);
            case "Docente":
                return new Docente(id, nombre, email,telefono);
            case "administrador":
                return new Administrador(id, nombre, email,telefono);
            default:
                throw new IllegalArgumentException("Tipo de usuario desconocido: " + tipo);
        }
    }
}
