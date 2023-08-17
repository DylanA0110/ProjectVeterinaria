
package LOGIC;


public class Veterinario 
{
   private int id;
   private String nombre;
   private String apellido;
   private int edad;
   private String user;
   private String password;
   private String telefono;
   private String sexo;
   private String especialidad;

    public Veterinario() {}

    public Veterinario(int id, String nombre, String apellido, int edad, String user, String password, String telefono, String sexo, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.user = user;
        this.password = password;
        this.telefono = telefono;
        this.sexo = sexo;
        this.especialidad = especialidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
    
    public String getTelefono(){return telefono;}
    
    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }
    
    public String getSexo(){return sexo;}
    
    public void setEspecialidad(String especialidad)
    {
        this.especialidad = especialidad;
    }
    
    public String getEspecialidad(){return especialidad;}
            
}
