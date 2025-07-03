
package pe.edu.utp.pc03.clases;

public class Notificacion implements ObserverTutoria{

    @Override
    public void Actulizar(Tutoria tutoria) {
        String mensaje = String.format(
            "Estimado %s, el estado de su tutoría '%s' ha cambiado a: %s. Detalles: %s",
            tutoria.getAlumno().getNombre(),
            tutoria.getTitulo(),
            tutoria.getEstado().getNombreEstado(),
            tutoria.getDescripcion()
        );
        System.out.println("Notificación enviada a " + tutoria.getAlumno().getCorreo()+ ": " + mensaje);

        if (tutoria.getDocente()!= null) {
            String mensajeTutor = String.format(
                "Estimado %s, el estado de la tutoría '%s' (Estudiante: %s) ha cambiado a: %s.",
                tutoria.getDocente().getNombre(),
                tutoria.getTitulo(),
                tutoria.getAlumno().getNombre(),
                tutoria.getEstado().getNombreEstado()
            );
            System.out.println("Notificación enviada a " + tutoria.getDocente().getCorreo()+ ": " + mensajeTutor);
        }
    }

    public void enviarNotificacion(String email, String mensaje) {
        System.out.println("[EMAIL/SMS] Enviando a " + email + ": " + mensaje);
    }
    
}
