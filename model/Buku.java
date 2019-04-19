package model; 

public class Buku {

    private String kode;
    private String judul;
    private String pengarang;
    private String penerbit;

    public Buku() {}

    public Buku(String kode, String judul, String pengarang, String penerbit) {
        this.kode=kode;
        this.judul=judul;
        this.pengarang=pengarang;
        this.penerbit=penerbit;
    }

    @Override
    public boolean equals(Object obj) {
        Buku buku = (Buku) obj;
        if(this.kode.equals(buku.getKode())) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "[ " + kode + ", " + judul + ", " + pengarang + ", " + penerbit + " ];";
    }
    public String getKode() {
        return kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getPengarang() {
        return pengarang;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public String getPenerbit() {
        return penerbit;
    }
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    
}