import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadTheObject {

    public static void main(String[] args) {



        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("student.bin"))){

             Student student =(Student)input.readObject() ;
             Student student1 =(Student)input.readObject() ;


            System.out.println(student);
            System.out.println("----------------------------");
            System.out.println(student1);

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found ");
        } catch (IOException e) {
            System.out.println("IOEXCEPTION occurred while opening the file");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        }
    }
}
