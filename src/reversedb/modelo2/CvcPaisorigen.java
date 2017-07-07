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
 * CvcPaisorigen generated by hbm2java
 */
@Entity
@Table(name="CVC_PAISORIGEN"
    ,schema="SIR7_ING"
)
public class CvcPaisorigen  implements java.io.Serializable {


     private String idPaisOrigen;
     private String descPaisOrigen;
     private String idStatus;
     private Date fecMovto;
     private Set<TepVehiculo> tepVehiculos = new HashSet<TepVehiculo>(0);

    public CvcPaisorigen() {
    }

	
    public CvcPaisorigen(String idPaisOrigen, String idStatus) {
        this.idPaisOrigen = idPaisOrigen;
        this.idStatus = idStatus;
    }
    public CvcPaisorigen(String idPaisOrigen, String descPaisOrigen, String idStatus, Date fecMovto, Set<TepVehiculo> tepVehiculos) {
       this.idPaisOrigen = idPaisOrigen;
       this.descPaisOrigen = descPaisOrigen;
       this.idStatus = idStatus;
       this.fecMovto = fecMovto;
       this.tepVehiculos = tepVehiculos;
    }
   
     @Id 

    
    @Column(name="ID_PAIS_ORIGEN", unique=true, nullable=false, length=2)
    public String getIdPaisOrigen() {
        return this.idPaisOrigen;
    }
    
    public void setIdPaisOrigen(String idPaisOrigen) {
        this.idPaisOrigen = idPaisOrigen;
    }

    
    @Column(name="DESC_PAIS_ORIGEN", length=30)
    public String getDescPaisOrigen() {
        return this.descPaisOrigen;
    }
    
    public void setDescPaisOrigen(String descPaisOrigen) {
        this.descPaisOrigen = descPaisOrigen;
    }

    
    @Column(name="ID_STATUS", nullable=false, length=2)
    public String getIdStatus() {
        return this.idStatus;
    }
    
    public void setIdStatus(String idStatus) {
        this.idStatus = idStatus;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FEC_MOVTO", length=7)
    public Date getFecMovto() {
        return this.fecMovto;
    }
    
    public void setFecMovto(Date fecMovto) {
        this.fecMovto = fecMovto;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cvcPaisorigen")
    public Set<TepVehiculo> getTepVehiculos() {
        return this.tepVehiculos;
    }
    
    public void setTepVehiculos(Set<TepVehiculo> tepVehiculos) {
        this.tepVehiculos = tepVehiculos;
    }




}

