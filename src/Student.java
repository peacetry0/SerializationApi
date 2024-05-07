import java.io.Serial;
import java.io.Serializable;
// Object Serializable
//Objelerimiz Çok uzun sürede oluşuyorsa ve biz bu objelerimizi tekrar tekrar oluşturmak istemiyorsak
//1 defa oluştur dosyaya yaz ve istediğğimzi zaman kullan
public class Student implements Serializable {

// Yeni bir attirbute eklersek yeni bir version kontrol yapmalıyız Çünkü bu classla yeni bir attribute olan class farklı
    // oluyor.Yani eğer classımızı değiştireceksek bunun bir version kontrol değiştirmeliyiz.Version atamak için SerialversionUUİD kullan


    private static final long serialVersionUID = 1000 ;

     private int id  ;
     private String name ;
     private String section ;


    public Student(int id, String name, String section) {
        this.id = id;
        this.name = name;
        this.section = section;
    }

    @Override
    public String toString() {

        String informationsStudent = " Student Name : " + name +
                  "\nStudent Number : " + id  +
                " \n Student Section : " + section ;

        return informationsStudent ;
    }
}
