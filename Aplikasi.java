import java.util.LinkedList; 
import java.util.Scanner;
import model.*;
import service.*;

public class Aplikasi {

    private static Scanner scanner;
    private static BukuService service;

    public static void main(String args[]) {
        int opsi = 0;
        scanner = new Scanner(System.in);
        service = new BukuService();

        do {
            cetakMenu();
            opsi = scanner.nextInt();
            switch(opsi) {
                case 1 :
                  modulAdd();
                  break;
                case 2 :
                  ubahData(); break;
                case 3 :
                  hapusData(); break;
                case 4 :
                  tampilData();
                  break;
            }
        } while(opsi != 0);

    }

    private static void cetakMenu() {
        System.out.println("\n\n");
        System.out.println("APLIKASI PEREKAMAN BUKU DI PERPUSTAKAAN");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan data");
        System.out.println("-----------");
        System.out.println("0. KELUAR");
        System.out.println("\n");
        System.out.print("Pilihan > ");
    }

    private static void modulAdd() {
        String kode, judul, pengarang, penerbit;

        System.out.println("--- tambah data ---");
        System.out.print("KODE : "); 
        scanner = new Scanner(System.in);
        kode = scanner.nextLine();
        System.out.print("Judul : ");
        judul = scanner.nextLine();
        System.out.print("Pengarang : ");
        pengarang = scanner.nextLine();
        System.out.print("Penerbit : ");
        penerbit = scanner.nextLine();
        service.addData(new Buku(kode, judul, pengarang, penerbit));
    }

    private static void tampilData() {
        LinkedList<Buku> result = (LinkedList<Buku>) service.getAllData();

        int i=1;
        for(Buku bk : result) {
            System.out.println("data ke-" + i++);
            System.out.println("  kode: " + bk.getKode());
            System.out.println("  judul: " + bk.getJudul());
            System.out.println("  pengarang: " + bk.getPengarang());
            System.out.println("  penerbit: " + bk.getPenerbit());
        }
    }

    private static void ubahData() {
        String kode, judul, pengarang, penerbit;

        System.out.println("--- perubahan data ---");
        System.out.print("KODE : "); 
        scanner = new Scanner(System.in);
        kode = scanner.nextLine();
        System.out.print("Judul : ");
        judul = scanner.nextLine();
        System.out.print("Pengarang : ");
        pengarang = scanner.nextLine();
        System.out.print("Penerbit : ");
        penerbit = scanner.nextLine();
        service.updateData(new Buku(kode, judul, pengarang, penerbit));
    }

    private static void hapusData() {
        String nim;

        System.out.println("--- hapus data ---");
        System.out.print("KODE : ");
        scanner = new Scanner(System.in);
        nim = scanner.nextLine();
        service.deleteData(new Buku(nim, null, null, null));
    }

}