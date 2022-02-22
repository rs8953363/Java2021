package IfElse;

public class Salary {
//    Ask user to enter annual salary, if the salary is more than or equal
//    to $80.000 output will be “I accept the offer”, if the salary is between
//    $60.000 and $80.000 out put will be “I negotiate to increase”,
//    otherwise output will be “I do not accept the offer.”
public static void main(String[] args) {
    int s = 0;
    if(s>=80000) {
        System.out.println("I accept the offer!");
    }else if(s>=60000) {
        System.out.println("I want to negotiate to increase!");
    }else {
        System.out.println("I don't accept the offer!");

    }
}
}
