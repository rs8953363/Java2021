package Methods2;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(6));

        }
        public static long fact(int num){
            long result = 1;
            for (int i = 1; i <=num; i++) {
                result = result * i;
        }
        return result;
    }
}
