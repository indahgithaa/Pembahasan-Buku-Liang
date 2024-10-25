import java.util.*;

class Soal5_1 {
    public static void main(String[] args) {
        //menyimpan berapa banyak angka positif
        int jumlahAngkaPos = 0;
        
        //menyimpan berapa banyak angka negatif
        int jumlahAngkaMin = 0;
        
        //menyimpan totalnya
        double total = 0;
        
        //menyimpan rata-rata
        double ratarata = 0;
        
        //buat scanner
        Scanner input = new Scanner(System.in);
        
        //siapkan variabel yang digunakan untuk menyimpan angka yang dimasukkan setiap kali input
        int angkaYangDiinput = 0;
        
        // while loop berjalan selama input angkaYangDiinput != 0
        while (true) {
            angkaYangDiinput = input.nextInt();
            
            if (angkaYangDiinput > 0) {
                jumlahAngkaPos++;
                total += angkaYangDiinput;
            } else if (angkaYangDiinput < 0) {
                jumlahAngkaMin++;
                total += angkaYangDiinput;
            } else {
                // jika angkaYangDiinput = 0, maka program akan berhenti
                break;
            }
            
            System.out.println("nomor positif muncul sebanyak " + jumlahAngkaPos);
            System.out.println("nomor negatif muncul sebanyak " + jumlahAngkaMin);
            System.out.println("total saat ini " + total);
            System.out.println("rata saat ini " + total);
        }
    }
}
