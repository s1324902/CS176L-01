import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MeasurableViewer {

	   private static final int FRAME_WIDTH = 100;
	   private static final int FRAME_HEIGHT = 100;
	   
   public static void main(String[] args)
   {
     
	  //Countries
	  Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);
    
     
      //Bank Accounts
      Measurable[] bank = new Measurable[3];
      bank[0] = (Measurable) new BankAccount(176220);
      bank[1] = (Measurable) new BankAccount(513120);
      bank[2] = (Measurable) new BankAccount(30510);
  
      
      //Quizzes
      Measurable[] quizzes = new Measurable[5];
      quizzes[0] = new Quiz(95.0);
      quizzes[1] = new Quiz(80.0);
      quizzes[2] = new Quiz(90.0);
      quizzes[3] = new Quiz(50.0);
      quizzes[4] = new Quiz(75.0);
      
      
     System.out.print("Enter metric to use, 1 for maximum, 2 for minimum, 3 for average: ");
     
    
     JFrame frame = new JFrame();

     // The button to trigger the calculation
     JButton button = new JButton("Get Balance");
     frame.add(button);


   // ActionListener listener = new ButtonListener(bank);
     
    // button.addActionListener(listener);

     
     frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
    JPanel Panel = new JPanel();
  JFrame Frame = new JFrame();
  Frame.add(Panel);
     
     
   JButton button2 = new JButton("Get account");
   Panel.add(button2);
 
     
    
   }

}
