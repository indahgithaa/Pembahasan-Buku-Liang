import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pekerja: ");
        int jmlPekerja = input.nextInt();

        int[][] jamKerja = new int[jmlPekerja][7];
        int[][] totalJamKerja = new int[jmlPekerja][2];

        for (int i = 0; i < jmlPekerja; i++) {
            System.out.println("Masukkan jam kerja untuk pekerja " + i + " selama 7 hari ");
            int total = 0;
            for (int j = 1; j <= 7; j++) {
                System.out.print("Hari ke-" + j + ": ");
                jamKerja[i][j-1] = input.nextInt();
                total += jamKerja[i][j-1];
            }
            totalJamKerja[i][0] = i;     
            totalJamKerja[i][1] = total; 
        }

        Arrays.sort(totalJamKerja, (a, b) -> Integer.compare(b[1], a[1]));

        System.out.println();
        System.out.println("Jam Kerja Harian Setiap Pekerja (diurutkan berdasarkan total jam kerja):");
        System.out.printf("%-15s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-10s\n", 
                        "Nomor Pekerja", "Su", "M", "T", "W", "Th", "F", "Sa", "Total");

        for (int i = 0; i < jmlPekerja; i++) {
            int empId = totalJamKerja[i][0];
            int totalHours = totalJamKerja[i][1];
            System.out.printf("Pekerja ke-%-4d", empId); 
            for (int j = 0; j < 7; j++) {
                System.out.printf("%-5d", jamKerja[empId][j]);
            }
            System.out.printf("%-10d\n", totalHours);
        }

        input.close();
    }
}
