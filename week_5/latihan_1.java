import java.util.Scanner;
public class Latihan_1 {
   public static void main(String[] args){
      Scanner scanner=new Scanner(System.in);
      System.out.print("Masukkan jumlah data: ");
      int data= scanner.nextInt();
      int[] array = new int[data];


      for (int i=0 ; i<data ; i++) {
         System.out.print("Input data ke [" + (i+1) + "] : ");
         array[i]= scanner.nextInt();
      }      
      
      
      for (int i=0 ; i<data ; i++) {
         System.out.println("Data ke - "+ (i+1) + ": " + array[i]);
      }      
   }
}