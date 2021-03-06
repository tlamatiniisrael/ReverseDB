package reversedb.modelo2;
// Generated Jun 10, 2015 7:53:33 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CvcTipoVehiRepuve generated by hbm2java
 */
@Entity
@Table(name="CVC_TIPO_VEHI_REPUVE"
    ,schema="SIR7_ING"
)
public class CvcTipoVehiRepuve  implements java.io.Serializable {


     private CvcTipoVehiRepuveId id;
     private CvcClaseVehiRepuve cvcClaseVehiRepuve;
     private boolean idClaseRpv;
     private byte idTipoRpv;
     private String descTipoVehi;
     private String idStatus;
     private Date fechaInicio;
     private Date fechaMov;
     private Set<TepVehiculo> tepVehiculos = new HashSet<TepVehiculo>(0);

    public CvcTipoVehiRepuve() {
    }

	
    public CvcTipoVehiRepuve(CvcTipoVehiRepuveId id, CvcClaseVehiRepuve cvcClaseVehiRepuve, boolean idClaseRpv, byte idTipoRpv, String descTipoVehi, String idStatus, Date fechaInicio, Date fechaMov) {
        this.id = id;
        this.cvcClaseVehiRepuve = cvcClaseVehiRepuve;
        this.idClaseRpv = idClaseRpv;
        this.idTipoRpv = idTipoRpv;
        this.descTipoVehi = descTipoVehi;
        this.idStatus = idStatus;
        this.fechaInicio = fechaInicio;
        this.fechaMov = fechaMov;
    }
    public CvcTipoVehiRepuve(CvcTipoVehiRepuveId id, CvcClaseVehiRepuve cvcClaseVehiRepuve, boolean idClaseRpv, byte idTipoRpv, String descTipoVehi, String idStatus, Date fechaInicio, Date fechaMov, Set<TepVehiculo> tepVehiculos) {
       this.id = id;
       this.cvcClaseVehiRepuve = cvcClaseVehiRepuve;
       this.idClaseRpv = idClaseRpv;
       this.idTipoRpv = idTipoRpv;
       this.descTipoVehi = descTipoVehi;
       this.idStatus = idStatus;
       this.fechaInicio = fechaInicio;
       this.fechaMov = fechaMov;
       this.tepVehiculos = tepVehiculos;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idClaseVehi", column=@Column(name="ID_CLASE_VEHI", nullable=false, length=2) ), 
        @AttributeOverride(name="idTipoVehi", column=@Column(name="ID_TIPO_VEHI", nullable=false, length=2) ) } )
    public CvcTipoVehiRepuveId getId() {
        return this.id;
    }
    
    public void setId(CvcTipoVehiRepuveId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_CLASE_VEHI", nullable=false, insertable=false, updatable=false)
    public CvcClaseVehiRepuve getCvcClaseVehiRepuve() {
        return this.cvcClaseVehiRepuve;
    }
    
    public void setCvcClaseVehiRepuve(CvcClaseVehiRepuve cvcClaseVehiRepuve) {
        this.cvcClaseVehiRepuve = cvcClaseVehiRepuve;
    }

    
    @Column(name="ID_CLASE_RPV", nullable=false, precision=1, scale=0)
    public boolean isIdClaseRpv() {
        return this.idClaseRpv;
    }
    
    public void setIdClaseRpv(boolean idClaseRpv) {
        this.idClaseRpv = idClaseRpv;
    }

    
    @Column(name="ID_TIPO_RPV", nullable=false, precision=2, scale=0)
    public byte getIdTipoRpv() {
        return this.idTipoRpv;
    }
    
    public void setIdTipoRpv(byte idTipoRpv) {
        this.idTipoRpv = idTipoRpv;
    }

    
    @Column(name="DESC_TIPO_VEHI", nullable=false, length=50)
    public String getDescTipoVehi() {
        return this.descTipoVehi;
    }
    
    public void setDescTipoVehi(String descTipoVehi) {
        this.descTipoVehi = descTipoVehi;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="cvcTipoVehiRepuve")
    public Set<TepVehiculo> getTepVehiculos() {
        return this.tepVehiculos;
    }
    
    public void setTepVehiculos(Set<TepVehiculo> tepVehiculos) {
        this.tepVehiculos = tepVehiculos;
    }




}


