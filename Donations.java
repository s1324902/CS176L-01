public class Donations {
	
	 private int numIndividual;
	private double amtIndividual;
	 private int numBusiness;
	 private double amtBusiness;
	 private int numOther;
	 private double amtOther;
	
	public void processDonation(String cat, double donation) {
		if (cat.equals ("<business donation")) {
			cat = "Business";
			
			if (donation > 0) {
				numBusiness = numBusiness + 1;
				amtBusiness = amtBusiness + donation;
			}
			else if (donation < 0) {
				numBusiness = numBusiness - 1;
				amtBusiness = amtBusiness + donation;
			}
		}
		else if (cat.equals("<individual donation")) {
			cat = "Individual";
			if (donation > 0) {
				numIndividual = numIndividual + 1;
				amtIndividual = amtIndividual + donation;
			}
			else if (donation < 0) {
				numIndividual = numIndividual - 1;
				amtIndividual = amtIndividual + donation;
		
			}
	
		}
		
		else if (cat.equals("<other donation")) {
			cat = "Other";
			if (donation > 0) {
				numOther = numOther + 1;
				amtOther = amtOther + donation;
			}
			else if (donation < 0) {
				numOther = numOther - 1;
				amtOther = amtOther + donation;
			}
		}
		
	}
	
	public void getStatistics() {
		
	System.out.printf("Indivdual: #%s $%.2f%n",+numIndividual, +amtIndividual);
	System.out.printf("Business: #%s $%.2f%n",+numBusiness, +amtBusiness);
	System.out.printf("Other: #%s $%.2f%n",+numOther, +amtOther);
	}
	

	
		
		
	}

