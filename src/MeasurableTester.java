
/**
   This program demonstrates the measurable Country class.
*/
public class MeasurableTester
{
   public static void main(String[] args)
   {
     
	  //Countries
	  System.out.println("Countries Data");
	  Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);
      double avg=Data.average(countries);
      System.out.println("Average area: " + avg);
      System.out.println("Expected: 239950");
      System.out.println("");
      double maxData = Data.max(countries);
      System.out.println("Maximum area: " + maxData);
      System.out.println("Expected: 513120");
      System.out.println("");
     
      //Bank Accounts
      System.out.println("Bank account data");
      Measurable[] bank = new Measurable[3];
      bank[0] = (Measurable) new BankAccount(176220);
      bank[1] = (Measurable) new BankAccount(513120);
      bank[2] = (Measurable) new BankAccount(30510);
      avg=Data.average(bank);
      System.out.println("Average balance: " + avg);
      System.out.println("Expected: 239950");
      System.out.println("");
      maxData = Data.max(bank);
      System.out.println("Maximum balance: " + maxData);
      System.out.println("Expected: 513120");
      System.out.println("");

      
      //Quizzes
      System.out.println("Quiz Data");
      Measurable[] quizzes = new Measurable[5];
      quizzes[0] = new Quiz(95.0);
      quizzes[1] = new Quiz(80.0);
      quizzes[2] = new Quiz(90.0);
      quizzes[3] = new Quiz(50.0);
      quizzes[4] = new Quiz(75.0);
      avg = Data.average(quizzes);
      System.out.println("Average score: " + avg);
      System.out.println("Expected: 78");
      System.out.println("");
      
      maxData = Data.max(quizzes);
      System.out.println("Maximum score: " + maxData);
      System.out.println("Expected: 95");
      System.out.println("");

   }
}
