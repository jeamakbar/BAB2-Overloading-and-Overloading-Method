package Prak3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

class Perpus {
  private String kategori;
  private String penulis;
  private String judul;
  private String bahasa;
  private String penerbitan;
  private String edisi;
  private int halaman;
  private String[] penulisbanyak;
  private String sinopsis;

  public String[] getPenulisbanyak() {
    return penulisbanyak;
  }

  public void setPenulisbanyak(String[] s) {
    this.penulisbanyak = s;
  }

  public void setKategori(String s) {
    kategori = s;
  }

  public String getKategori() {
    return kategori;
  }

  public String getPenulis() {
    return penulis;
  }

  public String getJudul() {
    return judul;
  }

  public String getBahasa() {
    return bahasa;
  }

  public String getPenerbitan() {
    return penerbitan;
  }

  public String getEdisi() {
    return edisi;
  }

  public int getHalaman() {
    return halaman;
  }

  public String getSinopsis() {
    return sinopsis;
  }

  public void setPenulis(String s) {
    this.penulis = s;
  }

  public void setJudul(String s) {
    this.judul = s;
  }

  public void setPenerbitan(String s) {
    this.penerbitan = s;
  }

  public void setEdisi(String i) {
    this.edisi = i;
  }

  public void setHalaman(int i) {
    this.halaman = i;
  }

  public void setBahasa(String s) {
    this.bahasa = s;
  }

  public void setSinopsis(String s) {
    this.sinopsis = s;
  }

  public int hitungJumlahKataSinopsis() {
    String[] words = sinopsis.split("\\s+");
    return words.length;
  }

  public void simpanFile(String fileName) throws IOException {
    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
    writer.write("Judul: " + this.judul + "\n");
    writer.write("Kategori: " + this.kategori + "\n");
    if (this.penulisbanyak == null) {
      writer.write("Penulis: " + this.penulis + "\n");
    } else {
      writer.write("Penulis: " + Arrays.toString(this.penulisbanyak).replace("[", "").replace("]", "") + "\n");
    }
    writer.write("Penerbitan: " + this.penerbitan + "\n");
    writer.write("Edisi: " + this.edisi + "\n");
    writer.write("Jumlah Halaman: " + this.halaman + "\n");
    writer.write("Bahasa: " + this.bahasa + "\n");
    writer.write("Sinopsis: " + this.sinopsis + "\n");
    writer.write("Jumlah Kata Sinopsis: " + this.hitungJumlahKataSinopsis() + "\n");
    writer.close();
  }

  public double hitungRoyalti(double harga) {
    return 0.1 * harga;
  }

  public double hitungRoyalti(double hargaSatuan, double persen) {
    return hargaSatuan * persen / 100;
  }

  public void displayMessage() {
    System.out.println(judul);
    System.out.println("Kategori: " + kategori);
    System.out.println("Penulis: " + penulis);
    System.out.println("Penerbitan: " + penerbitan);
    System.out.println("Edisi: " + edisi);
    System.out.println("Jumlah Halaman: " + halaman);
    System.out.println("Bahasa: " + bahasa);
    System.out.println("Sinopsis: " + sinopsis);
    System.out.println("Jumlah Kata Sinopsis: " + hitungJumlahKataSinopsis());
  }

  public double cekKesamaan(Perpus p) {
    int similarity = 0;

    if (this.kategori.equals(p.getKategori())) {
      similarity++;
    }
    if (this.penulis.equals(p.getPenulis())) {
      similarity++;
    }
    if (this.judul.equals(p.getJudul())) {
      similarity++;
    }
    if (this.bahasa.equals(p.getBahasa())) {
      similarity++;
    }
    if (this.penerbitan.equals(p.getPenerbitan())) {
      similarity++;
    }
    if (this.edisi.equals(p.getEdisi())) {
      similarity++;
    }
    if (this.halaman == p.getHalaman()) {
      similarity++;
    }
    if (this.sinopsis.equals(p.getSinopsis())) {
      similarity++;
    }

    return (double) similarity / 8 * 100;
  }
}