import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Gestiona la asignación de prácticas de alumnos en empresas.
 */
public class AsignarPracticas {
    private List<Alumno> alumnos;
    private List<Empresa> empresas;
    private List<AsignacionPracticas> asignaciones;

    /**
     * Construye un nuevo objeto AsignarPracticas.
     */
    public AsignarPracticas() {
        this.alumnos = new ArrayList<>();
        this.empresas = new ArrayList<>();
        this.asignaciones = new ArrayList<>();
    }

    /**
     * Añade un nuevo alumno a la lista de alumnos.
     *
     * @param alumno el nuevo alumno
     */
    public void altaAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    /**
     * Añade una nueva empresa a la lista de empresas.
     *
     * @param empresa la nueva empresa
     */
    public void altaEmpresa(Empresa empresa) {
        empresas.add(empresa);
    }

    /**
     * Asigna prácticas a los alumnos en las empresas.
     * Las asignaciones se realizan en función de la nota media de los alumnos y la nota de satisfacción de las empresas.
     */
    public void asignarPracticas() {
        empresas.sort((e1, e2) -> Double.compare(e2.getNotaSatisfaccion(), e1.getNotaSatisfaccion()));
        alumnos.sort((a1, a2) -> Double.compare(a2.getNotaMedia(), a1.getNotaMedia()));

        for (int i = 0; i < Math.min(alumnos.size(), empresas.size()); i++) {
            AsignacionPracticas asignacion = new AsignacionPracticas(alumnos.get(i), empresas.get(i));
            asignaciones.add(asignacion);
        }
    }

    /**
     * Devuelve la lista de asignaciones de prácticas.
     *
     * @return la lista de asignaciones de prácticas
     */
    public List<AsignacionPracticas> getAsignaciones() {
        return asignaciones;
    }
}