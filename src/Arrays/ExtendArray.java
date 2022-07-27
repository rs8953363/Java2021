package Arrays;

public class ExtendArray {
    Public static void main(String[] args) {

        String [] names = new String[] { "A", "B", "C" };

        String [] extended = new String[5];

        extended [3] = "D";

        extended [4] = "E";

        System.arraycopy(names, 0, extended, 0, names.length);

//here we are extending with new array extended[3] and extended[4].

        for (String str: extended){

            System.out.println(str);

        }

    }
}
