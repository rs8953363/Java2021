package LocalInstanceStatic5;

public class StaticDemo {
    public static void main(String[] args) {//You can use static methods without creating objects. Main method has to be
        // static. If it's static, then class can find main method easily from memory.

       // Static.test(); You cannot call this method by using class name as it's not static. You need to create an object to do that.
        Static.information();//You can call this method by using the class name as it's static.


        Static object1 = new Static(200, "Blue",6 );
        object1.model = 2020;

        System.out.println(object1.speed);
        System.out.println(object1.color);
        System.out.println(object1.vites);
        //System.out.println(object1.model);///You cannot use object to reach out to static variable. You call it by using the class.
        System.out.println(Static.model);
        System.out.println();

        Static object2 = new Static(100, "Yellow", 5);
        System.out.println(object2.speed);
        System.out.println(object2.color);
        System.out.println(object1.vites);
        System.out.println(Static.model);//As model is a static variable, it's same for all objects. You can call it by using class' name. You don't need to call it with object's help.
        System.out.println();

        Static object3 = new Static(150, "Green", 6);
        System.out.println(object3.speed);
        System.out.println(object3.color);
        System.out.println(object1.vites);
        System.out.println(Static.model);//If you change the value of static variable, then the value of all objects change.
        System.out.println();

    }
}
