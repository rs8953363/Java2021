package Constructor4;

public class Animal {

        public String name = "Joe";
        public int weight = 78;
        public boolean herbivorous = false;

        public Animal() {

        }
        public Animal(String name) {
            this.name = name;
        }
        public Animal(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }
        public Animal(String name, int weight, boolean herbivorous) {
            this.name = name;
            this.weight = weight;
            this.herbivorous = herbivorous;
        }

        public static void main(String[] args) {

        }
    }
