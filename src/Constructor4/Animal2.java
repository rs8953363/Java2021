package Constructor4;

public class Animal2 {
        public String name ;
        public int weight ;
        public boolean herbivorous ;

        public Animal2() {

            System.out.println("1st constructor is executed");
        }
        public Animal2(String name) {
            this("Ali",25,true);
            System.out.println("2nd constructor is executed");
            this.name = name;
        }
        public Animal2(String name, int weight) {
            //this("Dog");
            System.out.println("3rd constructor is executed");
            this.name = name;
            this.weight = weight;
        }
        public Animal2(String name, int weight, boolean herbivorous) {
            //this("Sam");
            System.out.println("4rd constructor is executed");
            this.name = name;
            this.weight = weight;
            this.herbivorous = herbivorous;
        }

        public static void main(String[] args) {

            Animal2 dog1=new Animal2("Mark",34,false);
            System.out.println(dog1.name);//Mark
            System.out.println(dog1.weight);
            System.out.println(dog1.herbivorous);
        }
    }

