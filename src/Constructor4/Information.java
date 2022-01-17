package Constructor4;

public class Information {
    int number = 20;
    String name = "Craig";

    public Information(){//Constructors don't have any return types. So don put, int, boolean String even void
        number =25;// If you write this as int number = 25, then print statement in nformationDemo class gives original
        // value(int = 20) as an output
        name= "Charlie";
    }
}
