
public class Microwave {
		private int time;
		private int powerlevel;
		
		
		public Microwave() {
				time = 0;
				powerlevel = 1;
		}
		public void start() {
			System.out.println("Cooking for " + time + " seconds at level " + powerlevel + ".");
			
		}
		public void Time() {
			time += 30;
			System.out.println("Time button was pressed. Time is " + time + " seconds.");
		}
		public void PowerSwitch() {
			if(powerlevel == 1);
			powerlevel += 1;
			System.out.println("Power button was pressed. Power level is " + powerlevel + ".");
				
			System.out.println("Time button was pressed. Time is " + time + " seconds.");
}
		public void reset() {
			time = 0;
			powerlevel = 1;
			System.out.println("Reset button was pressed. Power level is " + powerlevel + ". Time is " + time +" seconds.");
			
		}
}
