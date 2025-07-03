
package pe.edu.utp.pc03.clases;

public class Solicitar implements EstadoTutoria{
    
    class Solicitada implements EstadoTutoria {
    @Override
    public void solicitar(Tutoria tutoria) {
        System.out.println("La tutoría ya está en estado 'Solicitada'.");
    }

    @Override
    public void aceptar(Tutoria tutoria) {
        tutoria.setEstado(new Aceptada());
        System.out.println("Tutoría Aceptada: " + tutoria.getTitulo());
        tutoria.notificarObservadores();
    }

    @Override
    public void rechazar(Tutoria tutoria) {
        tutoria.setEstado(new Rechazada());
        System.out.println("Tutoría Rechazada: " + tutoria.getTitulo());
        tutoria.notificarObservadores();
    }

    @Override
    public void completar(Tutoria tutoria) {
        System.out.println("No se puede completar una tutoría 'Solicitada'. Debe ser aceptada primero.");
    }

    @Override
    public void cancelar(Tutoria tutoria) {
        tutoria.setEstado(new Cancelada());
        System.out.println("Tutoría Cancelada desde estado 'Solicitada': " + tutoria.getTitulo());
        tutoria.notificarObservadores();
    }

    @Override
    public String getNombreEstado() {
        return "Solicitada";
    }
}

}
