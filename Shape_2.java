package code_problems;

/*
Output

* * * * *
* * * *
* * *
* *
*
*/

public class Main {

	public static void printShape(int rows) {
		
	    for(int i = 0; i < rows; ++i) {
	    	
	        for(int j = rows; j > i; --j) {
	        	
	            System.out.print("* ");
	        }
	        
	        System.out.println();
	    }
	}
	
	public static void main(String[] args) {
		printShape(5);
	}
}
