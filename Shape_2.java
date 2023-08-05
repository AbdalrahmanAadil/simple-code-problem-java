package packg;

public class Main {

	public static void print_shape(int rows) {
		
	    for(int i = 0; i < rows; ++i) {
	    	
	        for(int j = rows; j > i; --j) {
	        	
	            System.out.print("* ");
	        }
	        
	        System.out.println();
	    }
	}
	
	public static void main(String[] args) {
		print_shape(5);
	}
}
