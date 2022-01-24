package OOP5;

public class GetterSetterDemo3 {
    public static void main(String[] args) {

        GetterSetter3 object = new GetterSetter3();
        //object.age; You cannot call this variable as it's private. You can only call it with setter method
        System.out.println(object.getAge());
        object.setAge(25);
        System.out.println(object.getAge());
        System.out.println(object.getName());



    }
}
