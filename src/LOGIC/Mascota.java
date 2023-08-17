
package LOGIC;

public class Mascota 
{
   private int id_mascota;
   private String nombre;
   private String sexo;
   private String especie;
   private int edad;
   private String color;
   private String observaciones;
   private String raza;
   private double peso;
   private int id_duenio;

    public Mascota() {}

    public Mascota(int id_mascota, String nombre, String sexo, String especie, int edad, String color, String raza, String observaciones, double peso, int id_duenio) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.sexo = sexo;
        this.especie = especie;
        this.edad = edad;
        this.color = color;
        this.observaciones = observaciones;
        this.peso = peso;
        this.raza = raza;
        this.id_duenio = id_duenio;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

 
   
   
}
