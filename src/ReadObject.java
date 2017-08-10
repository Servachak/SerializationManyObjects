import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/**
 * Created by adavi on 10.08.2017.
 */
public class ReadObject {

    public static void main(String[] args) {

        try {
            FileInputStream inputStream = new FileInputStream("people.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            /** ----------- Читання масива people як обєкта Person з файлу "people.bin" почергово ----------**/

            /**  Person [] people = (Person) objectInputStream.readObject();  **/

            /** ----------- Читання масива people як обєкта Person з файлу "people.bin" почергово ----------**/




            /** ----------- Читання кожного обєкта Person з файлу "people.bin" почергово ----------**/

            int personCount = objectInputStream.readInt();
            Person [] people = new Person[personCount];

            for (int i= 0; i < personCount; i++){
                people[i] = (Person) objectInputStream.readObject();

            }
            /** ----------- Читання кожного обєкта Person з файлу "people.bin" почергово ----------**/

            System.out.println(Arrays.toString(people));
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
