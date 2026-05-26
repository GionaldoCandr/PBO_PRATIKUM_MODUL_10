
class Buku {
    
    String isbn;
    String judul;


    public Buku(String isbn, String judul) {
        this.isbn = isbn;
        this.judul = judul;
     }

     public void cetakBuku() {
        System.out.println("Buku Ditemukan ");
        System.out.println("ISBN: " + isbn);
        System.out.println("Judul: " + judul);
     }



}
