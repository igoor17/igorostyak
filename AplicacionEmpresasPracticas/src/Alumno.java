/**
 * Representa a un estudiante con un nombre, curso, DNI y nota media.
 */
public class Alumno {
    private String nombre;
    private String curso;
    private String dni;
    private double notaMedia;

    /**
     * Construye un nuevo Alumno con los parámetros dados.
     *
     * @param nombre el nombre del estudiante
     * @param curso el curso en el que está matriculado el estudiante
     * @param dni el DNI del estudiante
     * @param notaMedia la nota media del estudiante
     */
    public Alumno(String nombre, String curso, String dni, double notaMedia) {
        this.nombre = nombre;
        this.curso = curso;
        this.dni = dni;
        this.notaMedia = notaMedia;
    }

    /**
     * Devuelve el nombre del estudiante.
     *
     * @return el nombre del estudiante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el curso del estudiante.
     *
     * @return el curso del estudiante
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Devuelve el DNI del estudiante.
     *
     * @return el DNI del estudiante
     */
    public String getDni() {
        return dni;
    }

    /**
     * Devuelve la nota media del estudiante.
     *
     * @return la nota media del estudiante
     */
    public double getNotaMedia() {
        return notaMedia;
    }

    /**
     * Establece el nombre del estudiante.
     *
     * @param nombre el nuevo nombre del estudiante
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el curso del estudiante.
     *
     * @param curso el nuevo curso del estudiante
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * Establece el DNI del estudiante.
     *
     * @param dni el nuevo DNI del estudiante
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Establece la nota media del estudiante.
     *
     * @param notaMedia la nueva nota media del estudiante
     */
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
}