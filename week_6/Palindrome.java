import java.util.Scanner;
// Kelas Main (program utama)
public class Palindrome {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("=========== Palindrome ===========");
      System.out.println("===== Ciptanur Wahid Putera =====");
      String again = "y";

      while(again.equalsIgnoreCase("y")){
        System.out.print("Masukkan kata: ");
        String input = scan.nextLine();
        TextGame game1 = new TextGame();
        TextGame game2 = new FancyTextGame();
        game1.displayResult(input);
        game2.displayResult(input);
        System.out.print("Apakah Anda ingin mencoba lagi? (y/n): ");
        again = scan.nextLine(); 
        System.out.println();
      }

    }
}