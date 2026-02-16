package storage;

public class barangMakanan extends Barang{
    private String exp;

    public barangMakanan (String nama, String kode, int stok, String exp){
        super(nama, kode, stok);
        this.exp = exp;
    }

    public String getExp () {
        return exp;
    }

    @Override
    public String toString() {
        return String.format("%-15s | %-10s | %-5d | Exp: %-10s", getNama(), getKode(), getStok(), getExp());
    }
    
}