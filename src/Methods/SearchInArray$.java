package Methods;

public class SearchInArray$ {
    public static void main(String[] args) {
        int[] numbers1 = {20, 30, 40};
        check(40, numbers1);
        int wantedNumber1 = 90;
        check(wantedNumber1, numbers1);

        int[] numbers2 = {50, 70, 90};
        int wantedNumber2 = 90;
        check(wantedNumber2, numbers2);

    }
    public static void check(int wantedNumber, int[] array){

        boolean exist = false;
        for(int number: array){
            if(number==wantedNumber){
               exist= true;
                break;
        }
        }
        System.out.println("Does it exist? "+exist);
    }
}
