import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class DonationsTester {

	public static void main(String[] args)throws FileNotFoundException {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to process donations now?(enter 'Yes' to continue):");
		String response;
		response = sc.next();
		if(response.equalsIgnoreCase("no")){
            System.out.println("Ending now without processing donations");
        }else {
        	
        File inputFile = new File("Donations.txt");
        Donations giveToMe = new Donations();
		Scanner in = new Scanner(inputFile);
		while (in.hasNextLine()) {
		String what = in.nextLine();
		String []result = what.split(">");
		
		if (what.contains("EOF")){
			break;
			
		}
		double num = Double.parseDouble(result[1]);
		giveToMe.processDonation(result[0], num);
		}
		giveToMe.getStatistics();

		}	
	


	}
    }


		


