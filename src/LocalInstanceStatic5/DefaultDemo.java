package LocalInstanceStatic5;

public class DefaultDemo {
    public static void main(String[] args) {
        //You can access to default access modified from the same class or same package
        Default object = new Default();
        System.out.println(object.pageNumber);
    }
}
