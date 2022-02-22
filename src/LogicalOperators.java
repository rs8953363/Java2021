public class LogicalOperators {

	/*
	  Operators in Java

	  1) = is assignment operator.
	     Gets the value from right and puts it into container on the left
	     For example; int s = 12;

	  2) == is equal sign in Java
	     5 == 2+3 returns boolean.
	     If left part equals to right part, it returns "true", otherwise it returns false

	  3) != means "not equal"
	     != returns boolean.
	     If left part does not equal to right part, it returns "true", otherwise it returns false
	     Note: ! ==> Not

	  4) > means greater than
	     > returns boolean

	  5) < means less than
	     < returns boolean

	  6) >= means greater than or equal to
	     >= returns boolean

	  7) <= means less than or equal to
	     <= returns boolean

	  8) && AND operator
	     && returns true if everything is true

	  9) || OR operator
	     || returns false if everything is false

	  10) & AND operator
	      & returns true if everything is true
	 */

        public static void main(String[] args) {

            System.out.println(5 == 2+3);

            System.out.println(5 != 2+4);

            System.out.println(5 > 13);

            System.out.println(5 >= 5);

            System.out.println(5 <= 13);

            System.out.println((5<7) && (3>1) && (4==5));//false

            System.out.println((15<7) || (3>10) || (4==5) || (11<4));

            //What is the difference between && and &
            System.out.println((5>7) & (3>1) & (4==4));
            System.out.println((5>7) && (3>1) && (4==4));
            System.out.println();

            System.out.println("ali" == "ali");//true
            System.out.println("Ali" == "ali");//false
            System.out.println("ali".equals("ali"));//true
            System.out.println("Ali".equals("ali"));//false

        }

}
