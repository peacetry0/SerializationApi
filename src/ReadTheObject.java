import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadTheObject {

    public static void main(String[] args) {



        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("student.bin"))){

           Student[] students =(Student[])input.readObject() ;
           List<Student> studentList =(ArrayList<Student>) input.readObject() ;


           for (Student student : students){
               System.out.println(student);
               System.out.println("------------------");
           }
            System.out.println("**************************** Arraylist");

            for (Student student : studentList){
                System.out.println(student);
                System.out.println("------------------");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found ");
        } catch (IOException e) {
            System.out.println("IOEXCEPTION occurred while opening the file");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        }
    }
}
