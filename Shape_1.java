package code_problems;

/*
Output

* 
* * 
* * * 
* * * * 
* * * * *
*/

public class Main {

	public static void printShape(int rows) {
		
	    for(int i = 0; i < rows; ++i) {
	        for(int j = 0; j < i + 1; ++j) {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
	
	public static void main(String[] args) {
		printShape(5);
	}
}
