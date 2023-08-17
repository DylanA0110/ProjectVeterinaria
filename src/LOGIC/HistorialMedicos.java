
package LOGIC;
import java.sql.Date;

public class HistorialMedicos
{
    private int id;
    private int mascotaID;
    private int veterinarioID;
    private Date fechaVisita;
    private String motivoVisita;
    private String descripcion;
    private Date fechaVacuna;
    private String nombreVacuna;
    private Date desparasitacion;
    private String medicamentos;
    
    public HistorialMedicos(){}
    public HistorialMedicos(int id,int mascotaID, int veterinarioID, Date fechaVisita, String motivoVisita,
                           String descripcion, Date fechaVacuna, String nombreVacuna, Date desparasitacion,
                           String medicamentos) {
        this.id = id;
        this.mascotaID = mascotaID;
        this.veterinarioID = veterinarioID;
        this.fechaVisita = fechaVisita;
        this.motivoVisita = motivoVisita;
        this.descripcion = descripcion;
        this.fechaVacuna = fechaVacuna;
        this.nombreVacuna = nombreVacuna;
        this.desparasitacion = desparasitacion;
        this.medicamentos = medicamentos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMascotaID() {
        return mascotaID;
    }

    public void setMascotaID(int mascotaID) {
        this.mascotaID = mascotaID;
    }

    public int getVeterinarioID() {
        return veterinarioID;
    }

    public void setVeterinarioID(int veterinarioID) {
        this.veterinarioID = veterinarioID;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getMotivoVisita() {
        return motivoVisita;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaVacuna() {
        return fechaVacuna;
    }

    public void setFechaVacuna(Date fechaVacuna) {
        this.fechaVacuna = fechaVacuna;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public Date getDesparasitacion() {
        return desparasitacion;
    }

    public void setDesparasitacion(Date desparasitacion) {
        this.desparasitacion = desparasitacion;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }
}
