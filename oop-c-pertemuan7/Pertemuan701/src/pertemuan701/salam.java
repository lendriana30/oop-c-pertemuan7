package pertemuan701;

/**
 *
 * @author Lendriana
 * TGL: 8 Mei 2025
 */
public class salam {
    String tx = "Menggunakan Method tulisSalam tanpa parameter";
    
    public void tulisSalam(){
        System.out.println(this.tx);  
    }
    public void tulisSalam(String txt){
        System.out.println(txt);    
    }
    public void tulisSalam(int nim){
        System.out.println(nim);
    }
}

