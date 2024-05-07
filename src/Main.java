import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Main {

    public static void main(String[] args) {


        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.bin"))){

             Student student = new Student(1,"Barış Yazman","Computer engineer") ;
             Student student1 = new Student(2,"Ali Yazman","Math") ;

            out.writeObject(student);
            out.writeObject(student1);

        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            System.out.println("IOException occurred while opening the file");
        }

    }
}