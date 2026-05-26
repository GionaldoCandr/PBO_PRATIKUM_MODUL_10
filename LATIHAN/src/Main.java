import java.util.*;


public class Main{
    public static void main(String[] args) throws Exception {


        // Latihan nomor 1
        System.out.println("Latihan nomor 1");
     Map<String, Buku> buku = new HashMap<>();

        buku.put("978-3-16-148410-0", new Buku("978-3-16-148410-0", "Belajar Java"));
        buku.put("978-1-23-456789-7", new Buku("978-1-23-456789-7", "Belajar Python"));
        buku.put("978-2-34-567890-8", new Buku("978-2-34-567890-8", "Belajar C++"));

        buku.get("978-3-16-148410-0").cetakBuku();
        buku.get("978-1-23-456789-7").cetakBuku();
        buku.get("978-2-34-567890-8").cetakBuku();
        System.out.println("================================");


    
        // Latihan nomor 2
        System.out.println("Latihan nomor 2");


        Set<Anggota> anggotaSet = new HashSet<>();

        anggotaSet.add(new Anggota("A001", "Gio", "Dosen"));
        anggotaSet.add(new Anggota("A002", "Dio", "Mahasiswa"));
        anggotaSet.add(new Anggota("A003", "Rio", "Dosen"));
        anggotaSet.add(new Anggota("A002", "Rico", "Mahasiswa"));


        System.out.println("Daftar Anggota:" + anggotaSet.size());
        for (Anggota anggota : anggotaSet) {
            anggota.cetakAnggota();
        }
        System.out.println("================================");

    

    
}
}
