package reversedb.modelo2;
// Generated Jun 10, 2015 7:53:33 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
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
 * SgcTiposusuario generated by hbm2java
 */
@Entity
@Table(name="SGC_TIPOSUSUARIO"
    ,schema="SIR7_ING"
)
public class SgcTiposusuario  implements java.io.Serializable {


     private BigDecimal tipousuario;
     private String descripcion;
     private Date fechainicio;
     private Date fechafin;
     private Set<SgpUsuarios> sgpUsuarioses = new HashSet<SgpUsuarios>(0);

    public SgcTiposusuario() {
    }

	
    public SgcTiposusuario(BigDecimal tipousuario, String descripcion, Date fechainicio) {
        this.tipousuario = tipousuario;
        this.descripcion = descripcion;
        this.fechainicio = fechainicio;
    }
    public SgcTiposusuario(BigDecimal tipousuario, String descripcion, Date fechainicio, Date fechafin, Set<SgpUsuarios> sgpUsuarioses) {
       this.tipousuario = tipousuario;
       this.descripcion = descripcion;
       this.fechainicio = fechainicio;
       this.fechafin = fechafin;
       this.sgpUsuarioses = sgpUsuarioses;
    }
   
     @Id 

    
    @Column(name="TIPOUSUARIO", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getTipousuario() {
        return this.tipousuario;
    }
    
    public void setTipousuario(BigDecimal tipousuario) {
        this.tipousuario = tipousuario;
    }

    
    @Column(name="DESCRIPCION", nullable=false, length=50)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHAINICIO", nullable=false, length=7)
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="sgcTiposusuario")
    public Set<SgpUsuarios> getSgpUsuarioses() {
        return this.sgpUsuarioses;
    }
    
    public void setSgpUsuarioses(Set<SgpUsuarios> sgpUsuarioses) {
        this.sgpUsuarioses = sgpUsuarioses;
    }




}


