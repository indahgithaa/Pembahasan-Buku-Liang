import java.util.*;

public class Soal5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //meminta pengguna memasukkan angka
        System.out.print("Masukkan angka dari 1 sampai 15: ");
        int angka = input.nextInt();
        
        //loop terluar: baris ke-i
        //loop terdalam: bilangan-bilangan atau spasi yang harus diprint di dalam satu baris ke-i
        for (int i = 1; i <= angka; i++) {
            
            //for loop pertama: mengoutputkan spasi kosong (sebanyak n spasi, di mana n = angka - i)
            for (int j = 1; j <= angka - i; j++) {
                System.out.print("  ");
            }
            
            //for loop kedua: mengoutputkan angka mundur dari i sampai 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            //for loop ketiga: mengoutputkan angka menaik dari 2 sampai i
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            //println kosong terakhir: membuat baris baru, atau menuju baris ke-(i + 1)
            System.out.println();
        }
    }
}
