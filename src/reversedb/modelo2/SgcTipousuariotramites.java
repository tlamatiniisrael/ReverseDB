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
 * SgcTipousuariotramites generated by hbm2java
 */
@Entity
@Table(name="SGC_TIPOUSUARIOTRAMITES"
    ,schema="SIR7_ING"
)
public class SgcTipousuariotramites  implements java.io.Serializable {


     private BigDecimal idTipousuariocv;
     private String descripcion;
     private Date fechaInicio;
     private Date fechaBaja;
     private Set<CvcRequisitos> cvcRequisitoses = new HashSet<CvcRequisitos>(0);

    public SgcTipousuariotramites() {
    }

	
    public SgcTipousuariotramites(BigDecimal idTipousuariocv, String descripcion, Date fechaInicio) {
        this.idTipousuariocv = idTipousuariocv;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }
    public SgcTipousuariotramites(BigDecimal idTipousuariocv, String descripcion, Date fechaInicio, Date fechaBaja, Set<CvcRequisitos> cvcRequisitoses) {
       this.idTipousuariocv = idTipousuariocv;
       this.descripcion = descripcion;
       this.fechaInicio = fechaInicio;
       this.fechaBaja = fechaBaja;
       this.cvcRequisitoses = cvcRequisitoses;
    }
   
     @Id 

    
    @Column(name="ID_TIPOUSUARIOCV", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getIdTipousuariocv() {
        return this.idTipousuariocv;
    }
    
    public void setIdTipousuariocv(BigDecimal idTipousuariocv) {
        this.idTipousuariocv = idTipousuariocv;
    }

    
    @Column(name="DESCRIPCION", nullable=false, length=30)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    @Column(name="FECHA_BAJA", length=7)
    public Date getFechaBaja() {
        return this.fechaBaja;
    }
    
    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="sgcTipousuariotramites")
    public Set<CvcRequisitos> getCvcRequisitoses() {
        return this.cvcRequisitoses;
    }
    
    public void setCvcRequisitoses(Set<CvcRequisitos> cvcRequisitoses) {
        this.cvcRequisitoses = cvcRequisitoses;
    }




}

