import java.util.*;
public class Bioskop{
    public static void main(String[] args) {
        
        
        Map<String, Film> jadwalFilm = new HashMap<>();
        jadwalFilm.put("F01", new Film("Avengers: Endgame", 50000));
        jadwalFilm.put("F02", new Film("Spider-Man: No Way Home", 45000));
        jadwalFilm.put("F03", new Film("Doctor Strange", 40000));

        Set<String> kursiTerisi = new HashSet<>();
        List<Transaksi> riwayatTransaksi = new ArrayList<>();


        String[][] antreanPesanan = {
            {"Gio", "F01", "A1"},  
            {"Dono", "F01", "A2"},  
            {"Imon", "F01", "B4"},  
            {"Robbo", "F01", "A1"},  
            {"Sobot", "F99", "C1"}   
        };

        for (String[] pesanan : antreanPesanan) {
            String nama = pesanan[0];
            String kode = pesanan[1];
            String kursi = pesanan[2];

            System.out.println("Memproses pesanan atas nama: " + nama + " (Kode: " + kode + ", Kursi: " + kursi + ")");

            if (jadwalFilm.containsKey(kode)) {
                Film filmDipilih = jadwalFilm.get(kode);

                if (kursiTerisi.add(kursi)) {
                    Transaksi trxBaru = new Transaksi(nama, filmDipilih.judul, kursi, filmDipilih.harga);
                    riwayatTransaksi.add(trxBaru);
                    System.out.println("  -> [SUKSES] Tiket berhasil dipesan!");
                } else {
                    System.out.println("  -> [GAGAL] Kursi " + kursi + " sudah terisi oleh pelanggan lain!");
                }

            } else {
                System.out.println("  -> [GAGAL] Kode Film '" + kode + "' tidak terdaftar di sistem!");
            }
        }

        int urutan = 1;
        for (Transaksi trx : riwayatTransaksi) {
            System.out.print(urutan + ". ");
            trx.cetakStruk();
            urutan++;
        }
    }
}