/**
 * Representa la asignación de prácticas a un alumno en una empresa.
 */
public class AsignacionPracticas {
    private Alumno alumno;
    private Empresa empresa;

    /**
     * Construye una nueva AsignacionPracticas con los parámetros dados.
     *
     * @param alumno el alumno al que se le asignan las prácticas
     * @param empresa la empresa en la que el alumno realizará las prácticas
     */
    public AsignacionPracticas(Alumno alumno, Empresa empresa) {
        this.alumno = alumno;
        this.empresa = empresa;
    }

    /**
     * Devuelve el alumno al que se le asignan las prácticas.
     *
     * @return el alumno al que se le asignan las prácticas
     */
    public Alumno getAlumno() {
        return alumno;
    }

    /**
     * Devuelve la empresa en la que el alumno realizará las prácticas.
     *
     * @return la empresa en la que el alumno realizará las prácticas
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * Establece el alumno al que se le asignan las prácticas.
     *
     * @param alumno el nuevo alumno al que se le asignan las prácticas
     */
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    /**
     * Establece la empresa en la que el alumno realizará las prácticas.
     *
     * @param empresa la nueva empresa en la que el alumno realizará las prácticas
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}