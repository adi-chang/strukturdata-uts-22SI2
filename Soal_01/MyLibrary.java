package Soal_01;

public class MyLibrary {

   public static boolean isPrimeNumber(int number) {
      int count = 0;
      for (int i = 1; i < number; i++) {
         if (number % i == 0) count++;
         if (count > 1) return false;
      }
      return count == 1;
   }

   public static boolean isOddNumber(int number) {
      return number % 2 != 0;
   }


   public static boolean isEvenNumber(int number) {
      return number % 2 == 0;   
   }

}
