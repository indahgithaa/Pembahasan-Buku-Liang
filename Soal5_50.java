import java.util.*;

class Soal5_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //mengambil teks string
        String text = input.nextLine();
        
        //menyimpan jumlah kemunculan kapital
        int kapital = 0;
        
        //iterasi dari karakter ke-0 sampai karakter ke text.length() - 1, jika isUpperCase bernilai true maka variabel 'kapital' bertambah 1
        for (int i = 0; i <= text.length() - 1; i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                kapital++;
            }
        }
        
        //jika loop sudah selesai, dicetak
        System.out.println("The number of uppercase letters is " + kapital);
        
    }
}
