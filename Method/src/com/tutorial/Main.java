package com.tutorial;
class Mahasiswa{
    //Data Mahasiswa
    String nama;
    String NIM;
    String Prodi;
    
    //Konstruktor
    Mahasiswa (String nama, String NIM, String Prodi) {
        this. nama = nama;
        this. NIM = NIM;
        this. Prodi = Prodi;

    }

    //Method tanpa parameter dan tanpa reaten
    void show(){
        System.out.println("nama: "+ this.nama);
        System.out.println("NIM: "+ this.NIM);
        System.out.println("Prodi: "+ this.Prodi);
    }
    //Method tanpa reaten dengan para meter
    void setNama(String nama, String NIM, String Prodi) {
        this. nama = nama;
        this. NIM = NIM;
        this. Prodi = Prodi;
    }

    //Method tanpa parameter dan dengan reaten
    String getnama(){
        return this. nama;
    }
    String getNIM(){
        return this. NIM;
    }
    //Method dengan para meter dan dengan return
    String sayHi(String pesan) {
        return pesan + "Aku " + this. nama + "";
    }

public class Main {
    public static void main(String[] args) {
        Mahasiswa Mhs1 = new Mahasiswa("Astiti Sofyati Zahra","22241070","Manajemen");

        //Memanggil Method
        Mhs1.show();
        Mhs1.setNama ("Admira Sabtatil Yadaini","22241073","PTI");
        Mhs1.show();
        
        System.out.println(Mhs1. getnama());
        System.out.println(Mhs1.getNIM());
        String pesan = Mhs1.sayHi("Hello ");
        System.out.println(pesan);
    }
}}
