package LocalInstanceStatic5;

public class PrivateDemo {
    public static void main(String[] args) {
        /*private, defauly, protected, and public determines how you can access to variables and methods.
         */
   Private object = new Private();
       // System.out.println(object.IDnumber); If you make IDnumber variable private, you cannot access it from this class.
        //You need to be in that class to have access to it.
        System.out.println(object.name);
        System.out.println(object.age);

        object.test();
       // object.information();This line gives compilation error as information method is private.

    }
}
