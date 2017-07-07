package reversedb.modelo2;
// Generated Jun 10, 2015 7:53:33 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RgcMunicipioId generated by hbm2java
 */
@Embeddable
public class RgcMunicipioId  implements java.io.Serializable {


     private byte claveentidad;
     private short clavemunicipio;

    public RgcMunicipioId() {
    }

    public RgcMunicipioId(byte claveentidad, short clavemunicipio) {
       this.claveentidad = claveentidad;
       this.clavemunicipio = clavemunicipio;
    }
   


    @Column(name="CLAVEENTIDAD", nullable=false, precision=2, scale=0)
    public byte getClaveentidad() {
        return this.claveentidad;
    }
    
    public void setClaveentidad(byte claveentidad) {
        this.claveentidad = claveentidad;
    }


    @Column(name="CLAVEMUNICIPIO", nullable=false, precision=4, scale=0)
    public short getClavemunicipio() {
        return this.clavemunicipio;
    }
    
    public void setClavemunicipio(short clavemunicipio) {
        this.clavemunicipio = clavemunicipio;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RgcMunicipioId) ) return false;
		 RgcMunicipioId castOther = ( RgcMunicipioId ) other; 
         
		 return (this.getClaveentidad()==castOther.getClaveentidad())
 && (this.getClavemunicipio()==castOther.getClavemunicipio());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getClaveentidad();
         result = 37 * result + this.getClavemunicipio();
         return result;
   }   


}


