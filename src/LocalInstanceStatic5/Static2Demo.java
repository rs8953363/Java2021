package LocalInstanceStatic5;

public class Static2Demo {

    int number = 99;//This number variable and main method is created in the memory
    public static void main(String[] args) {
        System.out.println("Main method");
        System.out.println(Static2.model);//You can call model variable by using class name, because, it's static.
    //First static variables, methods and main method(as it's static) are added to the memory before program starts  working.
        // Then the program starts. And then it creates the number variable in the memory.
        //If you create an object, It adds the other variables (seed and color) to the memory.
        //System.out.println(number); You cannot call a non-static variable in static main method.If you want to use it you need to make variable static.
   //deneme(); You cannot call this non-static method in static main class.
    }
    public void test(){

    }
}
//The static method can not use non static data member or call non-static method directly.
//this and super cannot be used in static context. A non-static method cannot be used in static method.