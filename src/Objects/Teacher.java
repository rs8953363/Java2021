package Objects;

import java.sql.*;

public class Teacher {
    String name = "George";
    int age = 34;
    String  subject = "Math";

    void teacherInfo(){
        System.out.println("Name: "+name+ " \nAge: "+age+" \nSubject: " +subject);
    }
}
