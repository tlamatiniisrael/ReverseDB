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
 * RgcSitcont generated by hbm2java
 */
@Entity
@Table(name="RGC_SITCONT"
    ,schema="SIR7_ING"
)
public class RgcSitcont  implements java.io.Serializable {


     private byte clavesitcont;
     private String descripcion;
     private Date fechainicio;
     private Date fechafin;
     private Set<TepContribuyente> tepContribuyentes = new HashSet<TepContribuyente>(0);

    public RgcSitcont() {
    }

	
    public RgcSitcont(byte clavesitcont) {
        this.clavesitcont = clavesitcont;
    }
    public RgcSitcont(byte clavesitcont, String descripcion, Date fechainicio, Date fechafin, Set<TepContribuyente> tepContribuyentes) {
       this.clavesitcont = clavesitcont;
       this.descripcion = descripcion;
       this.fechainicio = fechainicio;
       this.fechafin = fechafin;
       this.tepContribuyentes = tepContribuyentes;
    }
   
     @Id 

    
    @Column(name="CLAVESITCONT", unique=true, nullable=false, precision=2, scale=0)
    public byte getClavesitcont() {
        return this.clavesitcont;
    }
    
    public void setClavesitcont(byte clavesitcont) {
        this.clavesitcont = clavesitcont;
    }

    
    @Column(name="DESCRIPCION", length=50)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="rgcSitcont")
    public Set<TepContribuyente> getTepContribuyentes() {
        return this.tepContribuyentes;
    }
    
    public void setTepContribuyentes(Set<TepContribuyente> tepContribuyentes) {
        this.tepContribuyentes = tepContribuyentes;
    }




}


