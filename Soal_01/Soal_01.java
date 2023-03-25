package Soal_01;

// UBAH CODE DI FILE INI AGAR MENGHASILKAN OUTPUT SESUAI INSTRUKSI PADA SOAL

public class Soal_01 {

   public static void main(String[] args) {

      int[] arr = {1, 9, 10, 3, 2, 5, 4, 7, 6, 8, 11, 13, 12, 14, 15};

      for (int x : arr) {
         String prime;
         if (MyLibrary.isPrimeNumber(x))
            prime =  "Ya"; 
         else 
            prime = "Tidak";
         String odd = MyLibrary.isOddNumber(x) ? "Ya" : "Tidak";
         String even = MyLibrary.isEvenNumber(x) ? "Ya" : "Tidak";
         System.out.println(String.format("n = %2d \t->\t isPrime ? %-10s\tisOdd ? %-10s\tisEven ? %-10s", x, prime, odd, even));
      }

   }
   
}