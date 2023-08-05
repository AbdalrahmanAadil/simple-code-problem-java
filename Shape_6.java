package packg;

public class Main {

	public static void print_shape(int rows, char[] chars, char defaultFill) {
		
	    for (int i = 0; i < rows; ++i) {
	    	
	        for (int j = 0; j < rows; ++j) {
	        	
	        	char c = defaultFill;
	        	
	        	for(int m = 0, e = 1; m < chars.length; m++, e++) {
	        		
	        		if ( (j == m) || (i == m) || j == rows - e || (i == rows - e)) {
		            	c = chars[m];
		            	break;
		            }
	        	}
	        	
	            System.out.printf("%c ", c);
	        }
	        
	        System.out.println();
	    }
	}
	
	public static void main(String[] args) {
		print_shape(10, new char[]{'+', '%', '/', '#'}, '/');
	}
}
