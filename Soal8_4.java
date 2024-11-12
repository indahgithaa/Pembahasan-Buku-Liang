import java.util.*;

public class Soal8_4 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       System.out.print("Masukkan jumlah pekerja: ");
       int jumlahPekerja = in.nextInt();
       
       //kita butuh 2 array dua dimensi, untuk menyimpan jam kerja mereka di setiap harinya DAN untuk menyimpan total jam kerja mereka selama 7 hari.
       
       //array ke-1: menyimpan jam kerja masing-masing pegawai
       int[][] jamKerja = new int[jumlahPekerja][7];
       
       //array ke-2: menyimpan nomor pekerja (misal employee 0) dan total jam kerja mereka dalam 7 hari
       int[][] totalJamKerja = new int[jumlahPekerja][2];
       
       //memasukkan jam kerja per hari setiap employee DAN langsung mencari total kerja mereka masing-masing selama 7 hari
       for (int i = 0; i < jumlahPekerja; i++) {
           System.out.println("Masukkan jumlah jam kerja employee ke-" +  i + " selama 7 hari");
           int totalJamKerja7Hari = 0;
           for(int j = 0; j < 7; j++) {
               System.out.print("Hari ke-" + (j+1) + ": ");
               jamKerja[i][j] = in.nextInt();
               totalJamKerja7Hari += jamKerja[i][j];
           }
           totalJamKerja[i][0] = i;
           totalJamKerja[i][1] = totalJamKerja7Hari;
       }
       
       //ketika kedua array sudah terisi, baru kita sorting dari employee yang punya totalJamKerja paling banyak
       Arrays.sort(totalJamKerja, (a, b) -> Integer.compare(b[1], a[1]));
       
       //print array 2d yang isinya jam kerja employee per hari yang sudah diurutkan berdasarkan totalJamKerja paling besar
       System.out.println();
       System.out.println("Jam Kerja Harian Setiap Pekerja (diurutkan berdasarkan total jam kerja):");
       System.out.printf("%-15s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-10s\n",  "Nomor Pekerja", "Su", "M", "T", "W", "Th", "F", "Sa", "Total");
       
       for (int i = 0; i < jumlahPekerja; i++) {
           int nomorPekerja = totalJamKerja[i][0];
           int totalKerja7Hari = totalJamKerja[i][1];
           System.out.printf("Pekerja ke-%-4d", nomorPekerja);
           for (int j = 0; j < 7; j++) {
               System.out.printf("%-5d", jamKerja[nomorPekerja][j]);
           }
           System.out.printf("%-5d\n", totalKerja7Hari);
       }
    }
}
