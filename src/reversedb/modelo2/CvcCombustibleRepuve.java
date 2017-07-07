package reversedb.modelo2;
// Generated Jun 10, 2015 7:53:33 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CvcCombustibleRepuve generated by hbm2java
 */
@Entity
@Table(name="CVC_COMBUSTIBLE_REPUVE"
    ,schema="SIR7_ING"
)
public class CvcCombustibleRepuve  implements java.io.Serializable {


     private byte idCombustible;
     private String descCombustible;
     private String idStatus;
     private Date fechaInicio;
     private Date fechaMov;
     private Set<TepVehiculo> tepVehiculos = new HashSet<TepVehiculo>(0);

    public CvcCombustibleRepuve() {
    }

	
    public CvcCombustibleRepuve(byte idCombustible, String descCombustible, String idStatus, Date fechaInicio, Date fechaMov) {
        this.idCombustible = idCombustible;
        this.descCombustible = descCombustible;
        this.idStatus = idStatus;
        this.fechaInicio = fechaInicio;
        this.fechaMov = fechaMov;
    }
    public CvcCombustibleRepuve(byte idCombustible, String descCombustible, String idStatus, Date fechaInicio, Date fechaMov, Set<TepVehiculo> tepVehiculos) {
       this.idCombustible = idCombustible;
       this.descCombustible = descCombustible;
       this.idStatus = idStatus;
       this.fechaInicio = fechaInicio;
       this.fechaMov = fechaMov;
       this.tepVehiculos = tepVehiculos;
    }
   
     @Id 

    
    @Column(name="ID_COMBUSTIBLE", unique=true, nullable=false, precision=2, scale=0)
    public byte getIdCombustible() {
        return this.idCombustible;
    }
    
    public void setIdCombustible(byte idCombustible) {
        this.idCombustible = idCombustible;
    }

    
    @Column(name="DESC_COMBUSTIBLE", nullable=false, length=20)
    public String getDescCombustible() {
        return this.descCombustible;
    }
    
    public void setDescCombustible(String descCombustible) {
        this.descCombustible = descCombustible;
    }

    
    @Column(name="ID_STATUS", nullable=false, length=2)
    public String getIdStatus() {
        return this.idStatus;
    }
    
    public void setIdStatus(String idStatus) {
        this.idStatus = idStatus;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_INICIO", nullable=false, length=7)
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_MOV", nullable=false, length=7)
    public Date getFechaMov() {
        return this.fechaMov;
    }
    
    public void setFechaMov(Date fechaMov) {
        this.fechaMov = fechaMov;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cvcCombustibleRepuve")
    public Set<TepVehiculo> getTepVehiculos() {
        return this.tepVehiculos;
    }
    
    public void setTepVehiculos(Set<TepVehiculo> tepVehiculos) {
        this.tepVehiculos = tepVehiculos;
    }




}

