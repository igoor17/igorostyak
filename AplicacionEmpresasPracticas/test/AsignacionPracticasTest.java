import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AsignacionPracticasTest {

    @Test
    void test(){
        // Crear alumnos
        Alumno alumno1 = new Alumno("Juan", "Bachillerato", "12345678A", 8.5);
        Alumno alumno2 = new Alumno("Maria", "Universidad", "98765432B", 9.2);
        Alumno alumno3 = new Alumno("Pedro", "Grado Medio", "45678901C", 7.8);

        // Crear empresas
        Empresa empresa1 = new Empresa("Empresa A", "Ciudad A", 9.0);
        Empresa empresa2 = new Empresa("Empresa B", "Ciudad B", 8.8);

        // Asignar prácticas
        AsignarPracticas asignador = new AsignarPracticas();
        asignador.altaAlumno(alumno1);
        asignador.altaAlumno(alumno2);
        asignador.altaAlumno(alumno3);
        asignador.altaEmpresa(empresa1);
        asignador.altaEmpresa(empresa2);
        asignador.asignarPracticas();

        // Verificar asignaciones
        List<AsignacionPracticas> asignaciones = asignador.getAsignaciones();
        assertEquals(2, asignaciones.size());

        // Verificar que cada empresa tiene un alumno y viceversa
        boolean empresa1TieneAlumno = false;
        boolean empresa2TieneAlumno = false;
        for (AsignacionPracticas asignacion : asignaciones) {
            if (asignacion.getEmpresa().equals(empresa1)) {
                empresa1TieneAlumno = true;
            } else if (asignacion.getEmpresa().equals(empresa2)) {
                empresa2TieneAlumno = true;
            }
        }
        assertTrue(empresa1TieneAlumno && empresa2TieneAlumno);
    }

}