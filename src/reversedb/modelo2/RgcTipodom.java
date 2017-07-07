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
 * RgcTipodom generated by hbm2java
 */
@Entity
@Table(name="RGC_TIPODOM"
    ,schema="SIR7_ING"
)
public class RgcTipodom  implements java.io.Serializable {


     private byte clavetipodom;
     private String descripion;
     private Date fechainicio;
     private Date fechafin;
     private Set<TepDomicilio> tepDomicilios = new HashSet<TepDomicilio>(0);

    public RgcTipodom() {
    }

	
    public RgcTipodom(byte clavetipodom) {
        this.clavetipodom = clavetipodom;
    }
    public RgcTipodom(byte clavetipodom, String descripion, Date fechainicio, Date fechafin, Set<TepDomicilio> tepDomicilios) {
       this.clavetipodom = clavetipodom;
       this.descripion = descripion;
       this.fechainicio = fechainicio;
       this.fechafin = fechafin;
       this.tepDomicilios = tepDomicilios;
    }
   
     @Id 

    
    @Column(name="CLAVETIPODOM", unique=true, nullable=false, precision=2, scale=0)
    public byte getClavetipodom() {
        return this.clavetipodom;
    }
    
    public void setClavetipodom(byte clavetipodom) {
        this.clavetipodom = clavetipodom;
    }

    
    @Column(name="DESCRIPION", length=30)
    public String getDescripion() {
        return this.descripion;
    }
    
    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHAINICIO", length=7)
    public Date getFechainicio() {
        return this.fechainicio;
    }
    
    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHAFIN", length=7)
    public Date getFechafin() {
        return this.fechafin;
    }
    
    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="rgcTipodom")
    public Set<TepDomicilio> getTepDomicilios() {
        return this.tepDomicilios;
    }
    
    public void setTepDomicilios(Set<TepDomicilio> tepDomicilios) {
        this.tepDomicilios = tepDomicilios;
    }




}


