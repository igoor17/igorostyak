/**
 * Representa a una empresa con un nombre, localidad y nota de satisfacción.
 */
public class Empresa {
    private String nombre;
    private String localidad;
    private double notaSatisfaccion;

    /**
     * Construye una nueva Empresa con los parámetros dados.
     *
     * @param nombre el nombre de la empresa
     * @param localidad la localidad de la empresa
     * @param notaSatisfaccion la nota de satisfacción de la empresa
     */
    public Empresa(String nombre, String localidad, double notaSatisfaccion) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.notaSatisfaccion = notaSatisfaccion;
    }

    /**
     * Devuelve el nombre de la empresa.
     *
     * @return el nombre de la empresa
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la localidad de la empresa.
     *
     * @return la localidad de la empresa
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Devuelve la nota de satisfacción de la empresa.
     *
     * @return la nota de satisfacción de la empresa
     */
    public double getNotaSatisfaccion() {
        return notaSatisfaccion;
    }

    /**
     * Establece el nombre de la empresa.
     *
     * @param nombre el nuevo nombre de la empresa
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece la localidad de la empresa.
     *
     * @param localidad la nueva localidad de la empresa
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * Establece la nota de satisfacción de la empresa.
     *
     * @param notaSatisfaccion la nueva nota de satisfacción de la empresa
     */
    public void setNotaSatisfaccion(double notaSatisfaccion) {
        this.notaSatisfaccion = notaSatisfaccion;
    }
}