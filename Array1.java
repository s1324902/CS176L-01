
public class Array1 {

	public static void main(String[] args) {
	double [] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
	for(double value : values) {
		System.out.printf("%s ", value);
	}
	System.out.print("\n");
	
	double largest = values[0];
	for(double value : values) {
		if(value > largest) {
			largest = value;
		}
	
	}
	System.out.printf("The largest element in the array is "+largest);
	System.out.print("\n");
	int negative = 0;
	for(double value : values) {
		if(value < 0) {
			negative += 1;
			
		}
	}
	System.out.printf("There are "+negative+" negative numbers in the array");
	}

}
