package OOP5;

public class GetterSetter3 {
    private  int age = 20;
    private String name = "Herry";
    private  long IDNumber = 123123123l;

    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        if (age < 18) {
            this.age = 18;
        } else {
            this.age = age;//Assign given parameter to the age variable defined on the top of this class.
        }
    }
        public String getName(){
            return name;
        }
    }
