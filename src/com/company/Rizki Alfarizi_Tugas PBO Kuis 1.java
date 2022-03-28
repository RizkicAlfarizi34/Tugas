package com.company;

//Mahasiswa
class Mahasiswa {
    String nama;
    String jurusan;
    int semester;
    int NPM;
    double usia;
    double IPK;
    pustakawan perpus;

    //method
    void Pustakawan(pustakawan perpus){
        this.perpus = perpus;
    }

    //Constructor
    Mahasiswa(String nama, int NPM, int semester, String jurusan, double usia, double IPK) {
        this.nama = nama;
        this.NPM = NPM;
        this.semester = semester;
        this.jurusan = jurusan;
        this.usia = usia;
        this.IPK = IPK;

    }

    void Mahasiswa() {
        System.out.println(" Absensi Kehadiran Perpustakaan ");
        System.out.println("Nama     : " + nama);
        System.out.println("NPM      : " + NPM);
        System.out.println("Semester : " + semester);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("IPK      : " + IPK);
        System.out.println("Usia     : " + usia + "\n");
        perpus.detailPerpus();
    }
}

//pustakawan
class pustakawan{
    String namaPustakawan;
    double usiaPustakawan;

    //Constructor
    pustakawan(String namaPustakawan, double usiaPustakawan) {
        this.namaPustakawan = namaPustakawan;
        this.usiaPustakawan = usiaPustakawan;
    }

    //method
        void detailPerpus() {
            System.out.println(" ADMIN PERPUSTAKAAN ");
            System.out.println("Nama : " + namaPustakawan);
            System.out.println("Usia : " + usiaPustakawan);

    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa msh  = new Mahasiswa("Rizki Alfarizi", 2015061027, 4, "Teknik Informatika", 20,3.61);

        pustakawan  pstwkn= new pustakawan("sumiyatun", 45);

        msh.Pustakawan(pstwkn);

        msh.Mahasiswa();

    }
}