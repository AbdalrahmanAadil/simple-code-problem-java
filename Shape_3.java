package packg;

public class Main {

	public static void print_shape(int rows, char a, char b) {
	    for (int i = 0; i < rows; ++i) {
	        
	    	for (int j = rows; j > i; --j) {
	        	System.out.printf("%c ", a);
	        }
	        
	        for(int j = 0; j < i + 1; ++j ) {
	        	System.out.printf("%c ", b);
	        }
	        
	        System.out.printf("\n");
	    }
	}
	
	public static void main(String[] args) {
		print_shape(5, '%', '$');
	}
}
