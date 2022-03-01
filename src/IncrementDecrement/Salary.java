package IncrementDecrement;

public class Salary {
    public static void main(String[] args) {
        //Q: Decrease Ali's salary 20% then increase it by 100 dollars.
        //   Increase Veli's salary 100 dollars then decrease it by 20%.
        //   Then compare their salaries?

        //If you multiply int by double the result will be double
        int  aliSalary;
        int veliSalary;
        aliSalary = (int)(aliSalary*0.80);
        aliSalary = aliSalary + 100;
        System.out.println("Ali Salary: " + aliSalary);

        veliSalary = veliSalary + 100;
        veliSalary = (int)(veliSalary*0.80);
        System.out.println("Veli Salary: " + veliSalary);
    }
}
