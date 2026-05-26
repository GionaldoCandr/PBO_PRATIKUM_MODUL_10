import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet; 
import java.util.LinkedList;
import java.util.Set;

public class PreTestKedaiKopi {
    public static void main(String[] args) {
        
        // TODO 1: Struktur data untuk menyimpan Antrean pelanggan.
        ArrayList<String> antrean = new ArrayList<>();

        // TODO 2: Struktur data untuk menyimpan Nomor Meja yang sedang dipakai.
        HashSet<Integer> mejaTerisi = new HashSet<>();

        // TODO 3: Struktur data untuk menyimpan Daftar Harga Menu.
        HashMap<String, Integer> hargaMenu = new HashMap<>();


        // --- SIMULASI (TIDAK PERLU DIUBAH) ---
        antrean.add("Budi");
        antrean.add("Siti");

        mejaTerisi.add(4);
        mejaTerisi.add(7);
        mejaTerisi.add(4);  // Harus otomatis ditolak oleh sistem tanpa error

        if (mejaTerisi.size() > 4) {
            System.out.println("Maaf, meja sudah penuh. Silakan tunggu.");
        }

        hargaMenu.put("Kopi", 15000);
        hargaMenu.put("Teh", 10000);

        System.out.println("Daftar Antrean  : " + antrean);

        System.out.println("Meja Terisi     : " + mejaTerisi); 
        System.out.println("Harga Kopi      : Rp " + hargaMenu.get("Kopi"));




    }
}