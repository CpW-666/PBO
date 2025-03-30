public class Quiz {
   private String[] questions = {
         "Ibukota Indonesia adalah?",
         "Siapa yang memenangkan pemilu ditahun 2024?",
         "Dimanakah letak asli suku jawa?"
   };

   private String[][] options = {
         { "1. IKN", "2. Jakarta", "3. Merauke", "4. Bandung" },
         { "1. Anies", "2. Prabowo & Gibran", "3. Sebastian", "4. Bang ALex" },
         { "1. Papua", "2. Belanda", "3. Pulau Jawa", "4. Jawa tengah" }

   };
   private int[] correctAnswers = { 2, 2, 3 };
   private int score = 0;
   public int getQuestionCount() {
      return questions.length;
   }

   public void displayQuestion(int index) {
      System.out.println("\nPertanyaan " + (index + 1) + ":" + questions[index]);
      for (int i = 0; i < options[index].length; i++) {
         System.out.println(options[index][i]);
      }
   }

   public void checkAnswer(int index, int userAnswer) {
      if (userAnswer == correctAnswers[index]) {
         score += 10;
      } else {
         System.out.println("Jawaban Anda Salah Yang Benar Adalah : " + options[index][correctAnswers[index] - 1]);
      }
   }

   public int getScore() {
      return score;
   }
}