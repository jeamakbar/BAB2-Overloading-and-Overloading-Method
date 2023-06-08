package Prak3;

public class Main {
    public static void main(String[] args) {
      Perpus buku1 = new Perpus();
      buku1.setKategori("Fiksi");
      buku1.setPenulis("John Doe");
      buku1.setJudul("Kisah Kita");
      buku1.setPenerbitan("Gramedia");
      buku1.setEdisi("Pertama");
      buku1.setHalaman(200);
      buku1.setBahasa("Indonesia");
      buku1.setSinopsis("Sinopsis buku Kisah Kita...");
  
      Perpus buku2 = new Perpus();
      buku2.setKategori("Non-Fiksi");
      buku2.setPenulis("Jane Smith");
      buku2.setJudul("Panduan Pemrograman");
      buku2.setPenerbitan("Elex Media");
      buku2.setEdisi("Kedua");
      buku2.setHalaman(350);
      buku2.setBahasa("Indonesia");
      buku2.setSinopsis("Sinopsis buku Panduan Pemrograman...");
  
      buku1.displayMessage();
      System.out.println();
      buku2.displayMessage();
    }
  }  