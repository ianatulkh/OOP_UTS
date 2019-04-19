package service; 

import java.util.LinkedList;
import java.util.List;

import model.Buku;

public class BukuService {

    private static List<Buku> data = new LinkedList<>();

    public void addData(Buku bk) {
        data.add(bk);
        System.out.println("data telah tersimpan");
    }

    public void updateData(Buku bk) {
        int result = data.indexOf(bk);
        
        if(result >= 0) {
            data.set(result, bk);
            System.out.println("data telah diubah");
        } else {
            System.out.println("data yang ingin diubah tidak ditemukan");
        }
    }

    public void deleteData(Buku bk) {
        int result = data.indexOf(bk);

        if(result >= 0) {
            data.remove(result);
            System.out.println("data telah terhapus");
        } else {
            System.out.println("Data yang ingin dihapus tidak ada");
        }
    }

    public List<Buku> getAllData() {
        return data;
    }

}