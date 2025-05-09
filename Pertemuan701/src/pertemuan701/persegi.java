package pertemuan701;

/**
 *
 * @author Made Artha
 * TGL 09 Mei 2025
 */
public class persegi extends BangunRuang {
    private int panjang, lebar;
    
    public void setPanjang(int pj){
        this.panjang = pj;
    }
    public void setLebar(int lb){
        this.lebar = lb;
    }
    @Override
    public void hitungLuas(){
        this.luas = this.panjang*this.lebar;
        
        System.out.printf("Hitung Luas Persegi Panjang\n");
        System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.printf("Luas = Panjang X Lebar\n");
        System.out.printf("     = %d X %d\n", this.panjang, this.lebar );
        System.out.printf("     = %.2f\n", this.luas);
    }
}
