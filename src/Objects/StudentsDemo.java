package Objects;

public class StudentsDemo {
    public static void main(String[] args) {

        Students object = new Students();

        System.out.println(object.studentNumber);
        object.addEnrollment();
        object.addEnrollment();
        object.addEnrollment();
        System.out.println(object.studentNumber);
        object.addEnrollment();
        System.out.println(object.studentNumber);
        object.removeEnrollment();
        System.out.println(object.studentNumber);
    }
}