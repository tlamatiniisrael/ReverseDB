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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RgcCp generated by hbm2java
 */
@Entity
@Table(name="RGC_CP"
    ,schema="SIR7_ING"
)
public class RgcCp  implements java.io.Serializable {


     private RgcCpId id;
     private RgcMunicipio rgcMunicipio;
     private Date fechainicio;
     private Date fechafin;
     private Set<RgcAsentamiento> rgcAsentamientos = new HashSet<RgcAsentamiento>(0);

    public RgcCp() {
    }

	
    public RgcCp(RgcCpId id, RgcMunicipio rgcMunicipio) {
        this.id = id;
        this.rgcMunicipio = rgcMunicipio;
    }
    public RgcCp(RgcCpId id, RgcMunicipio rgcMunicipio, Date fechainicio, Date fechafin, Set<RgcAsentamiento> rgcAsentamientos) {
       this.id = id;
       this.rgcMunicipio = rgcMunicipio;
       this.fechainicio = fechainicio;
       this.fechafin = fechafin;
       this.rgcAsentamientos = rgcAsentamientos;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="clavecp", column=@Column(name="CLAVECP", nullable=false, length=5) ), 
        @AttributeOverride(name="claveentidad", column=@Column(name="CLAVEENTIDAD", nullable=false, precision=2, scale=0) ), 
        @AttributeOverride(name="clavemunicipio", column=@Column(name="CLAVEMUNICIPIO", nullable=false, precision=4, scale=0) ) } )
    public RgcCpId getId() {
        return this.id;
    }
    
    public void setId(RgcCpId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="CLAVEENTIDAD", referencedColumnName="CLAVEENTIDAD", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="CLAVEMUNICIPIO", referencedColumnName="CLAVEMUNICIPIO", nullable=false, insertable=false, updatable=false) } )
    public RgcMunicipio getRgcMunicipio() {
        return this.rgcMunicipio;
    }
    
    public void setRgcMunicipio(RgcMunicipio rgcMunicipio) {
        this.rgcMunicipio = rgcMunicipio;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="rgcCp")
    public Set<RgcAsentamiento> getRgcAsentamientos() {
        return this.rgcAsentamientos;
    }
    
    public void setRgcAsentamientos(Set<RgcAsentamiento> rgcAsentamientos) {
        this.rgcAsentamientos = rgcAsentamientos;
    }




}


