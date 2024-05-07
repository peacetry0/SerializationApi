import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Student student = new Student(1234,"Peace","Computer") ;
        Student student1 = new Student(234,"Ali","Civil ") ;

        Student student2 = new Student(345,"Emre","Literature") ;
        Student student3 = new Student(456,"Onur","Education ") ;

          Student[] students = {student,student1,student2,student3} ;

          List<Student> studentList = new ArrayList<>(Arrays.asList(students)) ;


        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.bin"))){

             out.writeObject(students);
             out.writeObject(studentList);

        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            System.out.println("IOException occurred while opening the file");
        }

    }
}