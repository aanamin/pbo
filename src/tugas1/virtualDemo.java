package tugas1;

public class virtualDemo {
    public static void main(String[] args) {
        //line 6 dan 7 termasuk  Polymorphism karena terdapat dua objek dengan bentuk yang berbeda
        gaji s = new gaji("Wahyu ", "Kubar", 3,5000.00  );
        pegawai e = new gaji("Ini nama", "Samarinda", 2, 2500.00); //upcasting karena method yang digunakan adalah method yang terdapat pada child class(gaji)
        
        System.out.println("memanggil mailCheck berdasarkan referensi gaji--");
        s.mailCheck();
        
        System.out.println("\nmemanggil mailCheck berdasarkan referensi pegawai--");
        e.mailCheck();
    }
    
}