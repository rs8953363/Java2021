package WrapperClasses1;

public class ParseEx {
    public static void main(String[] args) {
        int number1 = 50;
        short number2 = 40;
        System.out.println(number1);
        System.out.println(number2);

        number2 = (short) number1;
        System.out.println(number2);
        System.out.println();

        int maximumNumber = Integer.max(750, 100);
        System.out.println(maximumNumber);
        System.out.println();

       // parse and valueOf methods can be used to convert string to an integer
        String age = "50"; //This is a string

        int convertedNumber = Integer.parseInt("60");
        int covertedAge = Integer.parseInt(age);
        System.out.println(convertedNumber);
        System.out.println(covertedAge);
        System.out.println();

        String result = "false"; //text
        boolean resultBoolean = Boolean.parseBoolean("true");
        System.out.println(result);
        System.out.println(resultBoolean);

        char newChar = Character.valueOf('d');
        System.out.println(newChar);
        System.out.println();

        int number3 = 85;
        String word = String.valueOf(number3); //not very preferable. Instead, you can use the following form
        String word2 = 85 +"";
        String word3 = "" +85; //Sum of an integer and String is always String
        System.out.println(word);
        System.out.println(word2);
        System.out.println(word3);


    }
}
