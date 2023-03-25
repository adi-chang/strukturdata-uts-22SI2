package Soal_02;

public class Soal_02 {
   
   public static void main(String[] args) {
   
      int[] arr1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
   
      int[] arr2 = new int[arr1.length];

      for (int i = 0; i < arr1.length; i++) {
         arr2[i] = arr1[i] * arr1[i];
      }

      // display to monitor 
      System.out.println("array-1:\t\t\tarray-2:");
      for (int i = 0; i < arr1.length; i++) {
         System.out.println(String.format("%3d = %-20s\t%3d = %-20s", 
            arr1[i], (isPrimeNumber(arr1[i]) ? "Bilangan Prima" : "Bukan Bilangan Prima"),
            arr2[i], (isPrimeNumber(arr2[i]) ? "Bilangan Prima" : "Bukan Bilangan Prima")));
      }

   
   
   }

   public static boolean isPrimeNumber(int number) {
      int count = 0;
      for (int i = 1; i < number; i++) {
         if (number % i == 0) count++;
         if (count > 1) return false;
      }
      return count == 1;
   }

}
