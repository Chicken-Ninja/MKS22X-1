public class QueenBoardDriver{

    // Driver by Crystal (https://groups.google.com/a/stuy.edu/d/msgid/apcs2017-konstantinovich/d22318bc-95f1-4e6c-8bea-fc8612ff881b%40stuy.edu?utm_medium=email&utm_source=footer)
    public static void main(String[] args){
	QueenBoard b = new QueenBoard(15);

	System.out.println(b.solve()); //prints true
	System.out.println(b); //prints a valid solution

	try{
	    b.solve();
	}catch(IllegalStateException e){
	    System.out.println("Error: The board contains non-zero values");
	} //prints "Error: The board contains non-zero values"

	try{
	    b.countSolutions();
	}catch(IllegalStateException e){
	    System.out.println("Error: The board contains non-zero values");
	} //prints "Error: The board contains non-zero values"

	for (int i = 0; i < 12; i++){
	    QueenBoard a = new QueenBoard(i);
	    System.out.println("# of Solutions for " + i + ": " + a.countSolutions());
	    /*          Expected Values
			i --> # of Solutions   i --> # of Solutions
			0 --> 1                      6 --> 4
			1 --> 1                      7 --> 40
			2 --> 0                      8 --> 92
			3 --> 0                      9 --> 352
			4 --> 2                    10 --> 724
			5 --> 10                  11 --> 2680
	    */
	    System.out.println(a); //prints out an empty i by i grid of underscores
	}
    
    }
}
