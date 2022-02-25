package DoWhileLoop;

public class Test {
    public static void main(String[] args) {

        String name;
        boolean init = true;
        name = "Ja Fm Kn";


        for (int i = 0; i < name.length(); i++) {
            if (init)

            System.out.print(name.charAt(i));



            if (name.charAt(i) == ' ') {

                init = true;

            }else {

                init = false;

            }

        }
    }
}

