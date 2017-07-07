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
 * RgcTipoasenta generated by hbm2java
 */
@Entity
@Table(name="RGC_TIPOASENTA"
    ,schema="SIR7_ING"
)
public class RgcTipoasenta  implements java.io.Serializable {


     private byte clavetipoasenta;
     private String descripcion;
     private Date fechainicio;
     private Date fechafin;
     private Set<RgcAsentamiento> rgcAsentamientos = new HashSet<RgcAsentamiento>(0);

    public RgcTipoasenta() {
    }

	
    public RgcTipoasenta(byte clavetipoasenta) {
        this.clavetipoasenta = clavetipoasenta;
    }
    public RgcTipoasenta(byte clavetipoasenta, String descripcion, Date fechainicio, Date fechafin, Set<RgcAsentamiento> rgcAsentamientos) {
       this.clavetipoasenta = clavetipoasenta;
       this.descripcion = descripcion;
       this.fechainicio = fechainicio;
       this.fechafin = fechafin;
       this.rgcAsentamientos = rgcAsentamientos;
    }
   
     @Id 

    
    @Column(name="CLAVETIPOASENTA", unique=true, nullable=false, precision=2, scale=0)
    public byte getClavetipoasenta() {
        return this.clavetipoasenta;
    }
    
    public void setClavetipoasenta(byte clavetipoasenta) {
        this.clavetipoasenta = clavetipoasenta;
    }

    
    @Column(name="DESCRIPCION", length=30)
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="rgcTipoasenta")
    public Set<RgcAsentamiento> getRgcAsentamientos() {
        return this.rgcAsentamientos;
    }
    
    public void setRgcAsentamientos(Set<RgcAsentamiento> rgcAsentamientos) {
        this.rgcAsentamientos = rgcAsentamientos;
    }




}


