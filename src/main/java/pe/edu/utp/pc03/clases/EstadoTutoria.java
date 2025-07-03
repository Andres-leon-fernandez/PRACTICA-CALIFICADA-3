
package pe.edu.utp.pc03.clases;


public interface EstadoTutoria {
    void solicitar(Tutoria tutoria);
    void aceptar(Tutoria tutoria);
    void rechazar(Tutoria tutoria);
    void completar(Tutoria tutoria);
    void cancelar(Tutoria tutoria);
    String getNombreEstado();
}
