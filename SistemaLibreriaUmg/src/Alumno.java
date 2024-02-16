public class Alumno {
    //atributos de la clase Alumno
    private String nombre;
    private String telefono;
    private String carne;

    //contructores

    public Alumno(String nombre, String telefono, String carne) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.carne = carne;
    }


    public Alumno() {

    }
    //metodos de acceso

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    @Override
    public String toString() {
        return "ALUMNO [ " +
                "Nombre: " + nombre  +
                " Telefono: " + telefono +
                " Carne: " + carne +" ]";
    }
}
