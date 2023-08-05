package packg;

public class Main {


	public static void print_shape(int rows, char frame, char fill)
	{
	    for(int i = 0; i < rows + 2; ++i) {
	        System.out.printf("%c ", frame);
	    }
	    
	    System.out.println();

	    for(int j = 0; j < rows; ++j) {
	    	System.out.printf("%c ", frame);

	        for(int k = 0; k < rows; ++k) {
	        	System.out.printf("%c ", fill);
	        }
	        
	        System.out.printf("%c", frame);

	        System.out.println();
	    }

	    for(int i = 0; i < rows + 2; ++i)
	    	System.out.printf("%c ", frame);

	}
	
	public static void main(String[] args) {
		print_shape(5, '#', '$');
	}
}
