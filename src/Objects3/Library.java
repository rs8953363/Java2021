package Objects3;

public class Library {
    int bookNumber = 400;
    String openingHour = "09:00 am";
    String closingHour = "08:00 pm";

    public static void main(String[] args) {
        Library object = new Library();
        System.out.println(object.bookNumber);
        System.out.println(object.openingHour);
        System.out.println(object.closingHour);
    }

}
