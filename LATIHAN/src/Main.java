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
        anggotaSet.add(new Anggota("A004", "Gico", "Mahasiswa"));


        System.out.println("Daftar Anggota:" + anggotaSet.size());
        for (Anggota anggota : anggotaSet) {
            anggota.cetakAnggota();
        }
        System.out.println("================================");



        // Latihan nomor 3
        System.out.println("Latihan nomor 3");
        LinkedList<Anggota> anggotaList = new LinkedList<>();

        // Dosen diletakkan paling depan
        anggotaList.add(new Anggota("A", "Gio", "Dosen"));
        anggotaList.add(new Anggota("C", "Rio", "Dosen"));


        // Mahasiswa diletakkan paling belakang
        anggotaList.add(new Anggota("B", "Dio", "Mahasiswa"));
        anggotaList.add(new Anggota("D", "Gico", "Mahasiswa"));


        System.out.println("Daftar Anggota: " + anggotaList);

        // Menampilkan tipe anggota dengan tipe Dosen

        String depanDosen = anggotaList.getFirst().nama;
        String belakangMahasiswa = anggotaList.getLast().nama;

        System.out.println("Nama anggota paling depan: " + depanDosen + " || " + "Nama anggota paling belakang: " + belakangMahasiswa);
    ;
        System.out.println("================================");


    // Latihan nomor 4

    System.out.println("Latihan nomor 4");
    

        
        Queue<String> antreanPeminjaman = new LinkedList<>();
        antreanPeminjaman.add("A001#978-3-16-148410-0"); // Valid (Buku Java)
        antreanPeminjaman.add("A099#978-1-23-456789-7"); // Invalid: Anggota tidak ada
        antreanPeminjaman.add("A002#111-0-00-000000-0"); // Invalid: Buku tidak ada
        antreanPeminjaman.add("A004#978-3-16-148410-0"); // Invalid: Buku sedang dipinjam (oleh A001)

        Set<String> bukuSedangDipinjam = new HashSet<>();

        while (!antreanPeminjaman.isEmpty()) {
            
            String request = antreanPeminjaman.poll(); 
            String[] dataSplit = request.split("#");
            String idAnggotaReq = dataSplit[0];
            String isbnReq = dataSplit[1];

            System.out.println("\nMemproses Request: " + request);

            boolean isAnggotaTerdaftar = false;
            for (Anggota anggota : anggotaSet) {
                if (anggota.idAnggota.equals(idAnggotaReq)) {
                    isAnggotaTerdaftar = true;
                    break;
                }
            }

            boolean isBukuTerdaftar = buku.containsKey(isbnReq);

            boolean isSedangDipinjam = bukuSedangDipinjam.contains(isbnReq);
            if (!isAnggotaTerdaftar) {
                System.out.println("  -> DITOLAK: Anggota dengan ID '" + idAnggotaReq + "' tidak terdaftar di sistem.");
            } else if (!isBukuTerdaftar) {
                System.out.println("  -> DITOLAK: Buku dengan ISBN '" + isbnReq + "' tidak terdaftar di katalog.");
            } else if (isSedangDipinjam) {
                System.out.println("  -> DITOLAK: Buku '" + isbnReq + "' saat ini sedang dipinjam oleh orang lain.");
            } else {
                bukuSedangDipinjam.add(isbnReq);
                System.out.println("  -> BERHASIL: Anggota '" + idAnggotaReq + "' meminjam buku '" + isbnReq + "'.");
            }
        }
        System.out.println("\nKoleksi Buku Sedang Dipinjam saat ini: " + bukuSedangDipinjam);
        System.out.println("================================");

        // Latihan nomor 5
    System.out.println("Latihan nomor 5");
    
        Set<String> laporanBukuTerurut = new TreeSet<>();
        for (String isbnDipinjam : bukuSedangDipinjam) {
            
            Buku bukuPinjam = buku.get(isbnDipinjam);
            
            if (bukuPinjam != null) {
                laporanBukuTerurut.add(bukuPinjam.judul); 
            }
        }

        System.out.println("LAPORAN BUKU SEDANG DIPINJAM (Terurut A-Z):");
        if (laporanBukuTerurut.isEmpty()) {
            System.out.println("Belum ada buku yang sedang dipinjam.");
        } else {
            int urutan = 1;
            for (String judulBuku : laporanBukuTerurut) {
                System.out.println(urutan + ". " + judulBuku);
                urutan++;
            }
        }
        System.out.println("================================");





    

    
}
}
