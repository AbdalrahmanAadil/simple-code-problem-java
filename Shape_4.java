package code_problems;

// Output

/*

# # # # $ $ $ $ 
# # # # $ $ $ $ 
# # # # $ $ $ $ 
# # # # $ $ $ $ 
$ $ $ $ # # # # 
$ $ $ $ # # # # 
$ $ $ $ # # # # 
$ $ $ $ # # # #

*/

public class Main {


	public static void printShape(int rows, char a, char b)
	{
	    if (!(rows % 4 == 0)) {
	    	System.out.println("The number of rows should be divisible by 4.");
	        return;
	    }

	    final int half_rows = rows / 2;

	    int iterations = 2;
	    
	    while( iterations > 0)
	    {
	        for(int i = 0; i < half_rows; ++i)
	        {
	            for(int j = 0; j < half_rows; ++j) {
	                System.out.printf("%c ", a);
	            }

	            for(int j = 0; j < half_rows; ++j) {
	            	System.out.printf("%c ", b);
	            }
	            System.out.println();
	        }
	        
	        // swap characters
		    char temp = a; a = b; b = temp;
	        --iterations;
	    }
	}
	
	public static void main(String[] args) {
		printShape(7, '#', '$');
	}
}
