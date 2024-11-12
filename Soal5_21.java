import java.util.*;

public class Soal5_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Number of Years: ");   
        int tahun = input.nextInt();

        System.out.printf("%-20s%-20s%-20s\n", "Interest Rate", "Monthly Payment", "Total Payment");

        // persen bunga pertahun awalnya adalah 5%, kemudian setiap iterasi bertambah 0.125% sampai menjadi 8% per tahun
        for (double persenBungaPerTahun = 5.0; persenBungaPerTahun <= 8.0; persenBungaPerTahun += 0.125) {
            //format dulu persen bunga per tahun agar diakhiri dengan tanda % dan 3 angka di belakang koma
            String formattedString = String.format("%.3f%%", persenBungaPerTahun);

            //mencari bunga per bulannya
            double persenBungaPerBulan = persenBungaPerTahun / 1200;
            
            //mencari biaya yang harus dibayar perbulan
            double monthlyPayment = (loanAmount * persenBungaPerBulan * Math.pow((1 + persenBungaPerBulan), 12 * tahun)) / (Math.pow((1 + persenBungaPerBulan), 12 * tahun) - 1);

            //mencari biaya total per setiap bunga per tahun
            double totalPayment = monthlyPayment * tahun * 12;

            //print setiap baris yang berisi persen bunga per tahun, biaya per bulan, dan total payment
            System.out.printf("%-20s%-20.2f%-20.2f\n", formattedString, monthlyPayment, totalPayment);
        }
    }
}
