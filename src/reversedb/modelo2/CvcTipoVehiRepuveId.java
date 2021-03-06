package reversedb.modelo2;
// Generated Jun 10, 2015 7:53:33 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CvcTipoVehiRepuveId generated by hbm2java
 */
@Embeddable
public class CvcTipoVehiRepuveId  implements java.io.Serializable {


     private String idClaseVehi;
     private String idTipoVehi;

    public CvcTipoVehiRepuveId() {
    }

    public CvcTipoVehiRepuveId(String idClaseVehi, String idTipoVehi) {
       this.idClaseVehi = idClaseVehi;
       this.idTipoVehi = idTipoVehi;
    }
   


    @Column(name="ID_CLASE_VEHI", nullable=false, length=2)
    public String getIdClaseVehi() {
        return this.idClaseVehi;
    }
    
    public void setIdClaseVehi(String idClaseVehi) {
        this.idClaseVehi = idClaseVehi;
    }


    @Column(name="ID_TIPO_VEHI", nullable=false, length=2)
    public String getIdTipoVehi() {
        return this.idTipoVehi;
    }
    
    public void setIdTipoVehi(String idTipoVehi) {
        this.idTipoVehi = idTipoVehi;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CvcTipoVehiRepuveId) ) return false;
		 CvcTipoVehiRepuveId castOther = ( CvcTipoVehiRepuveId ) other; 
         
		 return ( (this.getIdClaseVehi()==castOther.getIdClaseVehi()) || ( this.getIdClaseVehi()!=null && castOther.getIdClaseVehi()!=null && this.getIdClaseVehi().equals(castOther.getIdClaseVehi()) ) )
 && ( (this.getIdTipoVehi()==castOther.getIdTipoVehi()) || ( this.getIdTipoVehi()!=null && castOther.getIdTipoVehi()!=null && this.getIdTipoVehi().equals(castOther.getIdTipoVehi()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdClaseVehi() == null ? 0 : this.getIdClaseVehi().hashCode() );
         result = 37 * result + ( getIdTipoVehi() == null ? 0 : this.getIdTipoVehi().hashCode() );
         return result;
   }   


}


