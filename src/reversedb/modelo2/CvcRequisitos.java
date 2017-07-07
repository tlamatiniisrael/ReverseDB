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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * CvcRequisitos generated by hbm2java
 */
@Entity
@Table(name="CVC_REQUISITOS"
    ,schema="SIR7_ING"
)
public class CvcRequisitos  implements java.io.Serializable {


     private BigDecimal claverequisito;
     private Boolean version;
     private SgcTipousuariotramites sgcTipousuariotramites;
     private Date fecIniVig;
     private Date fecFinVig;
     private Short prioridad;
     private String descripcionlarga;
     private String tooltip;
     private Boolean esencabezado;
     private String nombrearchivo;
     private String tmpdesc;
     private String descripcion;
     private short idgrupo;
     private byte tipopersonafiscal;
     private byte maximoimagenes;
     private Set<TetImagenes> tetImageneses = new HashSet<TetImagenes>(0);

    public CvcRequisitos() {
    }

	
    public CvcRequisitos(BigDecimal claverequisito, short idgrupo, byte tipopersonafiscal, byte maximoimagenes) {
        this.claverequisito = claverequisito;
        this.idgrupo = idgrupo;
        this.tipopersonafiscal = tipopersonafiscal;
        this.maximoimagenes = maximoimagenes;
    }
    public CvcRequisitos(BigDecimal claverequisito, SgcTipousuariotramites sgcTipousuariotramites, Date fecIniVig, Date fecFinVig, Short prioridad, String descripcionlarga, String tooltip, Boolean esencabezado, String nombrearchivo, String tmpdesc, String descripcion, short idgrupo, byte tipopersonafiscal, byte maximoimagenes, Set<TetImagenes> tetImageneses) {
       this.claverequisito = claverequisito;
       this.sgcTipousuariotramites = sgcTipousuariotramites;
       this.fecIniVig = fecIniVig;
       this.fecFinVig = fecFinVig;
       this.prioridad = prioridad;
       this.descripcionlarga = descripcionlarga;
       this.tooltip = tooltip;
       this.esencabezado = esencabezado;
       this.nombrearchivo = nombrearchivo;
       this.tmpdesc = tmpdesc;
       this.descripcion = descripcion;
       this.idgrupo = idgrupo;
       this.tipopersonafiscal = tipopersonafiscal;
       this.maximoimagenes = maximoimagenes;
       this.tetImageneses = tetImageneses;
    }
   
     @Id 

    
    @Column(name="CLAVEREQUISITO", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getClaverequisito() {
        return this.claverequisito;
    }
    
    public void setClaverequisito(BigDecimal claverequisito) {
        this.claverequisito = claverequisito;
    }

    @Version
    @Column(name="VERSION", precision=1, scale=0)
    public Boolean getVersion() {
        return this.version;
    }
    
    public void setVersion(Boolean version) {
        this.version = version;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_TIPOUSUARIOCV")
    public SgcTipousuariotramites getSgcTipousuariotramites() {
        return this.sgcTipousuariotramites;
    }
    
    public void setSgcTipousuariotramites(SgcTipousuariotramites sgcTipousuariotramites) {
        this.sgcTipousuariotramites = sgcTipousuariotramites;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FEC_INI_VIG", length=7)
    public Date getFecIniVig() {
        return this.fecIniVig;
    }
    
    public void setFecIniVig(Date fecIniVig) {
        this.fecIniVig = fecIniVig;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FEC_FIN_VIG", length=7)
    public Date getFecFinVig() {
        return this.fecFinVig;
    }
    
    public void setFecFinVig(Date fecFinVig) {
        this.fecFinVig = fecFinVig;
    }

    
    @Column(name="PRIORIDAD", precision=4, scale=0)
    public Short getPrioridad() {
        return this.prioridad;
    }
    
    public void setPrioridad(Short prioridad) {
        this.prioridad = prioridad;
    }

    
    @Column(name="DESCRIPCIONLARGA", length=100)
    public String getDescripcionlarga() {
        return this.descripcionlarga;
    }
    
    public void setDescripcionlarga(String descripcionlarga) {
        this.descripcionlarga = descripcionlarga;
    }

    
    @Column(name="TOOLTIP", length=300)
    public String getTooltip() {
        return this.tooltip;
    }
    
    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    
    @Column(name="ESENCABEZADO", precision=1, scale=0)
    public Boolean getEsencabezado() {
        return this.esencabezado;
    }
    
    public void setEsencabezado(Boolean esencabezado) {
        this.esencabezado = esencabezado;
    }

    
    @Column(name="NOMBREARCHIVO", length=50)
    public String getNombrearchivo() {
        return this.nombrearchivo;
    }
    
    public void setNombrearchivo(String nombrearchivo) {
        this.nombrearchivo = nombrearchivo;
    }

    
    @Column(name="TMPDESC")
    public String getTmpdesc() {
        return this.tmpdesc;
    }
    
    public void setTmpdesc(String tmpdesc) {
        this.tmpdesc = tmpdesc;
    }

    
    @Column(name="DESCRIPCION")
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="IDGRUPO", nullable=false, precision=3, scale=0)
    public short getIdgrupo() {
        return this.idgrupo;
    }
    
    public void setIdgrupo(short idgrupo) {
        this.idgrupo = idgrupo;
    }

    
    @Column(name="TIPOPERSONAFISCAL", nullable=false, precision=2, scale=0)
    public byte getTipopersonafiscal() {
        return this.tipopersonafiscal;
    }
    
    public void setTipopersonafiscal(byte tipopersonafiscal) {
        this.tipopersonafiscal = tipopersonafiscal;
    }

    
    @Column(name="MAXIMOIMAGENES", nullable=false, precision=2, scale=0)
    public byte getMaximoimagenes() {
        return this.maximoimagenes;
    }
    
    public void setMaximoimagenes(byte maximoimagenes) {
        this.maximoimagenes = maximoimagenes;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cvcRequisitos")
    public Set<TetImagenes> getTetImageneses() {
        return this.tetImageneses;
    }
    
    public void setTetImageneses(Set<TetImagenes> tetImageneses) {
        this.tetImageneses = tetImageneses;
    }




}

