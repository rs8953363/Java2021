package Methods;

public class ContainsBothCharNumber {
    public static void main(String[] args) {
        boolean word1 = anyNumChar("Asd");
        System.out.println(word1);
        boolean word2 = anyNumChar("Sdf&234");
        System.out.println(word2);

    }
    public static boolean anyNumChar(String str){
        boolean isNumber = false;
        boolean isLetter = false;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='0' && str.charAt(i)<='9') {
                isNumber = true;
            }else if ((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z')) {
                isLetter = true;
            }
        }

            boolean result = isNumber && isLetter;
            return result;
    }
}
