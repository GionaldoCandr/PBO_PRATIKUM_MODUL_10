class Transaksi {
    String namaPemesan;
    String judulFilm;
    String nomorKursi;
    int harga;

    public Transaksi(String namaPemesan, String judulFilm, String nomorKursi, int harga) {
        this.namaPemesan = namaPemesan;
        this.judulFilm = judulFilm;
        this.nomorKursi = nomorKursi;
        this.harga = harga;
    }

    public void cetakStruk() {
        System.out.println("Pemesan: " + namaPemesan + " | Film: " + judulFilm + " | Kursi: " + nomorKursi + " | Harga: Rp " + harga);
    }
}