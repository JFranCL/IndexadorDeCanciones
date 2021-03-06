package indexadorv2;
// Generated 09-feb-2021 15:52:52 by Hibernate Tools 4.3.1



/**
 * CancionesId generated by hbm2java
 */
public class CancionesId  implements java.io.Serializable {


     private String titulo;
     private String artista;

    public CancionesId() {
    }

    public CancionesId(String titulo, String artista) {
       this.titulo = titulo;
       this.artista = artista;
    }
   
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getArtista() {
        return this.artista;
    }
    
    public void setArtista(String artista) {
        this.artista = artista;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CancionesId) ) return false;
		 CancionesId castOther = ( CancionesId ) other; 
         
		 return ( (this.getTitulo()==castOther.getTitulo()) || ( this.getTitulo()!=null && castOther.getTitulo()!=null && this.getTitulo().equals(castOther.getTitulo()) ) )
 && ( (this.getArtista()==castOther.getArtista()) || ( this.getArtista()!=null && castOther.getArtista()!=null && this.getArtista().equals(castOther.getArtista()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTitulo() == null ? 0 : this.getTitulo().hashCode() );
         result = 37 * result + ( getArtista() == null ? 0 : this.getArtista().hashCode() );
         return result;
   }   


}


