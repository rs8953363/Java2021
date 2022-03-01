package IncrementDecrement;

public class IncrementDecrementOperators {
    public static void main(String[] args) {

        int age = 12;
        System.out.println("Before increment: " + age);

        //How to increase the value of a variable by addition

        //1.Way
        age = age + 3;
        System.out.println("After increment: " + age);
        //2.Way
        age+=5;
        System.out.println("After 2nd increment: " + age);
        //3.Way: This is used just to increase by 1
        age++;
        System.out.println("After 3rd increment: " + age);

        int salary = 1000;
        System.out.println("Before increment: " + salary);

        //How to increase the value of a variable by multiplication
        //1.Way
        salary = salary * 2;
        System.out.println("After increment: " + salary);

        //2.Way
        salary*=3;
        System.out.println("After 2nd increment: " + salary);



//        //How to decrease the value of a variable by subtraction
//        //1.Way
//        weight = weight - 20;
//        System.out.println("After decrement: " + weight);//100
//        //2.Way
//        weight-=10;
//        System.out.println("After 2nd decrement: " + weight);//90
//        //3.Way: This is used just to decrease by 1
//        weight--;
//        System.out.println("After 3rd decrement: " + weight);//89
    }
}

