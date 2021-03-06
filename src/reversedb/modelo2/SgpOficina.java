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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SgpOficina generated by hbm2java
 */
@Entity
@Table(name="SGP_OFICINA"
    ,schema="SIR7_ING"
)
public class SgpOficina  implements java.io.Serializable {


     private BigDecimal claveoficina;
     private SgcAdscripcion sgcAdscripcion;
     private RgcAsentamiento rgcAsentamiento;
     private BigDecimal clavetipooficina;
     private BigDecimal clavedependencia;
     private String nombreoficina;
     private String calle;
     private String numext;
     private String numint;
     private String telefono;
     private String contacto;
     private String telefonocont;
     private String email;
     private Date fechainicio;
     private Date fechafin;
     private Set<TetControlTramite> tetControlTramites = new HashSet<TetControlTramite>(0);

    public SgpOficina() {
    }

	
    public SgpOficina(BigDecimal claveoficina, String nombreoficina) {
        this.claveoficina = claveoficina;
        this.nombreoficina = nombreoficina;
    }
    public SgpOficina(BigDecimal claveoficina, SgcAdscripcion sgcAdscripcion, RgcAsentamiento rgcAsentamiento, BigDecimal clavetipooficina, BigDecimal clavedependencia, String nombreoficina, String calle, String numext, String numint, String telefono, String contacto, String telefonocont, String email, Date fechainicio, Date fechafin, Set<TetControlTramite> tetControlTramites) {
       this.claveoficina = claveoficina;
       this.sgcAdscripcion = sgcAdscripcion;
       this.rgcAsentamiento = rgcAsentamiento;
       this.clavetipooficina = clavetipooficina;
       this.clavedependencia = clavedependencia;
       this.nombreoficina = nombreoficina;
       this.calle = calle;
       this.numext = numext;
       this.numint = numint;
       this.telefono = telefono;
       this.contacto = contacto;
       this.telefonocont = telefonocont;
       this.email = email;
       this.fechainicio = fechainicio;
       this.fechafin = fechafin;
       this.tetControlTramites = tetControlTramites;
    }
   
     @Id 

    
    @Column(name="CLAVEOFICINA", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getClaveoficina() {
        return this.claveoficina;
    }
    
    public void setClaveoficina(BigDecimal claveoficina) {
        this.claveoficina = claveoficina;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CLAVEADSCRIPCION")
    public SgcAdscripcion getSgcAdscripcion() {
        return this.sgcAdscripcion;
    }
    
    public void setSgcAdscripcion(SgcAdscripcion sgcAdscripcion) {
        this.sgcAdscripcion = sgcAdscripcion;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="CLAVEASENTAMIENTO", referencedColumnName="CLAVEASENTAMIENTO"), 
        @JoinColumn(name="CLAVECP", referencedColumnName="CLAVECP"), 
        @JoinColumn(name="CLAVEENTIDAD", referencedColumnName="CLAVEENTIDAD"), 
        @JoinColumn(name="CLAVEMUNICIPIO", referencedColumnName="CLAVEMUNICIPIO") } )
    public RgcAsentamiento getRgcAsentamiento() {
        return this.rgcAsentamiento;
    }
    
    public void setRgcAsentamiento(RgcAsentamiento rgcAsentamiento) {
        this.rgcAsentamiento = rgcAsentamiento;
    }

    
    @Column(name="CLAVETIPOOFICINA", precision=22, scale=0)
    public BigDecimal getClavetipooficina() {
        return this.clavetipooficina;
    }
    
    public void setClavetipooficina(BigDecimal clavetipooficina) {
        this.clavetipooficina = clavetipooficina;
    }

    
    @Column(name="CLAVEDEPENDENCIA", precision=22, scale=0)
    public BigDecimal getClavedependencia() {
        return this.clavedependencia;
    }
    
    public void setClavedependencia(BigDecimal clavedependencia) {
        this.clavedependencia = clavedependencia;
    }

    
    @Column(name="NOMBREOFICINA", nullable=false, length=100)
    public String getNombreoficina() {
        return this.nombreoficina;
    }
    
    public void setNombreoficina(String nombreoficina) {
        this.nombreoficina = nombreoficina;
    }

    
    @Column(name="CALLE", length=100)
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }

    
    @Column(name="NUMEXT", length=50)
    public String getNumext() {
        return this.numext;
    }
    
    public void setNumext(String numext) {
        this.numext = numext;
    }

    
    @Column(name="NUMINT", length=50)
    public String getNumint() {
        return this.numint;
    }
    
    public void setNumint(String numint) {
        this.numint = numint;
    }

    
    @Column(name="TELEFONO", length=50)
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    @Column(name="CONTACTO", length=70)
    public String getContacto() {
        return this.contacto;
    }
    
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    
    @Column(name="TELEFONOCONT", length=70)
    public String getTelefonocont() {
        return this.telefonocont;
    }
    
    public void setTelefonocont(String telefonocont) {
        this.telefonocont = telefonocont;
    }

    
    @Column(name="EMAIL", length=50)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="sgpOficina")
    public Set<TetControlTramite> getTetControlTramites() {
        return this.tetControlTramites;
    }
    
    public void setTetControlTramites(Set<TetControlTramite> tetControlTramites) {
        this.tetControlTramites = tetControlTramites;
    }




}


