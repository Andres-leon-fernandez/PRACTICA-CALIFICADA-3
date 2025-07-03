
package pe.edu.utp.pc03.clases;

import java.util.List;


public class Tutoria {
     private String id;
    private String titulo;
    private String descripcion;
    private Alumno Alumno;
    private Docente Docente;
    private EstadoTutoria estado;
    private List<ObserverTutoria> observadores;
    private Docente tutorOriginal;
    private EstadoTutoria estadoPrevioAlComando;

    public Tutoria(String id, String titulo, String descripcion, Alumno Alumno, Docente Docente, EstadoTutoria estado, List<ObserverTutoria> observadores, Docente tutorOriginal, EstadoTutoria estadoPrevioAlComando) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.Alumno = Alumno;
        this.Docente = Docente;
        this.estado = estado;
        this.observadores = observadores;
        this.tutorOriginal = tutorOriginal;
        this.estadoPrevioAlComando = estadoPrevioAlComando;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Alumno getAlumno() {
        return Alumno;
    }

    public void setAlumno(Alumno Alumno) {
        this.Alumno = Alumno;
    }

    public Docente getDocente() {
        return Docente;
    }

    public void setDocente(Docente Docente) {
        this.Docente = Docente;
    }

    public EstadoTutoria getEstado() {
        return estado;
    }

    public void setEstado(EstadoTutoria estado) {
        this.estado = estado;
    }

    public List<ObserverTutoria> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<ObserverTutoria> observadores) {
        this.observadores = observadores;
    }

    public Docente getTutorOriginal() {
        return tutorOriginal;
    }

    public void setTutorOriginal(Docente tutorOriginal) {
        this.tutorOriginal = tutorOriginal;
    }

    public EstadoTutoria getEstadoPrevioAlComando() {
        return estadoPrevioAlComando;
    }

    public void setEstadoPrevioAlComando(EstadoTutoria estadoPrevioAlComando) {
        this.estadoPrevioAlComando = estadoPrevioAlComando;
    }
    
    public void notificarObservadores(){
    };
}
