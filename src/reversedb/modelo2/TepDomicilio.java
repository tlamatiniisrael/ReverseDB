package reversedb.modelo2;
// Generated Jun 10, 2015 7:53:33 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
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

/**
 * TepDomicilio generated by hbm2java
 */
@Entity
@Table(name="TEP_DOMICILIO"
    ,schema="SIR7_ING"
)
public class TepDomicilio  implements java.io.Serializable {


     private long clavedom;
     private RgcSitdom rgcSitdom;
     private RgcTipodom rgcTipodom;
     private String calle;
     private Long entrecalle1;
     private Long entrecallle2;
     private Long telefono1;
     private Long telefono2;
     private Long clavecatastral;
     private BigDecimal claveasentamiento;
     private String clavecp;
     private BigDecimal clavemunicipio;
     private BigDecimal claveentidad;
     private String numexterior;
     private String numinterior;
     private String descAsentamiento;
     private Set<TepContribuyente> tepContribuyentes = new HashSet<TepContribuyente>(0);

    public TepDomicilio() {
    }

	
    public TepDomicilio(long clavedom, RgcSitdom rgcSitdom, RgcTipodom rgcTipodom, String clavecp, BigDecimal clavemunicipio, BigDecimal claveentidad) {
        this.clavedom = clavedom;
        this.rgcSitdom = rgcSitdom;
        this.rgcTipodom = rgcTipodom;
        this.clavecp = clavecp;
        this.clavemunicipio = clavemunicipio;
        this.claveentidad = claveentidad;
    }
    public TepDomicilio(long clavedom, RgcSitdom rgcSitdom, RgcTipodom rgcTipodom, String calle, Long entrecalle1, Long entrecallle2, Long telefono1, Long telefono2, Long clavecatastral, BigDecimal claveasentamiento, String clavecp, BigDecimal clavemunicipio, BigDecimal claveentidad, String numexterior, String numinterior, String descAsentamiento, Set<TepContribuyente> tepContribuyentes) {
       this.clavedom = clavedom;
       this.rgcSitdom = rgcSitdom;
       this.rgcTipodom = rgcTipodom;
       this.calle = calle;
       this.entrecalle1 = entrecalle1;
       this.entrecallle2 = entrecallle2;
       this.telefono1 = telefono1;
       this.telefono2 = telefono2;
       this.clavecatastral = clavecatastral;
       this.claveasentamiento = claveasentamiento;
       this.clavecp = clavecp;
       this.clavemunicipio = clavemunicipio;
       this.claveentidad = claveentidad;
       this.numexterior = numexterior;
       this.numinterior = numinterior;
       this.descAsentamiento = descAsentamiento;
       this.tepContribuyentes = tepContribuyentes;
    }
   
     @Id 

    
    @Column(name="CLAVEDOM", unique=true, nullable=false, precision=10, scale=0)
    public long getClavedom() {
        return this.clavedom;
    }
    
    public void setClavedom(long clavedom) {
        this.clavedom = clavedom;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CLAVESITUACION", nullable=false)
    public RgcSitdom getRgcSitdom() {
        return this.rgcSitdom;
    }
    
    public void setRgcSitdom(RgcSitdom rgcSitdom) {
        this.rgcSitdom = rgcSitdom;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CLAVETIPODOM", nullable=false)
    public RgcTipodom getRgcTipodom() {
        return this.rgcTipodom;
    }
    
    public void setRgcTipodom(RgcTipodom rgcTipodom) {
        this.rgcTipodom = rgcTipodom;
    }

    
    @Column(name="CALLE", length=100)
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }

    
    @Column(name="ENTRECALLE1", precision=10, scale=0)
    public Long getEntrecalle1() {
        return this.entrecalle1;
    }
    
    public void setEntrecalle1(Long entrecalle1) {
        this.entrecalle1 = entrecalle1;
    }

    
    @Column(name="ENTRECALLLE2", precision=10, scale=0)
    public Long getEntrecallle2() {
        return this.entrecallle2;
    }
    
    public void setEntrecallle2(Long entrecallle2) {
        this.entrecallle2 = entrecallle2;
    }

    
    @Column(name="TELEFONO1", precision=10, scale=0)
    public Long getTelefono1() {
        return this.telefono1;
    }
    
    public void setTelefono1(Long telefono1) {
        this.telefono1 = telefono1;
    }

    
    @Column(name="TELEFONO2", precision=10, scale=0)
    public Long getTelefono2() {
        return this.telefono2;
    }
    
    public void setTelefono2(Long telefono2) {
        this.telefono2 = telefono2;
    }

    
    @Column(name="CLAVECATASTRAL", precision=10, scale=0)
    public Long getClavecatastral() {
        return this.clavecatastral;
    }
    
    public void setClavecatastral(Long clavecatastral) {
        this.clavecatastral = clavecatastral;
    }

    
    @Column(name="CLAVEASENTAMIENTO", precision=22, scale=0)
    public BigDecimal getClaveasentamiento() {
        return this.claveasentamiento;
    }
    
    public void setClaveasentamiento(BigDecimal claveasentamiento) {
        this.claveasentamiento = claveasentamiento;
    }

    
    @Column(name="CLAVECP", nullable=false, length=5)
    public String getClavecp() {
        return this.clavecp;
    }
    
    public void setClavecp(String clavecp) {
        this.clavecp = clavecp;
    }

    
    @Column(name="CLAVEMUNICIPIO", nullable=false, precision=22, scale=0)
    public BigDecimal getClavemunicipio() {
        return this.clavemunicipio;
    }
    
    public void setClavemunicipio(BigDecimal clavemunicipio) {
        this.clavemunicipio = clavemunicipio;
    }

    
    @Column(name="CLAVEENTIDAD", nullable=false, precision=22, scale=0)
    public BigDecimal getClaveentidad() {
        return this.claveentidad;
    }
    
    public void setClaveentidad(BigDecimal claveentidad) {
        this.claveentidad = claveentidad;
    }

    
    @Column(name="NUMEXTERIOR", length=40)
    public String getNumexterior() {
        return this.numexterior;
    }
    
    public void setNumexterior(String numexterior) {
        this.numexterior = numexterior;
    }

    
    @Column(name="NUMINTERIOR", length=20)
    public String getNuminterior() {
        return this.numinterior;
    }
    
    public void setNuminterior(String numinterior) {
        this.numinterior = numinterior;
    }

    
    @Column(name="DESC_ASENTAMIENTO", length=60)
    public String getDescAsentamiento() {
        return this.descAsentamiento;
    }
    
    public void setDescAsentamiento(String descAsentamiento) {
        this.descAsentamiento = descAsentamiento;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tepDomicilio")
    public Set<TepContribuyente> getTepContribuyentes() {
        return this.tepContribuyentes;
    }
    
    public void setTepContribuyentes(Set<TepContribuyente> tepContribuyentes) {
        this.tepContribuyentes = tepContribuyentes;
    }




}

