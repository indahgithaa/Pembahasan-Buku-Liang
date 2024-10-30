public class Soal5_5 {
    public static void main(String[] args) {
        int kgAwal = 1;
        int poundsAwal = 20;
        
        int kgAkhir = 199;
        int poundsAkhir = 515;
        
        System.out.printf("%-15s%-15s|%-15s%-15s\n", "Kilograms", "Pounds", "Pounds", "Kilograms");
        
        //i = kg
        //j = pounds
        for (int i = kgAwal, j = poundsAwal; i <= kgAkhir && j <= poundsAkhir; i += 2, j += 5) {
            
            //hasil konversi kg ke pounds
            double hasilKePounds = i * 2.2;
            
            //hasil konversi pounds ke kg
            double hasilKeKg = j / 2.2;
            
            System.out.printf("%-15d%-15.1f|%-15d%-15.1f\n", i, hasilKePounds, j, hasilKeKg);
        }
    }
}
