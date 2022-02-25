package DoWhileLoop;

public class InstanceLocalAndClassVariables {
    	/*
	 	1)If a variable is created
	 		a)inside the class but outside the main method and
	 		b)it is not "static"
	 	  then it is called "Instance(Object) Variable"
	 	Note: If you do not assign any value for an instance variable, Java assigns "0" for it, if the variable is a number
	 		  The values which Java assigns are called "default value"

	    2)If a variable is created
	    	a)inside the class but outside the main method and
	 		b)it is "static"
	 	  then it is called "Class Variable"
	 	Note: The main differences between "static(class)" and "instance(object)" variables is that
	 			a)All updates on a static variable is visible by all objects which are created from the class but
	 			  all updates on an "instance variable" is visible just by the object
	 			b)"static variables" are common for all objects, but instance variables are specified for an object

	    3) If a variable is created inside a method, it is called "local variable"
	       Note: For "local variables", there is no default value.
	             You have to assign value, when you create a local variable
	       Note: "local variables" which are created in a "static method" are "static" automatically.

	*/

    int i = 12; //This is instance variable
    int k; //This is instance variable
    String str;//This is instance variable, default value for str is null
    boolean bl;//This is instance variable, default value for bl is false
    char ch;//This is instance variable, default value for ch is ''

    static byte by;//This is static variable, default value for by is 0
    public static void main(String[] args) {
        short sh = 11;//This is "local variable"
        sh++;

    }




     /*
     ====Instance(Object) Variables=======
     ->We create instance variables inside the class but outside of the methods
     ->If you don't initialize, (assigning value) an instance variable, Java will assign them
     default values.
     ->Instance variables are not static
     ->To access instance variables you need to create an object
       You can not access  instance variables by class name
         Default values:
         For byte, short, int, long default value is 0
         For char default value is ''
         For boolean default value is false
         For float, double default value is 0.0
         For String default value is null

     ====Class Variables===========
     ->We create class variables inside the class but outside of the methods
     ->Class variables are 'static'
     ->You can access class variables by using class name

     Note: The main differences between static(class) variables and instance (object) variables is that
          a)All updates on a static variable is visible by all objects which are created from class but all
          updates  on an instance variables is visible just by only object

          b)static variables are common for all objects but instance variables are specified for an object


          =====Local Variable=====
          If you create a variable inside a method it is called "local variable"
          We have to initialize local variables
          There is no default value for local variables

     Note: Local variables which are created in static methods are static automatically.
     */


    int num1 = 5;//Instance variable
    int num2;   //Instance variable (no need to assign , it will assigned by default)
    String str; //Instance variable (no need to assign , it will assigned by default)
    double d;   //Instance variable (no need to assign , it will assigned by default)
    char c;     //Instance variable (no need to assign , it will assigned by default)

    static short s; //Class variable
    static int h;


    public static void main(String[] args) {
        System.out.println(InstanceLocalAndClassVariables.h);
        long l1 = 9;
        System.out.println(l1);
    }


    public  int add(int a, int b) {
        return a+b;
    }
}
}

