
package LOGIC;


public class Duenio 
{
    private int id_duenio;
    private String nombre;
    private String apellido;
    private String sexo;
    private String direccion;
    private String telefono;
    private int edad;

    public Duenio() {
    }

    public Duenio(int id_duenio, String nombre, String apellido,String sexo, String direccion, String telefono, int edad) {
        this.id_duenio = id_duenio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
    }
    
    public int getEdad() {
        return edad;
    }

    public void settEdad(int edad) {
        this.edad = edad;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
}
