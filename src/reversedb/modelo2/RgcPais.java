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
 * RgcPais generated by hbm2java
 */
@Entity
@Table(name="RGC_PAIS"
    ,schema="SIR7_ING"
)
public class RgcPais  implements java.io.Serializable {


     private short clavepais;
     private String abreviatura;
     private String descripcion;
     private Date fechainicio;
     private Date fechafin;
     private Set<RgcEntidad> rgcEntidads = new HashSet<RgcEntidad>(0);

    public RgcPais() {
    }

	
    public RgcPais(short clavepais) {
        this.clavepais = clavepais;
    }
    public RgcPais(short clavepais, String abreviatura, String descripcion, Date fechainicio, Date fechafin, Set<RgcEntidad> rgcEntidads) {
       this.clavepais = clavepais;
       this.abreviatura = abreviatura;
       this.descripcion = descripcion;
       this.fechainicio = fechainicio;
       this.fechafin = fechafin;
       this.rgcEntidads = rgcEntidads;
    }
   
     @Id 

    
    @Column(name="CLAVEPAIS", unique=true, nullable=false, precision=4, scale=0)
    public short getClavepais() {
        return this.clavepais;
    }
    
    public void setClavepais(short clavepais) {
        this.clavepais = clavepais;
    }

    
    @Column(name="ABREVIATURA", length=20)
    public String getAbreviatura() {
        return this.abreviatura;
    }
    
    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="rgcPais")
    public Set<RgcEntidad> getRgcEntidads() {
        return this.rgcEntidads;
    }
    
    public void setRgcEntidads(Set<RgcEntidad> rgcEntidads) {
        this.rgcEntidads = rgcEntidads;
    }




}


